package designpattern.build.subject2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 产品导演角色:主要负责产品的创建过程
 * 
 * @date 2018年1月2日 下午2:38:44
 * @author 李桥
 * @version 1.0
 */

public class ComputerDirector {
	private static Logger s_logger = LoggerFactory.getLogger(ComputerDirector.class);
	private AbsBuilder builder;

	public ComputerDirector(AbsBuilder builder) {
		this.builder = builder;
	}

	// 导演角色负责产品的组装过程，产品的零部件由各建造者实现类来完成
	public Computer create() {
		this.builder.buildCPU();
		this.builder.buildDisk();
		this.builder.buildDisplayer();
		this.builder.buildMem();
		return this.builder.getComputer();
	}
}
