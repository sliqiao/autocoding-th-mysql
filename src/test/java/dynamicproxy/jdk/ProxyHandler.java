/*
Copyright ( c ) 2020 TH Supcom Corporation. All Rights Reserved. Copyright version 2.0
 */
package dynamicproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @function
 * @date 2017年7月29日 下午2:19:25
 * @author 李桥
 * @version 1.0
 */

public class ProxyHandler implements InvocationHandler {
	private static Logger s_logger = LoggerFactory.getLogger(ProxyHandler.class);
	private Object proxiedObject;

	public ProxyHandler(Object proxiedObject) {
		this.proxiedObject = proxiedObject;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("动态代理类调用之前！");
		Object returnObject = method.invoke(this.proxiedObject, args);
		System.out.println("动态代理类调用之后！");
		return returnObject;
	}

}
