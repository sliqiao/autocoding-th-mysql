package designpattern.abstractfactory.subject2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 抽象工厂
 * 
 * @date 2017年11月28日 上午9:03:51
 * @author 李桥
 * @version 1.0
 */

public abstract class AbsFactory {
	private static Logger s_logger = LoggerFactory.getLogger(AbsFactory.class);

	public abstract AbsCPU buildCPU();

	public abstract AbsRAM buildRAM();
}
