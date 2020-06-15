package com.kyondoku.first;

public class Operator5 {
	
	public static void main(String[] args) {
//		비교연산자 > boolean
		int n1 = 12;
		int n2 = 11;
				
		boolean result = ((n1 == n2) == false);
		System.out.println("n1 == n2 : " + !result);
		System.out.println(!(n1 != n2));
//		==은 비교연산자, 같냐 안같냐 물어보는거
		System.out.println(n1);
		
		System.out.println();
		
		result = (n1 != n2); // n1이랑 n2랑 같지 않니?
		System.out.println(result);
		System.out.println(n1 != n2);
		
		System.out.println();
		result = n1 >= n2;
		System.out.println("n1 > n2 : " + result);
		result = n2 <= n1;
		System.out.println("n2 > n1 : " + result);
		
//		== 같다
//		!= 다르다

	}
}
