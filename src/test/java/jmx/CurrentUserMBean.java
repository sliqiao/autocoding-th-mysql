package jmx;

public interface CurrentUserMBean {
	public String getName();

	public void setName(String name);

	public String getAge();

	public void setAge(String age);

	public void printInfo();
}