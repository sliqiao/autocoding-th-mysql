package designpattern.abstractfactory.subject2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 请输入功能
 * 
 * @date 2017年11月28日 上午9:07:39
 * @author 李桥
 * @version 1.0
 */

public class PcFactory extends AbsFactory {
	private static Logger s_logger = LoggerFactory.getLogger(PcFactory.class);

	@Override
	public AbsCPU buildCPU() {
		return new PcCPU();
	}

	@Override
	public AbsRAM buildRAM() {
		return new PcRAM();
	}

}
