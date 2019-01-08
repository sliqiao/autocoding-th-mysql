/*
Copyright ( c ) 2020 TH Supcom Corporation. All Rights Reserved. Copyright version 2.0
 */
package dynamicproxy.jdk;

import java.io.FileOutputStream;
import java.lang.reflect.Proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import sun.misc.ProxyGenerator;

/**
 * @function jdk动态代理，目标对象类必须实现接口，代理实现机制是关联关系
 * @date 2017年7月29日 下午2:22:37
 * @author 李桥
 * @version 1.0
 */

public class JdkDynamicProxyTest {
	private static Logger s_logger = LoggerFactory.getLogger(JdkDynamicProxyTest.class);

	public static void main(String[] args) {
		Subject realSubject = new RealSubject();
		Subject subject = (Subject) Proxy.newProxyInstance(JdkDynamicProxyTest.class.getClassLoader(),
				new Class[] { Subject.class }, new ProxyHandler(realSubject));
		subject.doSomething();
		JdkDynamicProxyTest.createProxyClassFile();
	}

	public static void createProxyClassFile() {
		String name = "ProxySubject";
		byte[] data = ProxyGenerator.generateProxyClass(name, new Class[] { Subject.class });
		try {
			String dir = "E:\\all_git\\hrp-opensource\\autocoding-th-supcom\\";
			FileOutputStream out = new FileOutputStream(dir + name + ".class");
			out.write(data);
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
