package com.kyondoku.first.mission;

public class Mission1 {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 3;
		float result = (float)n1 / n2;
//		int 나누기 float이 안되므로 n2가 강제형변환된다 float로
		System.out.println(result);
		System.out.printf("%.1f\n", result);
		
		//결과를 변수에 담고, 그 변수를 콘솔에 찍으면 3.33333 어쩌고가 나오도록 만들기.
		
		
	}
}
