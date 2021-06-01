package homeworkJava_3_9;

public class Rectangle implements Shape {
	private double width, height;

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		System.out.print("The area of RECTANGLE is: ");
		return this.width * this.height;
	}
}
