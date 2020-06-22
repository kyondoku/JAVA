package com.kyondoku.first.level3;

public class Calc {
	int n1;
	int n2;
//	전역변수

	
	
//	메소드는 전부 멤버변수
	public int sum() {
		return n1 + n2;
	}
	
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	
}
