package HomeworkJava_3_1.HomeworkJava_3_1;

public class Equation {
	private double a, b;
	private double solution;
	private String errorMessage = "No error!";

	public Equation(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public void solve() {
		try {
			if (this.b > 0) {
				this.solution = this.b / this.a * -1;
			} else {
				this.solution = this.b / this.a;
			}

		} catch (Exception e) {
			this.errorMessage = e.toString();
		}
	}

	public double getSolution() {
		return this.solution;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
}
