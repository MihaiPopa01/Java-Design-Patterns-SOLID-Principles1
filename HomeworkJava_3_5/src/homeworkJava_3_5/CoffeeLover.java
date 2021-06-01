package homeworkJava_3_5;

public class CoffeeLover {
	private SimpleCoffeeMachine simple;
	private ComplexCoffeeMachine complex;

	public CoffeeLover() {
	}

	public void prepareSimpleCoffee() {
		this.simple = new SimpleCoffeeMachine();
	}

	public void prepareComplexCoffee() {
		this.complex = new ComplexCoffeeMachine();
	}

	public void makeCoffee() {
		simple.start();
		complex.start();
	}
}
