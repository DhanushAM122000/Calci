package com;

public class CalculatorImp implements Calculator {
	
	public int add(int x, int y) {
		return x+y;
	}
	
	public int sub(int x,int y) {
		return x-y;
	}
	
	public int mul(int x,int y) {
		return x*y;
		
	}
	public int div(int x, int y) { // x=10 y=10
		if(x!=0 && y!=0) {
		return x/y;
	}
		return 0;
	}
	
	public String displayErrorMessage() {
		return "Invalid choice";
	}

}
