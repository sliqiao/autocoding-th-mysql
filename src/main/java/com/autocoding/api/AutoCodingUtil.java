package com.autocoding.api;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.autocoding.codebuilder.AbsCodeBuilder;
import com.autocoding.constant.ConfigConstant;
import com.autocoding.model.Entity;
import com.autocoding.model.Project;
import com.autocoding.util.CodeBuilderFactory;
import com.autocoding.util.CodeBuilderScanUtil;
import com.autocoding.util.FileCompressUtil;

public class AutoCodingUtil {

	private static final Logger LOGGER = LoggerFactory.getLogger(AutoCodingUtil.class);
	private Connection conn;
	private String jdbcDriver;
	private String jdbcUrl;
	private String userName;
	private String password;
	private String rootPackage;
	private Project project;
	private String tablesName;

	public static AutoCodingUtil newInstance(String outputDir, Map<String, String> propertyMap) {
		AutoCodingUtil autoCodingMain = new AutoCodingUtil(outputDir, propertyMap);
		return autoCodingMain;

	}

	public void startAutoCoding() {
		this.connect();
		this.run();
		this.disconnect();

	}

	public AutoCodingUtil(String outputDir, Map<String, String> propertyMap) {
		try {
			String rootdir = System.getProperty("user.dir");
			this.jdbcDriver = propertyMap.get(ConfigConstant.c3p0_driverClass);
			this.jdbcUrl = propertyMap.get(ConfigConstant.c3p0_jdbcUrl);
			this.userName = propertyMap.get(ConfigConstant.c3p0_user);
			this.password = propertyMap.get(ConfigConstant.c3p0_password);
			this.rootPackage = propertyMap.get(ConfigConstant.autocoding_package);
			this.tablesName = propertyMap.get(ConfigConstant.autocoding_table_names);
			String prefix = propertyMap.get(ConfigConstant.autocoding_prefix);
			this.project = new Project(rootdir, this.rootPackage, this.userName, outputDir);
			this.project.setPrefix(prefix);
			this.project.setAuthor(propertyMap.get(ConfigConstant.autocoding_author));
			String prefixWithSharp = prefix.replace(".", "/");
			this.project.setPrefixWithSharp(prefixWithSharp);
		} catch (Exception e) {
			AutoCodingUtil.LOGGER.error("执行AutoCodingMain.AutoCodingMain()异常:", e);
		}
	}

	private boolean connect() {
		try {
			Class.forName(this.jdbcDriver);

			this.conn = DriverManager.getConnection(this.jdbcUrl, this.userName, this.password);

			AutoCodingUtil.LOGGER.info("---------数据库连接成功--------------");
			return true;
		} catch (Exception e) {
			AutoCodingUtil.LOGGER.error("执行AutoCodingMain.connect()异常:", e);
		}
		AutoCodingUtil.LOGGER.info("----------数据库连接失败--------------");

		return false;
	}

	private boolean disconnect() {
		try {
			this.conn.close();
			AutoCodingUtil.LOGGER.info("----------数据库断开成功--------------");
			return true;
		} catch (Exception e) {
			AutoCodingUtil.LOGGER.error("----------数据库断开失败--------------", e);
		}
		return false;
	}

	public void run() {
		String[] names = this.tablesName.split(",");
		for (String name : names) {
			AutoCodingUtil.LOGGER.info("---------开始生成表[" + name + "]的代码--------------");
			this.run(name);
			AutoCodingUtil.LOGGER.info("---------完成生成表[" + name + "]的代码--------------");
		}
	}

	public void run(String tableName) {
		try {
			Entity entity = new Entity(this.conn, tableName);
			entity.parseEntityInfo();
			this.project.setEntity(entity);

			AbsCodeBuilder codeBuilder = null;
			Set<Class<?>> codeBuilderSet = CodeBuilderScanUtil.scan();
			for (Class<?> codeBuilderClass : codeBuilderSet) {
				codeBuilder = CodeBuilderFactory.createBuilder(codeBuilderClass, this.project);
				AutoCodingUtil.LOGGER.info("正在对【" + tableName + "】生成文件【" + codeBuilder.getFileoutputPath()
						+ "】 ---【开始】");
				codeBuilder.saveToFile();
				AutoCodingUtil.LOGGER.info("正在对【" + tableName + "】生成文件【" + codeBuilder.getFileoutputPath()
						+ "】 ---【结束】");
			}
		} catch (Exception e) {
			AutoCodingUtil.LOGGER.error("执行AutoCodingMain.run()异常：", e);

		}
	}

	public Project getProject() {
		return this.project;
	}

	public static void main(String[] args) {
		Map<String, String> propertyMap = new HashMap<String, String>();
		propertyMap.put(ConfigConstant.c3p0_driverClass, "oracle.jdbc.driver.OracleDriver");
		propertyMap.put(ConfigConstant.c3p0_jdbcUrl, "jdbc:oracle:thin:@192.168.222.223:1521:ORCL");
		propertyMap.put(ConfigConstant.c3p0_user, "hrp_easyui");
		propertyMap.put(ConfigConstant.c3p0_password, "hrp_easyui");
		propertyMap.put(ConfigConstant.autocoding_package, "com.th.supcom.hrp.rmps");
		propertyMap.put(ConfigConstant.autocoding_table_names, "APP_DEVELOPER_INFO");
		propertyMap.put(ConfigConstant.autocoding_prefix, "test");
		propertyMap.put(ConfigConstant.autocoding_author, "李桥");
		String outputDir = "E:\\xml_message\\" + UUID.randomUUID();

		AutoCodingUtil autoCodingUtil = AutoCodingUtil.newInstance(outputDir, propertyMap);
		autoCodingUtil.startAutoCoding();

		FileCompressUtil.compress(autoCodingUtil.project.getOutputPath(), "E:\\xml_message\\output.zip");
		try {
			org.apache.commons.io.FileUtils.deleteDirectory(new File(autoCodingUtil.project.getOutputPath()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
