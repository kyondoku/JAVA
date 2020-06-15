package com.kyondoku.first;

public class Variable2 {
//	static int NUM = 10; //전역변수
	
	public static void main(String[] args) {
		int num = 10;
		int num2, num3 = 20;		
		int num4 = 10, num5 = 20;
		
		//이름 주의사항! p.25
		//1.소문자로 시작 (가능한 카멜케이스 기법 사용) int myMaxHeight;
		//2.특수기호는 _(언더바), $(달러)만 사용 가능 - 특수기호로 시작해도 무방
		//3.숫자로 시작 X, 뒤에 붙이는건 괜찮음 e.g) int 12a;(x) int top10;(o)
		//4.예약어(보라색) 사용 금지! e.g) int char;
	    //5.변수명 띄우면 안됨 e.g) int aa aa;
		//6.대소문자를 가린다. e.g) int aa, aA, Aa, AA;
		
		final int MY_MAX_HEIGHT = 1_000_000; // 상수 _는 없는거랑 차이 x
		
		final int HEIGHT;
		HEIGHT = 100;
//		HEIGHT = 120; (x)
		
		//		MY_MAX_HEIGHT = 20; (x)
		System.out.println(MY_MAX_HEIGHT);
		
		//7. 상수명은 무조건 대문자, 구분은 언더바로 한다.
	}
}
