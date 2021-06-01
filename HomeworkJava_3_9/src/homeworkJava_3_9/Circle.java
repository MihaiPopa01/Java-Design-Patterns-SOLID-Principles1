package homeworkJava_3_9;

public class Circle implements Shape {
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getArea() {
		System.out.print("The area of CIRCLE is: ");
		return Math.PI * this.radius * this.radius;
	}
}