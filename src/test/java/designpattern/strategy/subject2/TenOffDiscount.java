package designpattern.strategy.subject2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 请输入功能
 * 
 * @date 2017年11月28日 下午1:46:04
 * @author 李桥
 * @version 1.0
 */

public class TenOffDiscount extends AbsDiscountComputer {
	private static Logger s_logger = LoggerFactory.getLogger(TenOffDiscount.class);

	/*
	 * 方法重写、覆盖
	 * 
	 * @see designpattern.strategy.subject2.AbsDiscountComputer#compute(double)
	 */
	@Override
	public double compute(double amount) {

		return amount * 0.9;
	}

}
