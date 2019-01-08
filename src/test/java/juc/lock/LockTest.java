package juc.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 
 * 实现多线程并发要注意以下两点，请注意资源互斥访问与线程同步的区别：
 * 1、实现多线程对资源的互斥访问:synchronized(同步代码块、同步方法这是一种隐式锁) lock(显示锁) threadLocal
 * 
 * 2、多线程的同步问题:wait/notify countdownlatch blockingqueue
 * 
 * @date 2017年12月19日 下午2:36:40
 * @author 李桥
 * @version 1.0
 */

public class LockTest {
	private static Integer initTicketNumber = 100;

	public static void main(String[] args) {
		for (int i = 1; i < 200; i++) {
			new Thread(new SaleTicketThread()).start();
		}
	}

	static class SaleTicketThread implements Runnable {
		Lock saleTicketLock = new ReentrantLock();

		@Override
		public void run() {
			while (true) {
				try {
					this.saleTicketLock.lock();
					if (LockTest.initTicketNumber <= 0) {
						System.err.println("票已经卖完了！");
						return;
					}
					System.err.println(Thread.currentThread().getName() + "卖了一张票，余票为" + --LockTest.initTicketNumber);
					Thread.currentThread();
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} finally {
					this.saleTicketLock.unlock();
				}
			}
		}

	}
}
