package com.bl.functionalinterface;

interface Interf {
	
	public int squareIt(int n);
}

public class SquareOfNumberUsingLambda {

	public static void main(String[] args) {
	Interf interf = n->n*n;
	System.out.println(interf.squareIt(4));
	}
}
