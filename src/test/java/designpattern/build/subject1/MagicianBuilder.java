package designpattern.build.subject1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 请输入功能
 * 
 * @date 2018年1月2日 下午2:52:46
 * @author 李桥
 * @version 1.0
 */

public class MagicianBuilder extends CharacterBuilder {
	private static Logger s_logger = LoggerFactory.getLogger(MagicianBuilder.class);

	@Override
	public void buildSex() {
		super.character.setSex("法师的性别 ");
	}

	@Override
	public void buildFaceType() {
		super.character.setFaceType("法师的脸型");
	}

	@Override
	public void buildCostume() {
		super.character.setCostume("法师的服装 ");
	}

	@Override
	public void buildHairStyle() {
		super.character.setHairStyle("法师的发型");
	}

}
