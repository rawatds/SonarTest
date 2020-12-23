package com.dsr.sonartest;

public class MathUtil {

	//int unusedVar = 0;

	public static int sum(int a, int b) {
		System.out.printf("Calculating sum of %d and %d %n", a, b);
		return a + b;
	}

	public static int diff(int a, int b) {
		return a - b;
	}

	public static int mult(int a, int b) {
		return a * b;
	}

	public static int div(int a, int b) {
		return (a / b);
	}

}
