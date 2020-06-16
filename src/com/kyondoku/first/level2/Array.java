package com.kyondoku.first.level2;

public class Array {
//	배열을 쓰는 이유? 선언을 덜하고 싶어,, 너무 많아,, 힘들;;;
//	그리고 순차적으로 선언하니까 반복문이랑 찰떡~
	public static void main(String[] args) {
		int[] arr = new int[100];
//		대괄호가 들어가면 배열, 배열은 레퍼런스 변수 / 100개짜리 방을 만든거임. arr[0]~arr[99]
		arr[0] = 10;
		arr[1] = 20;
//		값 넣는 방법
		char[] arr2 = new char[20];
//		char는 빈칸
		float[] arr3 = new float[10];
//		소문자로 시작하는 애들은 값안넣어주면 기본적으로 0
		String[] arr4 = new String[200];
//		대문자로 시작하는 애들은 값안넣어주면 기본적으로 null들어가있음
		
		int[] arr5 = {10, 20, 30, 40};
//		10, 20, 30, 40의 값을 넣은 방 4개를 만든거임.
		
		System.out.println(arr[0]);
		System.out.println(arr5[3]);
		System.out.println(arr4[1]);
		System.out.println(arr3[1]);
		System.out.println(arr2[1]);
		
		
		
		
		int[] arr7 = new int[50];
		
		for(int i=0; i<arr7.length; i++) {
			arr7[i] = 5; 
		}
		
		for(int i=0; i<arr7.length; i++) {
//			arr7.length < 여기에서 .뒤에 들어가는건 레퍼런스변수만? 주소값을 안다는건 개중요
//			()가 있으면 메소드, 없으면 속성값 -> length는 속성값(final이므로 수정도 불가)
			System.out.println(i + ": " + arr7[i]);
		}
		
//		for(int i=0; i<100; i++) {
//			arr7[i] = 5;
//			System.out.println(arr7[i]);
//		}  이렇게 하면 한번에 가능하지만, 비추천 왜냐면 나중에 메소드화할거기때문에 이렇게 만들면
//         재활용하기가 힘듬.
		
	}

}
