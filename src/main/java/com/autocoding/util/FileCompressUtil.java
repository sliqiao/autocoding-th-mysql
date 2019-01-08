package com.autocoding.util;

import java.io.File;

import org.apache.tools.ant.Project;
import org.apache.tools.ant.taskdefs.Zip;
import org.apache.tools.ant.types.FileSet;

/**
 * 
 * 文件压缩工具类：
 * 
 * @author liqiao
 * @since JDK 1.6
 * @version 1.0
 * @description: TODO
 * @log:2016年6月4日 上午10:39:28 liqiao create
 */
public class FileCompressUtil {
	/**
	 * 
	 * 压缩
	 * 
	 * @param srcDir
	 *            需要被压缩的文件目录或者文件
	 * @param destFile
	 *            输出文件绝对路径
	 * @date 2016年6月4日 liqiao created
	 */
	public static void compress(String srcDir, String destFile) {
		File srcdir = new File(srcDir);
		if (!srcdir.exists()) {
			throw new RuntimeException(srcDir + "不存在！");
		}

		Project prj = new Project();
		Zip zip = new Zip();
		zip.setProject(prj);
		File zipFile = new File(destFile);
		zip.setDestFile(zipFile);
		FileSet fileSet = new FileSet();
		fileSet.setProject(prj);
		fileSet.setDir(srcdir);
		// fileSet.setIncludes("**/*.java"); //包括哪些文件或文件夹
		// eg:zip.setIncludes("*.java");
		// fileSet.setExcludes(...); //排除哪些文件或文件夹
		zip.addFileset(fileSet);
		zip.execute();
	}

	public static void main(String[] args) {
		String srcDir = "E:\\xml_message";
		String destFile = "E:\\xml_message\\liqiao.zip";
		FileCompressUtil.compress(srcDir, destFile);
	}
}
