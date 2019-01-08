package designpattern.singleton.subject2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 多例模式
 * 
 * @date 2017年11月24日 上午10:49:41
 * @author 李桥
 * @version 1.0
 */

public class MultiSingleton {
	private static final int MAX_COUNT = 10;
	private static List<MultiSingleton> instanceList = new ArrayList<>(MultiSingleton.MAX_COUNT);
	static {
		for (int i = 1; i <= MultiSingleton.MAX_COUNT; i++) {
			MultiSingleton.instanceList.add(new MultiSingleton());
		}
	}

	private MultiSingleton() {

	}

	public static MultiSingleton getInstance() {
		Random random = new Random();
		int index = random.nextInt(10);
		return MultiSingleton.instanceList.get(index);
	}
}
