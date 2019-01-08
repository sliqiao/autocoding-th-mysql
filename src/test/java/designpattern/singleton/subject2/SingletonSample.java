/*
Copyright ( c ) 2020 TH Supcom Corporation. All Rights Reserved. Copyright version 2.0
 */
package designpattern.singleton.subject2;

/**
 * 
 * 单例模式:饱汉模式、延迟加载、懒加载机制
 * 
 * @date 2018年1月29日 上午10:28:02
 * @author 李桥
 * @version 1.0
 */
public class SingletonSample {

	/* 此处使用一个内部类来维护单例 */
	private static SingletonSample instance = new SingletonSample();

	/* 私有构造方法，防止被实例化 */
	private SingletonSample() {
	}

	/* 获取实例 */
	public static SingletonSample getInstance() {

		if (null == SingletonSample.instance) {
			SingletonSample.instance = new SingletonSample();
		}
		return SingletonSample.instance;
	}

}
