package com.autocoding.freemarker;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.autocoding.main.AutoCodingMain;

import freemarker.template.Configuration;
import freemarker.template.Template;

/**
 * Word导出工具：按照指定格式的Word导出.
 * 
 * @author liqiao
 * @since JDK 1.6
 * @version 1.0
 * @description: TODO
 * @log:2016年2月2日 下午2:38:12 liqiao create
 */
public final class FreemarkerUtil {
	private static final Logger LOGGER = LoggerFactory.getLogger(AutoCodingMain.class);
	/** 模板文件编码. */
	private static final String TEMPLATE_FILE_ENCODING = "UTF-8";
	/** 导出文件编码 . */
	private static final String FILE_OUTPUT_ENCODING = "UTF-8";

	/**
	 * 私有构造器.
	 */
	private FreemarkerUtil() {

	}

	/**
	 * @title fileExport,可以实现由Word或者Excel模板的文件导出功能!!!
	 *        (通过将Word和Excel转换为XML作为模板来进行数据填充，进行导出功能的实现！)
	 * @param data
	 *            待填充数据
	 * @param templateDirectory
	 *            模板文件所有目录
	 * @param templateFileName
	 *            模板文件名称
	 * @param fileoutputDirectory
	 *            文件输出目录
	 * @param fileoutputFileName
	 *            输出文件名
	 * @date 2016年2月2日 liqiao created
	 */
	@SuppressWarnings("unchecked")
	public static void fileExport(final Map<String, Object> data, final String templateDirectory,
			final String templateFileName, final String fileoutputPath) {
		try {
			File templateDirectoryFile = new File(templateDirectory);
			if (!templateDirectoryFile.exists()) {
				FreemarkerUtil.LOGGER.error("freemarker模板目录不存在:" + templateDirectory);
				throw new RuntimeException("freemarker模板目录不存在:" + templateDirectory);

			}
			File templateFile = new File(templateDirectoryFile, templateFileName);
			if (!templateFile.exists()) {
				FreemarkerUtil.LOGGER.error("freemarker模板文件不存在:" + templateFileName);
				throw new RuntimeException("freemarker模板文件不存在:" + templateFileName);

			}
			Configuration configuration = new Configuration();
			configuration.setDefaultEncoding(FreemarkerUtil.TEMPLATE_FILE_ENCODING);
			configuration.setDirectoryForTemplateLoading(templateDirectoryFile);
			Template template = configuration.getTemplate(templateFileName);
			File outFile = new File(fileoutputPath);
			if (!outFile.getParentFile().exists()) {
				outFile.getParentFile().mkdirs();
			}
			Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outFile),
					FreemarkerUtil.FILE_OUTPUT_ENCODING));
			template.process(data, writer);
			writer.flush();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @title exportString
	 * @param data
	 *            数据模型
	 * @param templateDirectory
	 *            模板文件目录
	 * @param templateFileName
	 *            模板文件名
	 * @return 视图字符串
	 * @date 2016年6月2日 liqiao created
	 */
	public static String exportString(final Map<String, Object> data, final String templateDirectory,
			final String templateFileName) {
		try {
			StringBuffer resultSB = new StringBuffer();
			Configuration configuration = new Configuration();
			configuration.setDefaultEncoding(FreemarkerUtil.TEMPLATE_FILE_ENCODING);
			File templateDirectoryFile = new File(templateDirectory);
			if (!templateDirectoryFile.exists()) {
				FreemarkerUtil.LOGGER.error("freemarker模板目录不存在:" + templateDirectory);
				return null;
			}
			configuration.setDirectoryForTemplateLoading(templateDirectoryFile);
			Template template = configuration.getTemplate(templateFileName);
			if (StringUtils.isEmpty(templateFileName) || template == null) {
				FreemarkerUtil.LOGGER.error("freemarker模板目录不存在:" + templateDirectory);
				return null;
			}
			StringWriter writer = new StringWriter(1024);
			resultSB = writer.getBuffer();
			template.process(data, writer);
			writer.flush();
			writer.close();
			return resultSB.toString();
		} catch (Exception e) {
			FreemarkerUtil.LOGGER.error("异常：" + e.toString());
			return null;
		}

	}

	/**
	 * 对工具类进行测试.
	 * 
	 * @title main
	 * @param args
	 *            输入参数
	 * @date 2016年2月3日 liqiao created
	 */
	public static void main(final String[] args) {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("name", "李桥");
		data.put("manager", "某某某");
		data.put("lover", "电影");
		String templateDirectory = "F://txt_dir";
		String templateFileName = "info_excel.ftl";
		String fileoutputPath = "F://txt_dir/info.xls";
		// FreemakerUtil.fileExport(data, templateDirectory, templateFileName,
		// fileoutputPath);
		String s = FreemarkerUtil.exportString(data, templateDirectory, templateFileName);
		System.err.println("s:" + s);

	}
}
