package designpattern.responsibilitychain.subject2;

/**
 * 副总经理
 * 
 * @date 2017年11月27日 上午9:27:08
 * @author 李桥
 * @version 1.0
 */

public class ViceGeneralManagerLeader extends AbstractLeader {

	public ViceGeneralManagerLeader(String name) {
		super(name);

	}

	@Override
	public void handleRequest(ApproveRequest approveRequest) {
		if (approveRequest == null) {
			return;
		}
		if (approveRequest.getAmount() >= 50000 && approveRequest.getAmount() < 100000) {
			System.err.println("副总经理执行审批流程！");
		} else {
			if (super.nextLeader == null) {
				return;
			}
			super.nextLeader.handleRequest(approveRequest);
		}
	}

}
