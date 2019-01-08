package designpattern.build.subject2;

/**
 * 产品角色
 * 
 * @date 2018年1月2日 下午2:28:29
 * @author 李桥
 * @version 1.0
 */

public class Computer {
	private String cpu;
	private String mem;
	private String disk;
	private String displayer;

	/** getter: cpu */
	public String getCpu() {
		return this.cpu;
	}

	/** setter: cpu */
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	/** getter: mem */
	public String getMem() {
		return this.mem;
	}

	/** setter: mem */
	public void setMem(String mem) {
		this.mem = mem;
	}

	/** getter: disk */
	public String getDisk() {
		return this.disk;
	}

	/** setter: disk */
	public void setDisk(String disk) {
		this.disk = disk;
	}

	/** getter: displayer */
	public String getDisplayer() {
		return this.displayer;
	}

	/** setter: displayer */
	public void setDisplayer(String displayer) {
		this.displayer = displayer;
	}

}
