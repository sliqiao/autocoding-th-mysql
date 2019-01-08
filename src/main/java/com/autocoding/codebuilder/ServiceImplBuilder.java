package com.autocoding.codebuilder;

import java.util.Map;

import com.autocoding.container.CodeBuilderContainer;
import com.autocoding.freemarker.FreemarkerUtil;
import com.autocoding.model.CodeBuilderAnnotation;
import com.autocoding.model.Project;

@CodeBuilderAnnotation(desc = "生成ServiceImpl文件")
public class ServiceImplBuilder extends AbsCodeBuilder {

	public ServiceImplBuilder(Project project) {
		super(project);
		super.fileoutputPath = super.project.getServiceImplPath() + super.entity.getEntityName() + "ServiceImpl.java";

	}

	@Override
	public void saveToFile() {
		Map<String, Object> rootMap = super.rootMap;
		FreemarkerUtil.fileExport(rootMap, this.project.getTemplatePath(),
				CodeBuilderContainer.getTempleateFileName(this.getClass()), super.fileoutputPath);

	}

}
