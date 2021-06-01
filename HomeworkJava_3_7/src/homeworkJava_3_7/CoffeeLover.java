package homeworkJava_3_7;

import java.util.List;

public class CoffeeLover {
	private List<CoffeeMachine> coffeeMachines;

	public CoffeeLover() {
	}

	public void setCoffeeMachine(List<CoffeeMachine> coffeeMachines) {
		this.coffeeMachines = coffeeMachines;
	}

	public void makeCoffee() {
		coffeeMachines.forEach(cm -> cm.start());
	}
}
