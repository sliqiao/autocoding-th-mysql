package designpattern.responsibilitychain.subject1;

/**
 * 请输入功能
 * 
 * @date 2017年11月27日 上午9:01:15
 * @author 李桥
 * @version 1.0
 */

public class MissionRequest {
	private int enemyNum;

	public int getEnemyNum() {
		return this.enemyNum;
	}

	public void setEnemyNum(int enemyNum) {
		this.enemyNum = enemyNum;
	}

	public MissionRequest() {

	}

	public MissionRequest(int enemyNum) {
		this.enemyNum = enemyNum;
	}
}
