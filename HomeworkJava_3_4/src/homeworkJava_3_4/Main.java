package homeworkJava_3_4;

public class Main {

	public static void main(String[] args) {
		SimplePrinter simplePrinter = new SimplePrinter();
		FullyFunctionalPrinter fullyFunctionalPrinter = new FullyFunctionalPrinter();
		
		simplePrinter.print();
		fullyFunctionalPrinter.print();
		fullyFunctionalPrinter.scan();
		fullyFunctionalPrinter.fax();

	}

}
