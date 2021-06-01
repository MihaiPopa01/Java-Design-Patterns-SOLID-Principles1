package homeworkJava_3_9;

public class Square implements Shape {
	private double l;

	public Square(double l) {
		this.l = l;
	}

	public double getArea() {
		System.out.print("The area of SQUARE is: ");
		return this.l * this.l;
	}

}
