package designpattern.responsibilitychain.subject1;

/**
 * 排长处理器
 * 
 * @date 2017年11月27日 上午9:02:18
 * @author 李桥
 * @version 1.0
 */

public class PaizhangOfficerHandler extends OfficerHandler {

	public PaizhangOfficerHandler(String officerName) {
		super(officerName);
	}

	@Override
	public void handleRequest(MissionRequest missionRequest) {

		if (missionRequest == null) {
			return;
		}
		if (missionRequest.getEnemyNum() >= 10 && missionRequest.getEnemyNum() < 50) {
			System.err.println("排长下达作战命令！");
		} else {
			if (super.nextOfficerHandler == null) {
				return;
			}
			super.nextOfficerHandler.handleRequest(missionRequest);
		}
	}

}
