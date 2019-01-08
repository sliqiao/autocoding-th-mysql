package com.autocoding.codebuilder;

import java.util.HashMap;
import java.util.Map;

import com.autocoding.freemarker.FreemarkerTag;
import com.autocoding.model.Entity;
import com.autocoding.model.Project;

/**
 * 
 * 抽象代码构建器
 * 
 * @date 2018年1月6日 下午2:32:38
 * @author 李桥
 * @version 1.0
 */
public abstract class AbsCodeBuilder {
	protected String fileoutputPath;
	protected Project project;
	protected Entity entity;
	protected Map<String, Object> rootMap;

	public abstract void saveToFile();

	public AbsCodeBuilder(Project project) {
		this.project = project;
		this.entity = this.project.getEntity();
		this.rootMap = this.getRootMap();
	}

	public String getFileoutputPath() {
		return this.fileoutputPath;
	}

	private Map<String, Object> getRootMap() {
		Map<String, Object> rootMap = new HashMap<String, Object>();
		rootMap.put(FreemarkerTag.Common.AUTHOR, this.project.getAuthor());
		rootMap.put(FreemarkerTag.Common.PROJECT, this.project);
		rootMap.put(FreemarkerTag.Common.DATE, this.project.getDateString());
		rootMap.put(FreemarkerTag.Common.Entity, this.entity);
		rootMap.put(FreemarkerTag.Common.PACKAGE, this.project.getRootPackage());
		rootMap.put(FreemarkerTag.Common.PK_FIELD, this.entity.getPrimaryKeyField());
		rootMap.put(FreemarkerTag.Common.FIELDS, this.entity.getFields());
		rootMap.put(FreemarkerTag.Common.EntityBeanName, this.entity.getEntityBeanName());
		rootMap.put(FreemarkerTag.Common.PREFIX, this.project.getPrefix());
		rootMap.put(FreemarkerTag.Common.EntityName, this.entity.getEntityName());
		return rootMap;
	}

}
