package juc.waitnotify;

/**
 * 生产者消费者模型用例：等待唤醒机制实现线程的同步，synchronized实现资源的互斥访问 !如何调整生产者与消费者的速度，使其达到一个动态平衡
 * 
 * @date 2017年12月19日 下午4:06:14
 * @author 李桥
 * @version 1.0
 */

public class ProducerConsumerTest {
	public static void main(String[] args) {
		Container container = new Container();
		for (int i = 1; i < 100; i++) {
			if (i % 6 != 0) {
				new Thread(new Producer(container), "生产者线程-" + i).start();
			} else {
				new Thread(new Consumer(container), "消费者线程-" + i).start();
			}
		}
	}
}

class Container {
	private Integer productNum = 0;
	private static final int max_product_Num = 10;

	public synchronized void produce() {
		/**
		 * wait方法存在虚假唤醒问题，wait应该放到循环体内
		 * 
		 * <pre>
		 *     synchronized (obj) {
		 *         while (&lt;condition does not hold&gt;)
		 *             obj.wait();
		 *         ... // Perform action appropriate to condition
		 *     }
		 * </pre>
		 * 
		 * 
		 */
		while (this.productNum >= Container.max_product_Num) {
			System.err.println(Thread.currentThread().getName() + ",产品已满！");
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.err.print(Thread.currentThread().getName() + ",生产一个产品" + "!");
		this.productNum++;
		System.err.println(Thread.currentThread().getName() + ",当前容器产品数量：" + this.productNum.toString());
		this.notifyAll();

	}

	public synchronized void consume() {

		while (this.productNum <= 0) {
			System.err.println(Thread.currentThread().getName() + ",产品已空！");
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.productNum--;
		System.err.print(Thread.currentThread().getName() + ",消费了一个产品" + "!");
		System.err.println(Thread.currentThread().getName() + ",当前容器产品数量：" + this.productNum.toString());
		this.notifyAll();

	}
}

class Producer implements Runnable {
	private Container container;

	public Producer(Container container) {
		this.container = container;
	}

	@Override
	public void run() {
		this.container.produce();
	}
}

class Consumer implements Runnable {
	private Container container;

	public Consumer(Container container) {
		this.container = container;
	}

	@Override
	public void run() {
		this.container.consume();
	}

}