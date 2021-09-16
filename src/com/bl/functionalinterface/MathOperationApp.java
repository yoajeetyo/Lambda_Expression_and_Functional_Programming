package com.bl.functionalinterface;

@FunctionalInterface
interface IMathFunction{
	
	int calculate(int a , int b);
	}

public class MathOperationApp {
	
public static void main(String[] args) {
	IMathFunction addFunction = Integer::sum;
	IMathFunction mulFunction = (x,y)->x*y;
	IMathFunction divFunction = (x,y)->x/y;
	
	System.out.println("Addition is : "+ addFunction.calculate(16 , 6));
	System.out.println("Multiplication is : "+ mulFunction.calculate(4 , 6));
	System.out.println("Division is : "+ divFunction.calculate(8 , 4));
}
}
