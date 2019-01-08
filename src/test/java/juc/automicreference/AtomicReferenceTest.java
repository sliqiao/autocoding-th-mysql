package juc.automicreference;

import java.util.concurrent.atomic.AtomicReference;

/**
 * 原子引用测试
 * 
 * @date 2017年12月18日 上午10:06:32
 * @author 李桥
 * @version 1.0
 */

public class AtomicReferenceTest {
	private static User user = new User(1, "oldUser");

	public static void main(String[] args) {
		final AtomicReference<User> userAR = new AtomicReference<User>(AtomicReferenceTest.user);
		final User newUser = new User(1, "newUser");
		for (int i = 1; i <= 10; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					if (userAR.compareAndSet(AtomicReferenceTest.user, newUser)) {
						System.err.println(Thread.currentThread().getName() + "修改成功！");
						System.err.println("新值：" + userAR.get().getName());
					}
				}
			}).start();
		}
	}
}
