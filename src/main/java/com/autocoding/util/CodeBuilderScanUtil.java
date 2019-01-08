package com.autocoding.util;

import java.util.HashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.autocoding.model.CodeBuilderAnnotation;

/**
 * 扫描真正的CodeBuilder,加了CodeBuilder注解
 * 
 * @date 2018年1月6日 下午3:39:05
 * @author 李桥
 * @version 1.0
 */

public class CodeBuilderScanUtil {
	private static Logger s_logger = LoggerFactory.getLogger(CodeBuilderScanUtil.class);

	private CodeBuilderScanUtil() {
	}

	public static Set<Class<?>> scan() {
		Set<Class<?>> resultSet = new HashSet<>();
		Set<Class<?>> tempSet = PackageScanUtil.getClasses("com.autocoding.codebuilder");
		if (tempSet == null || tempSet.size() == 0) {
			return null;
		}
		for (Class<?> c : tempSet) {
			if (c.getAnnotation(CodeBuilderAnnotation.class) != null) {
				resultSet.add(c);
			}
		}

		return resultSet;
	}
}
