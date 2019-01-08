package designpattern.responsibilitychain.subject2;

/**
 * 最高一级审批
 * 
 * @date 2017年11月27日 上午9:27:08
 * @author 李桥
 * @version 1.0
 */

public class LastLeader extends AbstractLeader {

	public LastLeader(String name) {
		super(name);

	}

	@Override
	public void handleRequest(ApproveRequest approveRequest) {
		if (approveRequest == null) {
			return;
		}

		System.err.println(" 最高一级审批流程，需要开会讨论！");

	}

}
