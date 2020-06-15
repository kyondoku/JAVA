package com.kyondoku.first.repeat;

public class For {

	public static void main(String[] args) {
		
//		첫번째칸은 초기값? 두번째칸은 조건, 증감식
//		       A        B       C
		for(int i=1; i<=10; i++) {
			System.out.println(i + "반복문!!"); //D
			
			
			
			
			// A > B > D > C
			//   > B > D > C
			//   > B > D > C
			//....
		}
	}
}
