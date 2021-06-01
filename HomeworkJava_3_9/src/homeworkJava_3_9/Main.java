package homeworkJava_3_9;

import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		List<Shape> shapesList = new ArrayList<Shape>();

		shapesList.add(new Circle(5));
		shapesList.add(new Rectangle(2, 4));
		shapesList.add(new Square(7));

		for (Shape shape : shapesList) {

			System.out.println(shape.getArea());
		}

	}

}
