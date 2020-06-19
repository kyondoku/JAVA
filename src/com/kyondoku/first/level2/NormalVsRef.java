package com.kyondoku.first.level2;

public class NormalVsRef {
	
//	일반변수와 레퍼런스 변수와 차이점을 이해해야한다.
//	둘다 값을 하나씩만 저장할수 있는것은 같음.
//	배열 : 레퍼런스 변수 (주소값을 저장)

	public static void main(String[] args) {
		int num = 10;
		System.out.println("before num : " + num);
		changeVal(num);
		System.out.println("after num : " + num);
		
//		객체의 주소값을 numArr에 저장
//		 A주소랑 B주소가 같음
//		      A주소
		int[] numArr = {10};
		System.out.println("before numArr[0] : " + numArr[0]);
		changeVal(numArr);
		System.out.println("after numArr[0] : " + numArr[0]);
		
	}
//	                            B주소/  주소값을 알려줌
	public static void changeVal(int[] numArr) {
		numArr[0] = 30;
	}
	
	public static void changeVal(int num) {
		num = 30;
		
	}

}
