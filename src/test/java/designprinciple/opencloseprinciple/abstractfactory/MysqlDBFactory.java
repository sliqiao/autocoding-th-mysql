package designprinciple.opencloseprinciple.abstractfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * mysql工厂
 * 
 * @date 2017年11月28日 上午8:55:47
 * @author 李桥
 * @version 1.0
 */

public class MysqlDBFactory extends AbsDBFactory {
	private static Logger s_logger = LoggerFactory.getLogger(MysqlDBFactory.class);

	@Override
	public Connection createConnection() {
		return new MysqlConnection();
	}

	@Override
	public Statement createStatement() {
		return new MysqlStatement();
	}

}
