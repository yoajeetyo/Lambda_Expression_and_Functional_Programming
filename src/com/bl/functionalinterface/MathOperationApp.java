package com.bl.functionalinterface;

@FunctionalInterface
interface IMathFunction{
	int calculate(int a , int b);
	static void printResult(int a , int b , String function , IMathFunction fobj) {
		System.out.println("The result of "+function+" is : "+fobj.calculate(a, b));
	}
}

public class MathOperationApp {
	
public static void main(String[] args) {
	IMathFunction addFunction = Integer::sum;
	IMathFunction mulFunction = (x,y)->x*y;
	IMathFunction divFunction = (x,y)->x/y;
	
	//System.out.println("Addition is : "+ addFunction.calculate(16 , 6));
	//System.out.println("Multiplication is : "+ mulFunction.calculate(4 , 6));
	//System.out.println("Division is : "+ divFunction.calculate(8 , 4));
	
	IMathFunction.printResult(20, 4, "Addition", addFunction);
	IMathFunction.printResult(20, 4, "Multiplication", mulFunction);
	IMathFunction.printResult(20, 4, "Division", divFunction);
}
}
