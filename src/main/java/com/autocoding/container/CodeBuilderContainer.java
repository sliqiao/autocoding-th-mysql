package com.autocoding.container;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.autocoding.freemarker.FreemarkerTag;

/**
 * 代码构建器容器
 * 
 * @date 2018年1月6日 下午2:38:42
 * @author 李桥
 * @version 1.0
 */

public class CodeBuilderContainer {
	private static Logger s_logger = LoggerFactory.getLogger(CodeBuilderContainer.class);

	public static String getTempleateFileName(Class<?> codeBuilderClass) {
		if (null == codeBuilderClass) {
			CodeBuilderContainer.s_logger.error("codeBuilderClass不能为空!");
		}
		return codeBuilderClass.getSimpleName() + FreemarkerTag.POSTFIX;

	}
}
