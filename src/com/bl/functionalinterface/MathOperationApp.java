package com.bl.functionalinterface;

@FunctionalInterface
interface IMathFunction {
	int calculate(int a, int b);

	static void printResult(int a, int b, String function, IMathFunction fobj) {
		System.out.println("The result of " + function + " is : " + fobj.calculate(a, b));
	}
}

public class MathOperationApp {

	public static void main(String[] args) {
		IMathFunction addFunction = Integer::sum;
		IMathFunction mulFunction = (x, y) -> x * y;
		IMathFunction divFunction = (x, y) -> {
//		if (y==0) {
//			return 0;
//		}
			return x / y;
		};

		System.out.println("Addition is : " + addFunction.calculate(16, 6));
		System.out.println("Multiplication is : " + mulFunction.calculate(4, 6));
		try {
			System.out.println("Division is : " + divFunction.calculate(8, 0));
		} catch (Exception e) {
			System.out.println(e.getMessage() + " : please provide y as non zero value");
		}

		IMathFunction.printResult(20, 4, "Addition", addFunction);
		IMathFunction.printResult(20, 4, "Multiplication", mulFunction);
		try {
			IMathFunction.printResult(20, 0, "Division", divFunction);
		} catch (Exception e) {
			System.out.println(e.getMessage() + " : please provide y as non zero value");
		}
	}
}
