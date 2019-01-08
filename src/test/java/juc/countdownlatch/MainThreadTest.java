package juc.countdownlatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 请输入功能
 * 
 * @date 2017年12月18日 上午10:06:32
 * @author 李桥
 * @version 1.0
 */

public class MainThreadTest {
	private static Logger s_logger = LoggerFactory.getLogger(MainThreadTest.class);
	private static CountDownLatch countDownLatch = new CountDownLatch(2);

	public static void main(String[] args) throws Exception {
		SumWorker sumWorker1to50 = new SumWorker(1, 50, "计算1到51", MainThreadTest.countDownLatch);
		SumWorker sumWorker51to100 = new SumWorker(51, 100, "计算51到100", MainThreadTest.countDownLatch);
		ExecutorService executorService = Executors.newFixedThreadPool(2, new NamedThreadFactory("sum"));
		executorService.execute(sumWorker1to50);
		executorService.execute(sumWorker51to100);
		Thread.currentThread();

		MainThreadTest.countDownLatch.await();
		System.err.println("总计算结果：" + sumWorker1to50.getStatString() + "||||||" + sumWorker51to100.getStatString());
	}
}
