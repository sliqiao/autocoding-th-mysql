package designpattern.build.subject1;

/**
 * 请输入功能
 * 
 * @date 2018年1月2日 下午2:54:27
 * @author 李桥
 * @version 1.0
 */

public class CharacterDirector {
	private CharacterBuilder builder;

	public CharacterDirector(CharacterBuilder builder) {
		this.builder = builder;
	}

	public Character create() {
		this.builder.buildCostume();
		this.builder.buildFaceType();
		this.builder.buildHairStyle();
		this.builder.buildSex();
		return this.builder.getCharacter();
	}
}
