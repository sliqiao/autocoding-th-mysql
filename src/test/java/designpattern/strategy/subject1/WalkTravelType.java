package designpattern.strategy.subject1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 徒步旅行
 * 
 * @date 2017年11月28日 下午1:34:37
 * @author 李桥
 * @version 1.0
 */

public class WalkTravelType extends AbsTravelType {
	private static Logger s_logger = LoggerFactory.getLogger(WalkTravelType.class);

	@Override
	public void go() {
		// 徒步旅行

	}

}
