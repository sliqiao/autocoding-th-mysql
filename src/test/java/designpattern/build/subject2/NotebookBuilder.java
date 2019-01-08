package designpattern.build.subject2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 笔记本建造者:负责产品部件的创建过程
 * 
 * @date 2018年1月2日 下午2:35:17
 * @author 李桥
 * @version 1.0
 */

public class NotebookBuilder extends AbsBuilder {
	private static Logger s_logger = LoggerFactory.getLogger(NotebookBuilder.class);

	@Override
	public void buildCPU() {
		super.computer.setCpu("Intel Core I8");
	}

	@Override
	public void buildMem() {
		super.computer.setMem("4G");
	}

	@Override
	public void buildDisk() {
		super.computer.setDisk("256G");
	}

	@Override
	public void buildDisplayer() {
		super.computer.setDisplayer("14.1寸");
	}

}
