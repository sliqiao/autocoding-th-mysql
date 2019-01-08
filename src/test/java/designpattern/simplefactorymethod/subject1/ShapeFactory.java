package designpattern.simplefactorymethod.subject1;

/**
 * 形状工厂
 * 
 * @date 2017年11月24日 上午9:22:32
 * @author 李桥
 * @version 1.0
 */

public final class ShapeFactory {

	public static Shape createShape(ShapeEnum shapeEnum) {
		if (shapeEnum == ShapeEnum.RectangleShape) {
			new RectangleShape();
		} else if (shapeEnum == ShapeEnum.CircleShape) {
			new CircleShape();
		} else if (shapeEnum == ShapeEnum.TriangleShape) {
			new TriangleShape();
		} else {
			throw new UnSupportShapeException();
		}
		return null;

	}

	public static class UnSupportShapeException extends RuntimeException {
	}

	public static enum ShapeEnum {
		RectangleShape, CircleShape, TriangleShape;
	}

}
