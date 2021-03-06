/*
Copyright ( c ) 2020 TH Supcom Corporation. All Rights Reserved. Copyright version 2.0
 */
package dynamicproxy.cglib;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dynamicproxy.jdk.Subject;

/**
 * @function
 * @date 2017年7月29日 下午2:17:51
 * @author 李桥
 * @version 1.0
 */

public class RealSubject implements Subject {
	private static Logger s_logger = LoggerFactory.getLogger(RealSubject.class);

	@Override
	public void doSomething() {
		System.out.println("实现者RealSubject，调用doSomething()方法");

	}

}
