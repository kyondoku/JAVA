package com.kyondoku.first;

public class Operator7 {

	public static void main(String[] args) {
		int n1 = 5;
		int n2 = 5;
		int n3 = 6;
		
		System.out.println((n1 == n2) && (n1 == n3) && (n2 == n3));
//		하나라도 false이면 다 false
		System.out.println((n1 == n2) || (n1 == n3) || (n2 == n3));
//		하나만 true이면 true

	}

}
