package homeworkJava_3_8;

import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		List<Shape> shapesList = new ArrayList<Shape>();

		shapesList.add(new Circle());
		shapesList.add(new Rectangle());
		shapesList.add(new Square());

		for (Shape shape : shapesList) {
			shape.draw();
		}

	}

}
