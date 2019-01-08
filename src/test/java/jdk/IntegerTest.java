/*
Copyright ( c ) 2020 TH Supcom Corporation. All Rights Reserved. Copyright version 2.0
 */
package jdk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @function
 * @date 2017年7月29日 下午3:27:49
 * @author 李桥
 * @version 1.0
 */

public class IntegerTest {
	private static Logger s_logger = LoggerFactory.getLogger(IntegerTest.class);

	public static void main(String[] args) {
		Integer i1 = new Integer(127);// false,大了直接new了一个构造方法
		Integer i2 = new Integer(127);
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));
		System.out.println("-----------");

		Integer i3 = new Integer(128);// false,大了直接new了一个构造方法
		Integer i4 = new Integer(128);
		System.out.println(i3 == i4);
		System.out.println(i3.equals(i4));
		System.out.println("-----------");

		Integer i5 = 128;
		Integer i6 = 128;
		System.out.println(i5 == i6);// false,大了直接返回new了一个构造方法
		System.out.println(i5.equals(i6));
		System.out.println("-----------");

		Integer i7 = 127;
		Integer i8 = 127;
		System.out.println(i7 == i8);// 缓冲池里找,有就true,没有false
		System.out.println(i7.equals(i8));
		System.out.println("-----------");

		Integer i9 = 126;
		Integer i10 = 126;
		System.out.println(i9 == i10);
		System.out.println(i9.equals(i10));
		System.out.println("-----------");
		// 通过查看源码,我们就知道了,针对-128到127之间的数据,做了一个数据缓冲池,如果数据是该范围内的,每次并不创建新的空间
		// Integer ii = Integer.valueOf(127);

		// public static Integer valueOf(int i) {
		// final int offset = 128;
		// if (i >= -128 && i <= 127) { //127>=-128 && 127<=127, 126>=128 &&
		// 126<=127
		// return IntegerCache.cache[i + offset];//127+128=255, 126+128=254
		// }
		// return new Integer(i);
		// }

		// private static class IntegerCache {
		// private IntegerCache(){}
		//
		// static final Integer cache[] = new Integer[-(-128) + 127 +
		// 1];//0索引是255, 0索引是254
		//
		// static {
		// for(int i = 0; i < cache.length; i++)//0
		// cache[i] = new Integer(i - 128);//255 = new Integer(i-128), 254 = new
		// Integer(i - 128)
		// }
		// }
	}
}
