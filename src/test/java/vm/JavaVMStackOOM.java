package vm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 请输入功能
 * 
 * @date 2017年12月4日 下午2:59:44
 * @author 李桥
 * @version 1.0
 */

public class JavaVMStackOOM {
	private static Logger s_logger = LoggerFactory.getLogger(JavaVMStackOOM.class);

	private void donotStop() {
		while (true) {

		}
	}

	public void stackLeakByThread() {
		while (true) {
			Thread thread = new Thread(new Runnable() {

				@Override
				public void run() {
					JavaVMStackOOM.this.donotStop();

				}
			});
			thread.start();
		}
	}

	public static void main(String[] args) {
		new JavaVMStackOOM().stackLeakByThread();
	}
}
