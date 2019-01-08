package designpattern.responsibilitychain.subject1;

/**
 * 最高长官处理器
 * 
 * @date 2017年11月27日 上午9:02:18
 * @author 李桥
 * @version 1.0
 */

public class YingzhangOfficerHandler extends OfficerHandler {

	public YingzhangOfficerHandler(String officerName) {
		super(officerName);
	}

	@Override
	public void handleRequest(MissionRequest missionRequest) {

		if (missionRequest == null) {
			return;
		}
		if (missionRequest.getEnemyNum() >= 50 && missionRequest.getEnemyNum() < 200) {
			System.err.println("最高长官下达作战命令！");
		} else {
			if (super.nextOfficerHandler == null) {
				return;
			}
			super.nextOfficerHandler.handleRequest(missionRequest);
		}
	}

}
