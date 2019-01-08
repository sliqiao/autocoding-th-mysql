package juc.countdownlatch;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 请输入功能
 * 
 * @date 2017年12月18日 上午10:06:43
 * @author 李桥
 * @version 1.0
 */

public class SumWorker extends Thread {
	private static Logger s_logger = LoggerFactory.getLogger(SumWorker.class);
	private CountDownLatch countDownLatch;
	private String name;
	private int start;
	private int end;
	private Map<String, Object> statMap = new HashMap<String, Object>();

	public String getStatString() {
		return String.format("计数从%d-%d，和为：%s，线程名称：%s", this.start, this.end, this.statMap.get(Const.sum), this.name);
	}

	public SumWorker(int start, int end, String name, CountDownLatch countDownLatch) {
		super();
		this.start = start;
		this.end = end;
		this.name = name;
		this.countDownLatch = countDownLatch;
	}

	public static interface Const {
		public String name = "name";
		public String sum = "sum";
		public String id = "id";
		public String start = "start";
		public String end = "end";
	}

	@Override
	public void run() {
		int sum = 0;
		for (int i = this.start; i <= this.end; i++) {
			sum += i;
		}

		SumWorker.this.statMap.put(Const.name, this.name);
		SumWorker.this.statMap.put(Const.sum, sum);
		SumWorker.this.statMap.put(Const.start, this.start);
		SumWorker.this.statMap.put(Const.end, this.end);
		System.err.println(Thread.currentThread().getName() + "计算结果完毕!" + this.getStatString());
		this.countDownLatch.countDown();

	}
}
