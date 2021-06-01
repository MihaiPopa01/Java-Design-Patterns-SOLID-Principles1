package homeworkJava_3_3;

import java.util.List;
import java.util.ArrayList;

public class ShapesList {
	private List<Shape> shapes = new ArrayList<>();

	public ShapesList() {
	}

	public List<Shape> getShapes() {
		return shapes;
	}

	public void addShape(Shape shape) {
		this.shapes.add(shape);
	}

}