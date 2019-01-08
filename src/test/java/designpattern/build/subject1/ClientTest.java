package designpattern.build.subject1;

/**
 * 模拟客户端：进行测试
 * 
 * @date 2018年1月2日 下午2:56:16
 * @author 李桥
 * @version 1.0
 */

public class ClientTest {
	public static void main(String[] args) {
		CharacterDirector director = new CharacterDirector(new HeroBuilder());
		Character character = director.create();
	}
}
