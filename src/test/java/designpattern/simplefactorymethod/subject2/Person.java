package designpattern.simplefactorymethod.subject2;

/**
 * 人
 * 
 * @date 2017年11月24日 上午9:29:58
 * @author 李桥
 * @version 1.0
 */

public abstract class Person {
	private String sex;
	private String name;

	/** getter: sex */
	public String getSex() {
		return this.sex;
	}

	/** setter: sex */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/** getter: name */
	public String getName() {
		return this.name;
	}

	/** setter: name */
	public void setName(String name) {
		this.name = name;
	}

	public abstract void sleep();

	// 将工厂类角色与产品基石角色者合并
	// 这样搞，违反了单一职责原则，但是少了一个类
	public static Person createPerson(PersonEnum personEnum) {
		if (personEnum == PersonEnum.M) {
			return new Man();
		} else if (personEnum == PersonEnum.W) {
			return new Woman();
		} else if (personEnum == PersonEnum.R) {
			return new Robot();
		} else {
			throw new RuntimeException("非法参数异常");
		}
	}

	public enum PersonEnum {
		M, W, R;
	}

}
