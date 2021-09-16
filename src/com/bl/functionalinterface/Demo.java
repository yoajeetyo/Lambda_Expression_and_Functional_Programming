package com.bl.functionalinterface;

public class Demo {
	
	public static void main(String[] args) {
		Car car = new Car() {
			public void speed() {
				System.out.println("cars speed is checked by simple method");
			}
		};
		car.speed();
	}
}
