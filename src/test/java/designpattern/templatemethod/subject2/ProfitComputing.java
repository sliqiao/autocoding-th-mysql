package designpattern.templatemethod.subject2;

/**
 * 利息计算
 * 
 * @date 2017年11月27日 上午11:47:14
 * @author 李桥
 * @version 1.0
 */

public abstract class ProfitComputing {
	public void compute() {
		this.getUserInfo();
		this.getUserType();
		this.computeByUserType();
		this.printProfitInfo();

	}

	private void printProfitInfo() {
		// 打印利息信息

	}

	/**
	 * 根据用户类型进行利息计算
	 * 
	 * @function: void
	 * @throws
	 * @author 李桥
	 * @Date 2018年1月29日 上午11:29:12
	 */
	protected abstract void computeByUserType();

	private void getUserInfo() {
		// 获取用户信息

	}

	private void getUserType() {
		// 获取用户账户类型
	}
}
