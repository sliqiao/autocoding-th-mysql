package designpattern.strategy.subject2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 请输入功能
 * 
 * @date 2017年11月28日 下午1:47:22
 * @author 李桥
 * @version 1.0
 */

public class TenLessDiscount extends AbsDiscountComputer {
	private static Logger s_logger = LoggerFactory.getLogger(TenLessDiscount.class);

	@Override
	public double compute(double amount) {
		return amount - 10;
	}

}
