package com.autocoding.model;

import com.autocoding.freemarker.FreemarkerTag;
import com.autocoding.util.ColumnUtil;

/**
 * @author Administrator 数据库列信息、实体类属性信息
 * 
 */
public class Field {
	public static int MAX_FIELD_DESC_LENGTH = 150;

	private Entity entity;
	/** 数据库列名 */
	private final String fieldName;
	/** 实体类属性名 */
	private final String propertyName;
	/** 数据库列注释 */
	private final String fieldDes;
	/** 数据库列类型 */
	private int dataType;
	/** NUMBER类型的精度 */
	private int precision;

	/** Java实体属性类型 */
	private String propertyType;

	/** 数据库列jdbcType */
	private String jdbcType;
	/** getter字符串 */
	private String getter;
	/** 数据库中支持列最大长度 */
	private int columnLength;
	/** setter字符串 */
	private String setter;
	/** build字符串 */
	private String buildStr;
	/** 数据库列是否可以为空 */
	private boolean nullable;
	/** 该列是否为主键标志 */
	private final boolean primaryKey;
	private int scale;

	public Field(Entity entity, String fieldName, String propertyName, boolean primaryKey, String fieldDes) {
		super();
		this.entity = entity;
		this.fieldName = fieldName;
		this.primaryKey = primaryKey;
		this.propertyName = propertyName;
		this.fieldDes = fieldDes;
	}

	public String getFieldName() {
		return this.fieldName;
	}

	public boolean isPrimaryKey() {
		return this.primaryKey;
	}

	public String getPropertyName() {
		return this.propertyName;
	}

	public int getDataType() {
		return this.dataType;
	}

	public void setDataType(int dataType) {
		this.dataType = dataType;
	}

	public String getFieldDes() {
		if (this.fieldDes == null) {
			return "暂无描述";
		}
		return this.fieldDes;
	}

	public boolean isNullable() {
		return this.nullable;
	}

	public void setNullable(boolean nullable) {
		this.nullable = nullable;
	}

	public String getPropertyType() {

		return ColumnUtil.getDataType(this.getDataType(), this.scale);
	}

	public String getJdbcType() {

		return ColumnUtil.getJdbcType(this.getDataType(), this.scale);
	}

	private String createSetter() {
		StringBuffer codeBuffer = new StringBuffer();

		// public void setAreaId(String areaId) {
		/**
		 * @return 获取 fieldDes属性值
		 */
		codeBuffer.append("	 \r\n");
		int endIndex = this.getFieldDes().length() - 1;
		if (this.getFieldDes().length() > Field.MAX_FIELD_DESC_LENGTH) {
			endIndex = Field.MAX_FIELD_DESC_LENGTH;
		}
		codeBuffer.append("    /**设置属性：" + this.fieldDes + "*/");
		codeBuffer.append("	 \r\n");
		codeBuffer.append("    public void set" + ColumnUtil.getGetSetterNameByProp(this.getPropertyName()) + "("
				+ this.getPropertyType() + " " + this.getPropertyName() + ") {\r\n");
		codeBuffer.append("        this." + FreemarkerTag.Common.FIELD_PREFIX + this.getPropertyName() + " = "
				+ this.getPropertyName() + ";\r\n");
		codeBuffer.append("    }");

		return codeBuffer.toString();
	}

	private String createGetter() {
		StringBuffer codeBuffer = new StringBuffer();
		codeBuffer.append("	 \r\n");
		int endIndex = this.getFieldDes().length() - 1;
		if (this.getFieldDes().length() > Field.MAX_FIELD_DESC_LENGTH) {
			endIndex = Field.MAX_FIELD_DESC_LENGTH;
		}
		codeBuffer.append("    /**获取属性：" + this.fieldDes + "*/");
		codeBuffer.append("	 \r\n");
		codeBuffer.append("    public " + this.getPropertyType() + " get"
				+ ColumnUtil.getGetSetterNameByProp(this.getPropertyName()) + "() {\r\n");
		codeBuffer
				.append("        return this." + FreemarkerTag.Common.FIELD_PREFIX + this.getPropertyName() + ";\r\n");
		codeBuffer.append("    }\r\n");

		return codeBuffer.toString();
	}

	private String createBuildStr() {
		StringBuffer codeBuffer = new StringBuffer();
		codeBuffer.append("	 \r\n");
		int endIndex = this.getFieldDes().length() - 1;
		if (this.getFieldDes().length() > Field.MAX_FIELD_DESC_LENGTH) {
			endIndex = Field.MAX_FIELD_DESC_LENGTH;
		}
		codeBuffer.append("    /**设置属性：" + this.fieldDes + "*/");
		codeBuffer.append("	 \r\n");
		codeBuffer.append("    public " + this.entity.getEntityName() + " build"
				+ ColumnUtil.getGetSetterNameByProp(this.getPropertyName()) + "(" + this.getPropertyType() + " "
				+ this.getPropertyName() + ") {\r\n");
		codeBuffer.append("        this." + FreemarkerTag.Common.FIELD_PREFIX + this.getPropertyName() + " = "
				+ this.getPropertyName() + ";\r\n");
		codeBuffer.append("       return this ;\r\n");
		codeBuffer.append("    }");

		return codeBuffer.toString();
	}

	public String getGetter() {
		return this.createGetter();
	}

	public String getSetter() {
		return this.createSetter();
	}

	public String getBuildStr() {
		return this.createBuildStr();
	}

	public int getColumnLength() {
		return this.columnLength;
	}

	public void setColumnLength(int columnLength) {
		this.columnLength = columnLength;
	}

	public void setPrecision(int precision) {
		this.precision = precision;
	}

	public void setScale(int scale) {
		this.scale = scale;
	}

}
