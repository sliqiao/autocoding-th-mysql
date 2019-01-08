package com.autocoding.util;

import java.io.File;

public class MyStringUtil {

	private MyStringUtil() {

	}

	public static String getSeperatedPathFromPackage(String rootPackage) {

		String path = rootPackage.replaceAll("\\.", "\\" + File.separator);

		if (!path.endsWith(File.separator)) {
			path += File.separator;
		}

		return path;
	}

}
