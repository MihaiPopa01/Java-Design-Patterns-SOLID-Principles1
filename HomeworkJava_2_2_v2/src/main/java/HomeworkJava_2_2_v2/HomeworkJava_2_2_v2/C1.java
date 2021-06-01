package HomeworkJava_2_2_v2.HomeworkJava_2_2_v2;

import java.util.Scanner;

public class C1 {
	private double a, b;

	public C1() {
		Scanner scanner = new Scanner(System.in);
		int a, b;
		a = scanner.nextInt();
		b = scanner.nextInt();
		this.a = a;
		this.b = b;
	}

	public static double getSum(double a, double b) {
		return (a + b);
	}
}
