package dynamicproxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 通用拦截器
 * 
 * @date 2017年12月30日 上午10:28:23
 * @author 李桥
 * @version 1.0
 */

public class CommonMethodInteceptor implements MethodInterceptor {
	private static Logger s_logger = LoggerFactory.getLogger(CommonMethodInteceptor.class);
	private Object target;

	public CommonMethodInteceptor(Object target) {
		super();
		this.target = target;
	}

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println("CommonMethodInteceptor拦截器------- 方法执行之前业务处理。..........");
		Object result = method.invoke(this.target, args);
		System.out.println("CommonMethodInteceptor拦截器-------  方法执行之后业务处理。..........");
		return result;
	}

}
