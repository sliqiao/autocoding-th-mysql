package vm;

import java.util.ArrayList;
import java.util.List;

/**
 * @function
 * @date 2017年7月19日 下午6:37:04
 * @author 李桥
 * @version 1.0
 */

public class HeapOOM {
	private static final int _1MB = 1024 * 1024;

	/**
	 * 
	 * @function:
	 * @param args
	 *            void
	 * @throws InterruptedException
	 * @throws
	 * @author 李桥
	 * @Date 2017年7月19日 下午6:37:04
	 */
	public static void main(String[] args) throws InterruptedException {
		List<OOMObject> list = new ArrayList<OOMObject>();

		for (int i = 1; i < 50000; i++) {
			list.add(new OOMObject());
			System.err.println("正在执行第【" + i + "】次!");
			if (i % 1000 == 0) {
				Thread.sleep(1000 * 2);
			}

		}

	}

	static class OOMObject {
		private byte[] bigSize = new byte[HeapOOM._1MB];
	}

}
