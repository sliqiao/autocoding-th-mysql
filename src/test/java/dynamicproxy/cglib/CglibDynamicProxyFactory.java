package dynamicproxy.cglib;

import net.sf.cglib.proxy.Enhancer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Cglib代理工厂
 * 
 * @date 2017年12月30日 上午10:27:18
 * @author 李桥
 * @version 1.0
 */

public class CglibDynamicProxyFactory {
	private static Logger s_logger = LoggerFactory.getLogger(CglibDynamicProxyFactory.class);

	public static <T> T create(T targetObject) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(targetObject.getClass());
		enhancer.setCallback(new CommonMethodInteceptor(targetObject));
		return (T) enhancer.create();
	}
}
