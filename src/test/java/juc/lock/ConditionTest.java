package juc.lock;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.apache.commons.lang.StringUtils;

/**
 * 
 * 实现功能：建立三个线程A、B、C，A线程打印10次字母A，B线程打印10次字母B,C线程打印10次字母C，但是要求三个线程同时运行，并且实现交替打印，
 * 即按照ABCABCABC的顺序打印。
 * 
 * @date 2017年12月21日 上午7:38:39
 * @author 李桥
 * @version 1.0
 */

public class ConditionTest {
	public static void main(String[] args) {
		final Printer printer = new Printer();
		final AtomicInteger i = new AtomicInteger(1);
		for (; i.get() <= 10; i.incrementAndGet()) {
			new Thread(new Runnable() {

				@Override
				public void run() {
					printer.printABC(i.get(), "A");
				}
			}, "A").start();
			new Thread(new Runnable() {

				@Override
				public void run() {
					printer.printABC(i.get(), "B");
				}
			}, "B").start();
			new Thread(new Runnable() {

				@Override
				public void run() {
					printer.printABC(i.get(), "C");
				}
			}, "C").start();

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}

class Printer {
	private String current;
	private Lock l = new ReentrantLock();
	private Condition conditionA = this.l.newCondition();
	private Condition conditionB = this.l.newCondition();
	private Condition conditionC = this.l.newCondition();

	public void printABC(int turnCounter, String printStr) {
		try {
			this.l.lock();
			if (StringUtils.equals(printStr, "A")) {
				this.onlyPrintOut(turnCounter, printStr);
				this.conditionB.signal();
			} else if (StringUtils.equals(printStr, "B")) {
				this.onlyPrintOut(turnCounter, printStr);
				this.conditionC.signal();
			} else if (StringUtils.equals(printStr, "C")) {
				this.onlyPrintOut(turnCounter, printStr);
				this.conditionA.signal();
			}
		} catch (Exception e) {

		} finally {
			this.l.unlock();
		}

	}

	private void onlyPrintOut(int turnCounter, String printStr) {
		System.err.println(Thread.currentThread().getName() + "-线程" + "，第" + turnCounter + "轮打印-----" + printStr + "");
	}

}
