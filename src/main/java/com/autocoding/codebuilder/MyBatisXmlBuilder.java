package com.autocoding.codebuilder;

import java.util.Map;

import com.autocoding.container.CodeBuilderContainer;
import com.autocoding.freemarker.FreemarkerUtil;
import com.autocoding.model.CodeBuilderAnnotation;
import com.autocoding.model.Project;

@CodeBuilderAnnotation(desc = "生成Mybatis的映射文件-sqlmap")
public class MyBatisXmlBuilder extends AbsCodeBuilder {

	public MyBatisXmlBuilder(Project project) {
		super(project);
		super.fileoutputPath = super.project.getDbconfigPath() + super.project.getEntity().getEntityName()
				+ ".sqlmap.xml";
	}

	@Override
	public void saveToFile() {
		Map<String, Object> rootMap = super.rootMap;
		FreemarkerUtil.fileExport(rootMap, this.project.getTemplatePath(),
				CodeBuilderContainer.getTempleateFileName(this.getClass()), super.fileoutputPath);

	}
}
