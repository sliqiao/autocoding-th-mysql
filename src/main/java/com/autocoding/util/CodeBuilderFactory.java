package com.autocoding.util;

import java.lang.reflect.Constructor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.autocoding.codebuilder.AbsCodeBuilder;
import com.autocoding.model.Project;

/**
 * CodeBuilder工厂
 * 
 * @date 2018年1月6日 下午2:13:46
 * @author 李桥
 * @version 1.0
 */

public class CodeBuilderFactory {
	private static Logger s_logger = LoggerFactory.getLogger(CodeBuilderFactory.class);

	public static AbsCodeBuilder createBuilder(Class clazz, Project project) {
		AbsCodeBuilder absCodeBuilder = null;
		try {
			Constructor<?> constructor = clazz.getConstructor(Project.class);
			absCodeBuilder = (AbsCodeBuilder) constructor.newInstance(project);
		} catch (Exception e) {
			CodeBuilderFactory.s_logger.error("构建对象异常：", clazz.getName());
		}
		return absCodeBuilder;
	}
}
