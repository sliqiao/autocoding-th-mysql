package juc.lock;

import java.util.Random;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 读写锁案例：
 * 
 * @date 2017年12月22日 上午8:06:25
 * @author 李桥
 * @version 1.0
 */

public class ReadWriteLockTest {
	public static void main(String[] args) {
		final SharedData sharedData = new SharedData();
		for (int i = 1; i <= 5; i++) {
			new Thread(new Runnable() {

				@Override
				public void run() {
					sharedData.readData();
				}
			}, "read-thread-" + i).start();
		}
		for (int i = 1; i <= 5; i++) {
			new Thread(new Runnable() {

				@Override
				public void run() {
					sharedData.writeData(new Random().nextInt(100));
				}
			}, "write-thread-" + i).start();
		}
	}
}

/**
 * 共享数据，只能有一个线程能写该数据，但可以有多个线程同时读该数据 请输入功能
 * 
 * @date 2017年12月22日 上午8:22:45
 * @author 李桥
 * @version 1.0
 */
class SharedData {
	private int index = 1;
	private ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

	// 上读锁，其他线程只能读不能写
	public void readData() {
		try {
			this.readWriteLock.readLock().lock();
			System.out.println(String.format("----线程【%s】开始读取数据----", Thread.currentThread().getName()));
			Thread.sleep((1 * 5000));
			System.out.println(String.format("             线程【%s】正在读取数据index=%d", Thread.currentThread().getName(),
					this.index));
			System.out.println(String.format("----线程【%s】结束读取数据----", Thread.currentThread().getName()));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			this.readWriteLock.readLock().unlock();
		}
	}

	public void writeData(int i) {
		try {
			this.readWriteLock.writeLock().lock();
			System.out.println(String.format("----线程【%s】开始写数据----", Thread.currentThread().getName()));
			Thread.sleep((1 * 5000));
			System.out.println(String.format("           线程【%s】正在写数据index=%d", Thread.currentThread().getName(), i));
			this.index = i;
			System.out.println(String.format("----线程【%s】结束写数据----", Thread.currentThread().getName()));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			this.readWriteLock.writeLock().unlock();
		}
	}
}
