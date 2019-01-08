package designpattern.abstractfactory.subject2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 请输入功能
 * 
 * @date 2017年11月28日 上午9:09:59
 * @author 李桥
 * @version 1.0
 */

public class ClientTest {
	private static Logger s_logger = LoggerFactory.getLogger(ClientTest.class);

	public static void main(String[] args) {
		// factory由程序运行时来决定,可以进行配置
		AbsFactory factory = new MacFactory();
		// 面向抽象编程
		AbsCPU cpu = factory.buildCPU();
		AbsRAM ram = factory.buildRAM();

	}
}
