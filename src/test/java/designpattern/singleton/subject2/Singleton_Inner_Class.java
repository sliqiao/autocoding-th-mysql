package designpattern.singleton.subject2;


/**
 * 单例模式: 内部类是延时加载的，也就是说只会在第一次使用时加载。不使用就不加载，所以可以很好的实现单例模式。 ClassLoader实现了线程安全
 * 
 * @date 2017年10月16日 上午10:44:57
 * @author 李桥
 * @version 1.0
 */

public class Singleton_Inner_Class {

	/* 私有构造方法，防止被实例化 */
	private Singleton_Inner_Class() {
	} /* 此处使用一个内部类来维护单例 */

	private static class SingletonFactory {
		private static Singleton_Inner_Class instance = new Singleton_Inner_Class();
	}

	/* 获取实例 */
	public static Singleton_Inner_Class getInstance() {
		return SingletonFactory.instance;
	}
}
