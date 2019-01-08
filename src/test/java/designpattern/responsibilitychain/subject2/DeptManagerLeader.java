package designpattern.responsibilitychain.subject2;

/**
 * 部门经理
 * 
 * @date 2017年11月27日 上午9:27:08
 * @author 李桥
 * @version 1.0
 */

public class DeptManagerLeader extends AbstractLeader {

	public DeptManagerLeader(String name) {
		super(name);

	}

	@Override
	public void handleRequest(ApproveRequest approveRequest) {
		if (approveRequest == null) {
			return;
		}
		if (approveRequest.getAmount() >= 10000 && approveRequest.getAmount() < 50000) {
			System.err.println("部门经理执行审批流程！");
		} else {
			if (super.nextLeader == null) {
				return;
			}
			super.nextLeader.handleRequest(approveRequest);
		}
	}

}
