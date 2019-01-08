package designpattern.strategy.subject2;

/**
 * 书
 * 
 * @date 2017年11月28日 下午1:38:36
 * @author 李桥
 * @version 1.0
 */

public abstract class Book {
	protected AbsDiscountComputer absDiscountComputer;
	protected double realAmout;

	public double sellPrice() {
		return this.absDiscountComputer.compute(this.realAmout);
	}

	/** getter: absDiscountComputer */
	public AbsDiscountComputer getAbsDiscountComputer() {
		return this.absDiscountComputer;
	}

	/** setter: absDiscountComputer */
	public void setAbsDiscountComputer(AbsDiscountComputer absDiscountComputer) {
		this.absDiscountComputer = absDiscountComputer;
	}

	/** getter: realAmout */
	public double getRealAmout() {
		return this.realAmout;
	}

	/** setter: realAmout */
	public void setRealAmout(double realAmout) {
		this.realAmout = realAmout;
	}

	public Book(AbsDiscountComputer absDiscountComputer, double realAmout) {
		super();
		this.absDiscountComputer = absDiscountComputer;
		this.realAmout = realAmout;
	}

}
