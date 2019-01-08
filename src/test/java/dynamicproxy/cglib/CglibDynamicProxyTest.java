/*
Copyright ( c ) 2020 TH Supcom Corporation. All Rights Reserved. Copyright version 2.0
 */
package dynamicproxy.cglib;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dynamicproxy.jdk.Subject;

/**
 * @function cglib动态代理，可以代理任何目标对象，但是有限制，目标对象类不能是final，代理实现机制是继承
 * @date 2017年7月29日 下午2:22:37
 * @author 李桥
 * @version 1.0
 */

public class CglibDynamicProxyTest {
	private static Logger s_logger = LoggerFactory.getLogger(CglibDynamicProxyTest.class);

	public static void main(String[] args) {
		Subject targetObject = new RealSubject();
		Subject proxyRealSubject = CglibDynamicProxyFactory.create(targetObject);
		proxyRealSubject.doSomething();
	}
}
