package jmx;

/**
 * 请输入功能
 * 
 * @date 2018年2月24日 下午5:13:49
 * @author Li Qiao
 * @version 1.0
 */

public class CurrentUser implements CurrentUserMBean {
	private String name;

	private String age;

	/** getter: name */
	@Override
	public String getName() {
		System.out.println("读name=" + this.name);
		return this.name;
	}

	/** setter: name */
	@Override
	public void setName(String name) {
		System.out.println("设置name=" + this.name);
		this.name = name;
	}

	/** getter: age */
	@Override
	public String getAge() {
		System.out.println("读age=" + this.age);
		return this.age;
	}

	/** setter: age */
	@Override
	public void setAge(String age) {
		System.out.println("设置age=" + this.age);
		this.age = age;
	}

	@Override
	public void printInfo() {
		System.out.println(String.format("name=%s,age=%s", this.name, this.age));
	}

}
