package juc.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * 
 * Callable以及FutureTask可以实现线程的同步，功能类似于CountDownLatch
 * 
 * @date 2017年12月19日 下午3:27:35
 * @author 李桥
 * @version 1.0
 */
public class CallableTest {
	private static Integer initTicketNumber = 100;

	public static void main(String[] args) {
		SumCallable callable = new SumCallable();
		FutureTask<Integer> futureTask = new FutureTask<Integer>(callable);
		new Thread(futureTask).start();
		try {
			// futureTask执行完毕之后，futureTask.get()这个方法会一直拥塞下去，直到futureTask所绑定的Callable的call方法执行完成
			Integer sum = futureTask.get();
			System.err.println("求和为：" + sum);
			System.err.println("结束----------------------");

		} catch (Exception e) {

		}

	}

	static class SumCallable implements Callable<Integer> {

		@Override
		public Integer call() throws Exception {
			System.err.println("开始----------------------");
			int sum = 0;
			for (int i = 1; i < 20; i++) {
				sum += i;
				Thread.sleep(100);
			}
			return sum;
		}
	}
}
