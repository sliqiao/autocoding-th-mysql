package designprinciple.opencloseprinciple.abstractfactory;


/**
 * 抽象数据库工厂
 * 
 * @date 2017年11月28日 上午8:49:56
 * @author 李桥
 * @version 1.0
 */

public abstract class AbsDBFactory {

	public abstract Connection createConnection();

	public abstract Statement createStatement();

}
