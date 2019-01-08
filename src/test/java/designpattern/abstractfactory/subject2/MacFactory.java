package designpattern.abstractfactory.subject2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * MacFactory
 * 
 * @date 2017年11月28日 上午9:07:39
 * @author 李桥
 * @version 1.0
 */

public class MacFactory extends AbsFactory {
	private static Logger s_logger = LoggerFactory.getLogger(MacFactory.class);

	@Override
	public AbsCPU buildCPU() {
		return new MacCPU();
	}

	@Override
	public AbsRAM buildRAM() {
		return new MacRAM();
	}

}
