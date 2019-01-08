package juc.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池的使用案例
 * 
 * @date 2017年12月19日 下午5:20:37
 * @author 李桥
 * @version 1.0
 */

public class ThreadPoolTest {
	public static void main(String[] args) {
		// 第一步：创建线程池
		ExecutorService threadPool = Executors.newFixedThreadPool(10);
		// 第二步：向线程池提交任务
		SimpleThread simpleThread = new SimpleThread();
		for (int i = 1; i < 20; i++) {
			threadPool.submit(simpleThread);
		}
		// 第三步：销毁线程池，这一步很重要，通常在应用容器关闭时调用
		threadPool.shutdown();
	}
}

class SimpleThread implements Runnable {
	private int i = 0;

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "，序号：" + this.i);
		this.i++;

	}
}
