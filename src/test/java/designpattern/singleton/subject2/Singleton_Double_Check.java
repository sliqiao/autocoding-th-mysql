/*
Copyright ( c ) 2020 TH Supcom Corporation. All Rights Reserved. Copyright version 2.0
 */
package designpattern.singleton.subject2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 单例模式
 * 
 * @date 2017年10月16日 上午10:44:57
 * @author 李桥
 * @version 1.0
 */

public class Singleton_Double_Check {
	private static Logger s_logger = LoggerFactory.getLogger(Singleton_Double_Check.class);
	private static Singleton_Double_Check instance = null;

	/* 私有构造方法，防止被实例化 */
	private Singleton_Double_Check() {
	} /* 此处使用一个内部类来维护单例 */

	/* 获取实例 */
	public static Singleton_Double_Check getInstance() {

		if (null == Singleton_Double_Check.instance) {
			synchronized (Singleton_Double_Check.class) {
				if (null == Singleton_Double_Check.instance) {
					Singleton_Double_Check.instance = new Singleton_Double_Check();
				}

			}
		}

		return Singleton_Double_Check.instance;

	}
}
