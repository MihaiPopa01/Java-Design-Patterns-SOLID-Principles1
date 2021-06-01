package homeworkJava_3_7;

import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		List<CoffeeMachine> coffeeMachines = new ArrayList<CoffeeMachine>();
		coffeeMachines.add(new SimpleCoffeeMachine());
		coffeeMachines.add(new SimpleCoffeeMachine());
		coffeeMachines.add(new SimpleCoffeeMachine());
		coffeeMachines.add(new ComplexCoffeeMachine());
		coffeeMachines.add(new ComplexCoffeeMachine());
		coffeeMachines.add(new ComplexCoffeeMachine());

		CoffeeLover coffeeLover = new CoffeeLover();
		coffeeLover.setCoffeeMachine(coffeeMachines);
		coffeeLover.makeCoffee();

	}

}
