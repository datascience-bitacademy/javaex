package com.javaex.exception;

public class CustomArithmeticException extends ArithmeticException {
	//	필드 
	private int num1;
	private int num2;
	
	//	생성자 
	public CustomArithmeticException(String message, int num1, int num2) {
		super(message);
		this.num1 = num1;
		this.num2 = num2;
	}

	//	Getter
	public int getNum1() {
		return num1;
	}

	public int getNum2() {
		return num2;
	}
}
