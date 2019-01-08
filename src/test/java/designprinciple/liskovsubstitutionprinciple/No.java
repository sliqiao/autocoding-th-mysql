package designprinciple.liskovsubstitutionprinciple;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 反例
 * 
 * @date 2018年1月19日 上午10:11:04
 * @author 李桥
 * @version 1.0
 */

public class No {
	private static Logger s_logger = LoggerFactory.getLogger(No.class);
	private static ArrayList<String> list = null;
	static {
		No.list = new ArrayList<String>();
		No.list.add("1");
		No.list.add("11");
		No.list.add("111");
	}

	/**
	 * 
	 * 如果客户端代码即main方法里面要求myList实现换成LinkedList,我们还要修改代码行31行和18行
	 */
	public static void main(String[] args) {
		ArrayList myList = No.list;
		System.err.println("list:" + No.list);
	}
}
