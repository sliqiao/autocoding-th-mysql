package designpattern.abstractfactory.subject1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 请输入功能
 * 
 * @date 2017年11月28日 上午8:56:47
 * @author 李桥
 * @version 1.0
 */

public class ClientTest {
	private static Logger s_logger = LoggerFactory.getLogger(ClientTest.class);

	/**
	 * @function:
	 * @param args
	 *            void
	 * @throws
	 * @author 李桥
	 * @Date 2017年11月28日 上午8:56:47
	 */
	public static void main(String[] args) {
		// factory由程序运行时来决定,可以进行配置
		AbsDBFactory factory = new OracleDBFactory();
		// 面向抽象编程
		Connection connn = factory.createConnection();
		Statement statement = factory.createStatement();

	}

}
