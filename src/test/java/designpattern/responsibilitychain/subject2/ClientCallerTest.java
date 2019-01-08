package designpattern.responsibilitychain.subject2;

/**
 * 客户端代码
 * 
 * @date 2017年11月27日 上午9:11:20
 * @author 李桥
 * @version 1.0
 */

public class ClientCallerTest {
	public static void main(String[] args) {
		// 构建责任链
		ApproveRequest request = new ApproveRequest();
		request.setAmount(20000d);
		AbstractLeader director = new DirectorLeader(DirectorLeader.class.getSimpleName());
		AbstractLeader deptManagerLeader = new DeptManagerLeader(DeptManagerLeader.class.getSimpleName());
		AbstractLeader viceGeneralManagerLeader = new ViceGeneralManagerLeader(
				ViceGeneralManagerLeader.class.getSimpleName());
		AbstractLeader generalManagerLeader = new GeneralManagerLeader(GeneralManagerLeader.class.getSimpleName());
		AbstractLeader lastLeader = new LastLeader(LastLeader.class.getSimpleName());
		director.setNextLeader(deptManagerLeader);
		deptManagerLeader.setNextLeader(viceGeneralManagerLeader);
		viceGeneralManagerLeader.setNextLeader(generalManagerLeader);
		generalManagerLeader.setNextLeader(lastLeader);
		// 开始处理请求
		director.handleRequest(request);
	}
}
