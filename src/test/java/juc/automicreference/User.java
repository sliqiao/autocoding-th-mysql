package juc.automicreference;

/**
 * 请输入功能
 * 
 * @date 2017年12月19日 上午8:34:57
 * @author 李桥
 * @version 1.0
 */

public class User {

	private int id;
	private String name;

	/** getter: id */
	public int getId() {
		return this.id;
	}

	/** setter: id */
	public void setId(int id) {
		this.id = id;
	}

	/** getter: name */
	public String getName() {
		return this.name;
	}

	/** setter: name */
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * 方法重写、覆盖
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + this.id;
		return result;
	}

	/*
	 * 方法重写、覆盖
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (this.id != other.id)
			return false;
		return true;
	}

	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
