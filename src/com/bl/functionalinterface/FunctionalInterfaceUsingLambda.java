package com.bl.functionalinterface;

public class FunctionalInterfaceUsingLambda {
	
	public static void main(String[] args) {
		Car car = ()->{System.out.println("cars speed checked by lambda expression");};
		car.speed();
	}
}
