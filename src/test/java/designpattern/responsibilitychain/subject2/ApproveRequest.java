package designpattern.responsibilitychain.subject2;

/**
 * 审批请求
 * 
 * @date 2017年11月27日 上午9:21:16
 * @author 李桥
 * @version 1.0
 */

public class ApproveRequest {
	private Double amount;

	/** getter: amount */
	public Double getAmount() {
		return this.amount;
	}

	/** setter: amount */
	public void setAmount(Double amount) {
		this.amount = amount;
	}

}
