package designpattern.abstractfactory.subject1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * OracleDBFactory
 * 
 * @date 2017年11月28日 上午8:53:58
 * @author 李桥
 * @version 1.0
 */

public class OracleDBFactory extends AbsDBFactory {
	private static Logger s_logger = LoggerFactory.getLogger(OracleDBFactory.class);

	@Override
	public Connection createConnection() {
		return new OracleConnection();
	}

	@Override
	public Statement createStatement() {

		return new OracleStatement();
	}

}
