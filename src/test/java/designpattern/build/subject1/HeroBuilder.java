package designpattern.build.subject1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 具体建造者：英雄人物建造者
 * 
 * @date 2018年1月2日 下午2:50:18
 * @author 李桥
 * @version 1.0
 */

public class HeroBuilder extends CharacterBuilder {
	private static Logger s_logger = LoggerFactory.getLogger(HeroBuilder.class);

	@Override
	public void buildSex() {
		super.character.setSex("英雄的性别 ");
	}

	@Override
	public void buildFaceType() {
		super.character.setFaceType("英雄之脸 ");
	}

	@Override
	public void buildCostume() {
		super.character.setCostume("英雄的服装");
	}

	@Override
	public void buildHairStyle() {
		super.character.setHairStyle("英雄的发型");
	}

}
