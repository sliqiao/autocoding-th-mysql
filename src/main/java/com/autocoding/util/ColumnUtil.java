package com.autocoding.util;

import java.sql.Types;

public class ColumnUtil {

	private ColumnUtil() {
	}

	public static String getJavaBeanNameBy(String entityName) {
		String javaBeanName = "";
		boolean bFlag = false;
		char ch;

		entityName = entityName.toUpperCase();
		for (int i = 0; i < entityName.length(); i++) {
			ch = entityName.charAt(i);
			if (!bFlag) {
				javaBeanName += ch;
				bFlag = true;
			} else {
				if (ch != '_') {
					javaBeanName += Character.toString(entityName.charAt(i)).toLowerCase();
				} else {
					bFlag = false;
				}
			}
		}

		return javaBeanName;
	}

	public static String getGetSetterNameByProp(String propName) {
		String getSetterName = propName.substring(0, 1).toUpperCase();
		getSetterName += propName.substring(1);

		return getSetterName;
	}

	public static String getJavaBeanPropsNameBy(String columnName) {
		String javaBeanName = "";
		boolean bFlag = false;
		boolean bFirstFlag = false;
		char ch;

		columnName = columnName.toUpperCase();
		for (int i = 0; i < columnName.length(); i++) {
			ch = columnName.charAt(i);
			if (!bFirstFlag) {
				javaBeanName += Character.toString(columnName.charAt(i)).toLowerCase();
				bFirstFlag = true;
				bFlag = true;
				continue;
			}

			if (!bFlag) {
				javaBeanName += ch;
				bFlag = true;
			} else {
				if (ch != '_') {
					javaBeanName += Character.toString(columnName.charAt(i)).toLowerCase();
				} else {
					bFlag = false;
				}
			}
		}

		return javaBeanName;
	}

	public static String getDataType(int iDataType, int scale) {
		String dataType = "";
		if (iDataType == Types.VARCHAR || iDataType == Types.CHAR || iDataType == Types.LONGVARCHAR
				|| iDataType == Types.CLOB) {
			dataType = "String";
		} else if (iDataType == Types.INTEGER || iDataType == Types.BIGINT || iDataType == Types.BIT
				|| iDataType == Types.TINYINT || iDataType == Types.NUMERIC) {
			dataType = "Integer";
			if (scale > 0) {
				dataType = "Double";
			}
		} else if (iDataType == Types.DOUBLE || iDataType == Types.FLOAT || iDataType == Types.DECIMAL) {
			dataType = "Double";
		} else if (iDataType == Types.DATE || iDataType == Types.TIMESTAMP || iDataType == Types.TIME) {
			dataType = "Date";
		} else if (iDataType == Types.BLOB) {
			dataType = "byte[]";
		}

		return dataType;
	}

	public static String getJdbcType(int iDataType, int scale) {
		String jdbcType = "Unkonwn";

		if (iDataType == Types.VARCHAR || iDataType == Types.CHAR || iDataType == Types.LONGVARCHAR
				|| iDataType == Types.CLOB) {
			jdbcType = "VARCHAR";
		} else if (iDataType == Types.INTEGER || iDataType == Types.BIGINT || iDataType == Types.BIT
				|| iDataType == Types.TINYINT || iDataType == Types.NUMERIC) {
			jdbcType = "INTEGER";
			if (scale > 0) {
				jdbcType = "DOUBLE";
			}
		} else if (iDataType == Types.DOUBLE || iDataType == Types.FLOAT) {
			jdbcType = "DOUBLE";
		} else if (iDataType == Types.DATE || iDataType == Types.TIMESTAMP || iDataType == Types.TIME) {
			jdbcType = "DATE";
		} else if (iDataType == Types.BLOB) {
			jdbcType = "byte[]";
		}

		return jdbcType;
	}

}
