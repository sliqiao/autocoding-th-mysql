package designpattern.build.subject2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 客户端测试类
 * 
 * @date 2018年1月2日 下午2:41:57
 * @author 李桥
 * @version 1.0
 */

public class ClientTest {
	private static Logger s_logger = LoggerFactory.getLogger(ClientTest.class);

	public static void main(String[] args) {
		ComputerDirector director = new ComputerDirector(new NotebookBuilder());
		Computer notebookComputer = director.create();
		director = new ComputerDirector(new DesktopComputerBuilder());
		Computer desktopComputer = director.create();
	}
}
