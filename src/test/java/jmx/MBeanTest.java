package jmx;

import java.lang.management.ManagementFactory;

import javax.management.MBeanServer;
import javax.management.ObjectName;

/**
 * 请输入功能
 * 
 * @date 2018年2月24日 下午5:13:49
 * @author Li Qiao
 * @version 1.0
 */

public class MBeanTest {
	public static void main(String[] args) throws Exception {
		MBeanServer server = ManagementFactory.getPlatformMBeanServer();
		ObjectName objectName = new ObjectName("com.th.supcom.hrp:name=currentUser");
		server.registerMBean(new CurrentUser(), objectName);
		System.err.println("测试MBean");
		System.in.read();
	}
}
