package designpattern.responsibilitychain.subject1;

/**
 * 班长处理器
 * 
 * @date 2017年11月27日 上午9:02:18
 * @author 李桥
 * @version 1.0
 */

public class BanzhangOfficerHandler extends OfficerHandler {

	public BanzhangOfficerHandler(String officerName) {
		super(officerName);
	}

	@Override
	public void handleRequest(MissionRequest missionRequest) {

		if (missionRequest == null) {
			return;
		}
		if (missionRequest.getEnemyNum() < 10) {
			System.err.println("班长下达作战命令！");
		} else {
			if (super.nextOfficerHandler == null) {
				return;
			}
			super.nextOfficerHandler.handleRequest(missionRequest);
		}
	}

}
