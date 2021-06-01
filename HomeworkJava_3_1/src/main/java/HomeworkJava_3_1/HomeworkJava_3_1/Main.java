package HomeworkJava_3_1.HomeworkJava_3_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double a, b;
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		Equation equation = new Equation(a, b);
		equation.solve();

		JsonResult jsonData = new JsonResult(equation.getSolution(), equation.getErrorMessage());
		jsonData.parseJsonSolution();
		System.out.println(jsonData.getJsonData());

	}

}