package homeworkJava_3_3;

import java.util.List;

public class SumAreas {
	private List<Shape> shapes;
	private double sumAreas = 0;

	public SumAreas(List<Shape> shapeList) {
		this.shapes = shapeList;
	}

	public void sum() {
		for (Shape shape : this.shapes) {
			this.sumAreas += shape.getArea();

		}
	}

	public double getSumAreas() {
		return this.sumAreas;
	}
}
