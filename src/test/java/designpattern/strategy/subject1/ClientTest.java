package designpattern.strategy.subject1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 请输入功能
 * 
 * @date 2017年11月28日 下午1:32:20
 * @author 李桥
 * @version 1.0
 */

public class ClientTest {
	private static Logger s_logger = LoggerFactory.getLogger(ClientTest.class);

	public static void main(String[] args) throws InstantiationException, IllegalAccessException,
			ClassNotFoundException {
		// 具体使用何种策略，可以从配置文件中读取
		String travelTypeName = "designpattern.strategy.subject1.TrainTravelType";
		AbsTravelType travelType = (AbsTravelType) Class.forName(travelTypeName).newInstance();
		travelType.go();
	}
}
