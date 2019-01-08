package designpattern.templatemethod.subject2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 请输入功能
 * 
 * @date 2018年1月29日 上午11:24:52
 * @author 李桥
 * @version 1.0
 */

public class ClientTest {
	private static Logger s_logger = LoggerFactory.getLogger(ClientTest.class);

	public static void main(String[] args) {
		// 活期利息计算
		ProfitComputing currentAccountProfitComputing = new CurrentAccountProfitComputing();
		currentAccountProfitComputing.compute();
		// 定期利息计算
		ProfitComputing savingAccountProfitComputing = new SavingAccountProfitComputing();
		savingAccountProfitComputing.compute();
	}
}
