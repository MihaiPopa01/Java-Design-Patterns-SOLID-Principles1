package homeworkJava_3_3;

public class Main {

	public static void main(String[] args) {
		ShapesList shapesList = new ShapesList();

		shapesList.addShape(new Rectangle(2, 3));
		shapesList.addShape(new Rectangle(1, 8));
		shapesList.addShape(new Circle(5));
		shapesList.addShape(new Circle(10));

		SumAreas sumAreas = new SumAreas(shapesList.getShapes());

		sumAreas.sum();

		System.out.println(sumAreas.getSumAreas());

	}

}
