package designpattern.strategy.subject2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 请输入功能
 * 
 * @date 2017年11月28日 下午1:46:55
 * @author 李桥
 * @version 1.0
 */

public class TwoLessDiscount extends AbsDiscountComputer {
	private static Logger s_logger = LoggerFactory.getLogger(TwoLessDiscount.class);

	@Override
	public double compute(double amount) {
		return amount - 2;
	}

}
