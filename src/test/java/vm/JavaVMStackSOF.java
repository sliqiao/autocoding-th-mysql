package vm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 请输入功能
 * 
 * @date 2017年12月4日 下午2:49:52
 * @author 李桥
 * @version 1.0
 */

public class JavaVMStackSOF {
	private static Logger s_logger = LoggerFactory.getLogger(JavaVMStackSOF.class);
	private int stackLength = 1;

	public void statckLeak() {
		this.stackLength++;
		this.statckLeak();
	}

	public static void main(String[] args) {
		JavaVMStackSOF javaVMStackSOF = new JavaVMStackSOF();
		try {
			javaVMStackSOF.statckLeak();
		} catch (Exception e) {
			System.out.println("stack length:" + javaVMStackSOF.stackLength);
			throw e;
		}
	}
}
