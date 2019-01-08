package designpattern.build.subject1;

/**
 * 产品角色：人物
 * 
 * @date 2018年1月2日 下午2:45:13
 * @author 李桥
 * @version 1.0
 */

public class Character {
	private String sex;
	private String faceType;
	private String costume;
	private String hairStyle;

	/** getter: sex */
	public String getSex() {
		return this.sex;
	}

	/** setter: sex */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/** getter: faceType */
	public String getFaceType() {
		return this.faceType;
	}

	/** setter: faceType */
	public void setFaceType(String faceType) {
		this.faceType = faceType;
	}

	/** getter: costume */
	public String getCostume() {
		return this.costume;
	}

	/** setter: costume */
	public void setCostume(String costume) {
		this.costume = costume;
	}

	/** getter: hairStyle */
	public String getHairStyle() {
		return this.hairStyle;
	}

	/** setter: hairStyle */
	public void setHairStyle(String hairStyle) {
		this.hairStyle = hairStyle;
	}

}
