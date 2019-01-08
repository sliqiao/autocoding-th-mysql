package designpattern.strategy.subject2;

/**
 * 计算机书
 * 
 * @date 2017年11月28日 下午1:40:16
 * @author 李桥
 * @version 1.0
 */

public class ComputerBook extends Book {
	/**
	 * @param absDiscountComputer
	 * @param realAmout
	 */
	public ComputerBook(AbsDiscountComputer absDiscountComputer, double realAmout) {
		super(absDiscountComputer, realAmout);

	}

}
