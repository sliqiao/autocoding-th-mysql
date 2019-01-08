package designpattern.simplefactorymethod.subject1;

/**
 * 客户端代码
 * 
 * @date 2018年1月29日 下午1:20:24
 * @author 李桥
 * @version 1.0
 */

public class ClientTest {

	public static void main(String[] args) {
		Shape rectangleShape = ShapeFactory.createShape(ShapeFactory.ShapeEnum.RectangleShape);
		Shape circleShape = ShapeFactory.createShape(ShapeFactory.ShapeEnum.CircleShape);
		Shape triangleShape = ShapeFactory.createShape(ShapeFactory.ShapeEnum.TriangleShape);
	}
}
