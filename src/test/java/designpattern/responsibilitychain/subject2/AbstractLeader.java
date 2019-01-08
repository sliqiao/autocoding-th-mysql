package designpattern.responsibilitychain.subject2;

/**
 * 审批领导抽象类
 * 
 * @date 2017年11月27日 上午9:23:53
 * @author 李桥
 * @version 1.0
 */

public abstract class AbstractLeader {
	protected AbstractLeader nextLeader;
	protected String name;;

	public AbstractLeader(String name) {
		this.name = name;
	}

	public abstract void handleRequest(ApproveRequest approveRequest);

	/** getter: nextLeader */
	public AbstractLeader getNextLeader() {
		return this.nextLeader;
	}

	/** setter: nextLeader */
	public void setNextLeader(AbstractLeader nextLeader) {
		this.nextLeader = nextLeader;
	}

	/** getter: name */
	public String getName() {
		return this.name;
	}

	/** setter: name */
	public void setName(String name) {
		this.name = name;
	}
}
