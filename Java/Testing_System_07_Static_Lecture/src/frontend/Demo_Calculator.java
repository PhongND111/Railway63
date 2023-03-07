package frontend;

import entity.Calculator;

public class Demo_Calculator {
	public static void main(String[] args) {
		int aInput = 10;
		int bInput = 20;

		Calculator calculator = new Calculator();
		int sumResult = calculator.sum(aInput, bInput);
		System.out.println(sumResult);

		System.out.println(Calculator.sum(aInput, bInput));
	}
}
