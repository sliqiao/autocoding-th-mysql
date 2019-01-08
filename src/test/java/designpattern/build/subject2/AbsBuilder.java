package designpattern.build.subject2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 抽象建造者角色
 * 
 * @date 2018年1月2日 下午2:31:08
 * @author 李桥
 * @version 1.0
 */

public abstract class AbsBuilder {
	private static Logger s_logger = LoggerFactory.getLogger(AbsBuilder.class);
	protected Computer computer;

	public abstract void buildCPU();

	public abstract void buildMem();

	public abstract void buildDisk();

	public abstract void buildDisplayer();

	public Computer getComputer() {
		return this.computer;
	}
}
