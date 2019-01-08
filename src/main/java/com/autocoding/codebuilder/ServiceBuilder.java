package com.autocoding.codebuilder;

import java.util.Map;

import com.autocoding.container.CodeBuilderContainer;
import com.autocoding.freemarker.FreemarkerUtil;
import com.autocoding.model.CodeBuilderAnnotation;
import com.autocoding.model.Project;

@CodeBuilderAnnotation(desc = "生成Service文件")
public class ServiceBuilder extends AbsCodeBuilder {

	public ServiceBuilder(Project project) {
		super(project);
		super.fileoutputPath = super.project.getServicePath() + super.entity.getEntityName() + "Service.java";

	}

	@Override
	public void saveToFile() {

		Map<String, Object> rootMap = super.rootMap;
		FreemarkerUtil.fileExport(rootMap, this.project.getTemplatePath(),
				CodeBuilderContainer.getTempleateFileName(this.getClass()), super.fileoutputPath);
	}

}
