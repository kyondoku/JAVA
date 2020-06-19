package com.kyondoku.first.level2;

public class Method3 {

	public static void main(String[] args) {	
		int result = sum(15, 10); // = 오른쪽값을 먼저 실행하고 그 값을 왼쪽에 복사하는것
//		sum(15, 10); //빨간줄 안생김.
		System.out.println(result);
		
//		보이드형 왼쪽에는 =이 있을수 없음. 회신이 없으니까.
		
		result = minus(5, 3);
		System.out.println(result);
		

	}

//	비보이드형. 즉 반환값이 있는 것. return이 무조건 있어야됨. return을 만나는 순간 종료.
	public static int sum(int n1, int n2) {
		return n1 + n2; // 값을 가지고 호출한곳으로 돌아감.
//		return 10;  ===> 10 찍힘
	}
		
	public static int minus(int n1, int n2) {
		return n1 - n2;
	
	}
	
}
