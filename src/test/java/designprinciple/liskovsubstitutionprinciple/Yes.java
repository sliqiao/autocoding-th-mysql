package designprinciple.liskovsubstitutionprinciple;

import java.util.LinkedList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 正例
 * 
 * @date 2018年1月19日 上午10:11:04
 * @author 李桥
 * @version 1.0
 */

public class Yes {
	private static Logger s_logger = LoggerFactory.getLogger(Yes.class);
	private static List<String> list = null;
	static {
		// 客户端代码不用修改，只需要切换不同的具体类（子类或者接口实现类）
		Yes.list = new LinkedList<String>();
		Yes.list.add("1");
		Yes.list.add("11");
		Yes.list.add("111");
	}

	public static void main(String[] args) {
		List myList = Yes.list;
		System.err.println("list:" + Yes.list);
	}
}
