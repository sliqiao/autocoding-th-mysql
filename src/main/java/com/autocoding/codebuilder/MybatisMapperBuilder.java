package com.autocoding.codebuilder;

import java.util.Map;

import com.autocoding.container.CodeBuilderContainer;
import com.autocoding.freemarker.FreemarkerUtil;
import com.autocoding.model.CodeBuilderAnnotation;
import com.autocoding.model.Project;

@CodeBuilderAnnotation(desc = "生成Mybatis Mapper配置文件")
public class MybatisMapperBuilder extends AbsCodeBuilder {

	public MybatisMapperBuilder(Project project) {
		super(project);
		this.fileoutputPath = this.project.getServicePath() + this.entity.getEntityName() + "Mapper.java";

	}

	@Override
	public void saveToFile() {
		Map<String, Object> rootMap = super.rootMap;
		FreemarkerUtil.fileExport(rootMap, this.project.getTemplatePath(),
				CodeBuilderContainer.getTempleateFileName(this.getClass()), super.fileoutputPath);

	}

}
