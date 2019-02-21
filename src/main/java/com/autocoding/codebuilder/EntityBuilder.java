package com.autocoding.codebuilder;

import java.util.Map;

import com.autocoding.container.CodeBuilderContainer;
import com.autocoding.freemarker.FreemarkerUtil;
import com.autocoding.model.CodeBuilderAnnotation;
import com.autocoding.model.Project;

/**
 * 
 * Entity代码生成器
 * 
 * @date 2018年1月6日 下午2:33:59
 * @author 李桥
 * @version 1.0
 */
@CodeBuilderAnnotation(desc = "生成对象实体")
public class EntityBuilder extends AbsCodeBuilder {
	public EntityBuilder(Project project) {
		super(project);
		super.fileoutputPath = super.project.getEntitiesPath() + super.entity.getEntityName() + ".java";
	}

	@Override
	public void saveToFile() {
		Map<String, Object> rootMap = super.rootMap;
		FreemarkerUtil.fileExport(rootMap, this.project.getTemplatePath(),
				CodeBuilderContainer.getTempleateFileName(this.getClass()), super.fileoutputPath);

	}
}
