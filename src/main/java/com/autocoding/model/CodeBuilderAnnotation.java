package com.autocoding.model;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 代码生成器注解
 * 
 * @date 2018年1月6日 下午3:39:57
 * @author 李桥
 * @version 1.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface CodeBuilderAnnotation {
	public String desc() default "";
}
