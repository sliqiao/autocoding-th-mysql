package designpattern.responsibilitychain.subject1;

/**
 * 客户端代码
 * 
 * @date 2017年11月27日 上午9:11:20
 * @author 李桥
 * @version 1.0
 */

public class ClientCallerTest {
	public static void main(String[] args) {
		MissionRequest missionRequest = new MissionRequest(10);
		OfficerHandler banzhang = new BanzhangOfficerHandler(BanzhangOfficerHandler.class.getSimpleName());
		OfficerHandler paizhang = new PaizhangOfficerHandler(PaizhangOfficerHandler.class.getSimpleName());
		OfficerHandler yingzhang = new YingzhangOfficerHandler(YingzhangOfficerHandler.class.getSimpleName());
		OfficerHandler lastOfficer = new LastOfficerHandler(LastOfficerHandler.class.getSimpleName());
		banzhang.setNextOfficerHandler(paizhang);
		paizhang.setNextOfficerHandler(yingzhang);
		yingzhang.setNextOfficerHandler(lastOfficer);
		banzhang.handleRequest(missionRequest);
		try {

		} catch (RuntimeException e) {
			// TODO: handle exception
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
