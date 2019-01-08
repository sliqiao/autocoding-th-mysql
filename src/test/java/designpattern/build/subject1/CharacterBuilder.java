package designpattern.build.subject1;

/**
 * 抽象建造者
 * 
 * @date 2018年1月2日 下午2:47:05
 * @author 李桥
 * @version 1.0
 */

public abstract class CharacterBuilder {
	protected Character character;

	public abstract void buildSex();

	public abstract void buildFaceType();

	public abstract void buildCostume();

	public abstract void buildHairStyle();

	public Character getCharacter() {
		return this.character;
	}
}
