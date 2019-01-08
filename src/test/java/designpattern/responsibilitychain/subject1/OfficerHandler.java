package designpattern.responsibilitychain.subject1;

/**
 * 长官抽象处理器
 * 
 * @date 2017年11月27日 上午8:59:18
 * @author 李桥
 * @version 1.0
 */

public abstract class OfficerHandler {

	protected OfficerHandler nextOfficerHandler;
	protected String officerName;

	public abstract void handleRequest(MissionRequest missionRequest);

	public OfficerHandler(String officerName) {
		this.officerName = officerName;
	}

	public OfficerHandler getNextOfficerHandler() {
		return this.nextOfficerHandler;
	}

	public void setNextOfficerHandler(OfficerHandler nextOfficerHandler) {
		this.nextOfficerHandler = nextOfficerHandler;
	}

	public String getOfficerName() {
		return this.officerName;
	}

	public void setOfficerName(String officerName) {
		this.officerName = officerName;
	}

}
