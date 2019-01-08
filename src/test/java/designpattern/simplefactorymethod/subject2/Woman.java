package designpattern.simplefactorymethod.subject2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 女人
 * 
 * @date 2017年11月24日 上午9:39:10
 * @author 李桥
 * @version 1.0
 */

public class Woman extends Person {
	private static Logger s_logger = LoggerFactory.getLogger(Woman.class);

	@Override
	public void sleep() {
		// 女人睡觉逻辑

	}

}
