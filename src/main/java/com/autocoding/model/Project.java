package com.autocoding.model;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang.StringUtils;

import com.autocoding.util.MyStringUtil;
import com.autocoding.util.MyStringUtil.GetSeperatedPathFromPackageParameter;

public class Project {

	private String projPath;

	private final String rootPackage;

	private final String srcPath;

	private final String rootPackagePath;

	private final String jspRootPath;

	private final String jsRootPath;

	private Entity entity;

	private final String entitiesPath;
	private final String entitiesPackage;

	/** ibatis配置文件路径 */
	private final String dbconfigPath;

	private final String actionPath;
	private final String actionPackage;

	private final String servicePath;
	private final String servicePackage;
	private final String serviceImplPath;
	private final String serviceImplPackage;

	private String outputPath;

	private String templatePath;

	private String prefix;
	private String userTableSpace;

	private final String dateString;

	private String author;

	private String prefixWithSharp;

	public Project(String projPath, String rootPackage, String userTableSpace, String outputDir) {
		this.projPath = projPath;
		this.rootPackage = rootPackage;

		if (!this.projPath.endsWith(File.separator)) {
			this.projPath += File.separator;
		}

		if (StringUtils.isNotEmpty(outputDir)) {
			this.outputPath = outputDir + File.separator;
		} else {
			this.outputPath = this.projPath + "output" + File.separator;
		}

		this.srcPath = this.outputPath + "src" + File.separator;

		this.rootPackagePath = this.srcPath + MyStringUtil.getSeperatedPathFromPackage(new GetSeperatedPathFromPackageParameter (this.rootPackage));
		this.jspRootPath = this.projPath + "WebRoot" + File.separator + "WEB-INF" + File.separator + "pages"
				+ File.separator;
		this.jsRootPath = this.projPath + "WebRoot" + File.separator + "js" + File.separator;

		this.entitiesPath = this.rootPackagePath + "model" + File.separator;
		this.entitiesPackage = this.rootPackage + ".model";

		this.dbconfigPath = this.rootPackagePath + "dbconfig" + File.separator;

		this.actionPath = this.rootPackagePath + "controller" + File.separator;
		this.actionPackage = this.rootPackage + ".controller";

		this.servicePath = this.rootPackagePath + "service" + File.separator;
		this.servicePackage = this.rootPackage + ".service";

		this.serviceImplPath = this.servicePath + "impl" + File.separator;
		this.serviceImplPackage = this.servicePackage + ".impl";

		this.templatePath = this.projPath + "template" + File.separator;

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		this.userTableSpace = userTableSpace;
		this.dateString = sdf.format(new Date());
	}

	public Project(String projPath, String rootPackage, String userTableSpace) {
		this(projPath, rootPackage, userTableSpace, null);
	}

	public String getSrcPath() {
		return this.srcPath;
	}

	public String getRootPackagePath() {
		return this.rootPackagePath;
	}

	public String getJspRootPath() {
		return this.jspRootPath;
	}

	public String getJsRootPath() {
		return this.jsRootPath;
	}

	public void generate() {

	}

	public Entity getEntity() {
		return this.entity;
	}

	public String getProjPath() {
		return this.projPath;
	}

	public String getRootPackage() {
		return this.rootPackage;
	}

	public String getEntitiesPath() {
		return this.entitiesPath;
	}

	public String getActionPath() {
		return this.actionPath;
	}

	public String getServicePath() {
		return this.servicePath;
	}

	public String getServiceImplPath() {
		return this.serviceImplPath;
	}

	public void setEntity(Entity entity) {
		this.entity = entity;
	}

	public String getEntitiesPackage() {
		return this.entitiesPackage;
	}

	public String getActionPackage() {
		return this.actionPackage;
	}

	public String getServicePackage() {
		return this.servicePackage;
	}

	public String getServiceImplPackage() {
		return this.serviceImplPackage;
	}

	public String getPrefix() {
		return this.prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getOutputPath() {
		return this.outputPath;
	}

	public void setOutputPath(String outputPath) {
		this.outputPath = outputPath;
	}

	public String getTemplatePath() {
		return this.templatePath;
	}

	public void setTemplatePath(String templatePath) {
		this.templatePath = templatePath;
	}

	public String getDateString() {
		return this.dateString;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPrefixWithSharp() {
		return this.prefixWithSharp;
	}

	public void setPrefixWithSharp(String prefixWithSharp) {
		this.prefixWithSharp = prefixWithSharp;
	}

	/**
	 * @return 获取 dbconfigPath属性值
	 */
	public String getDbconfigPath() {
		return this.dbconfigPath;
	}

	/** getter: userTableSpace */
	public String getUserTableSpace() {
		return this.userTableSpace;
	}

	/** setter: userTableSpace */
	public void setUserTableSpace(String userTableSpace) {
		this.userTableSpace = userTableSpace;
	}

}
