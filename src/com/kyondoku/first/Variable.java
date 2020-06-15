package com.kyondoku.first;

public class Variable {
	public static void main(String[] args) {
		char v1; //정수형타입 , 변수선언(변수선언은 한번만)
		v1 = 'A';
		System.out.println(v1);
		System.out.println('A');
		
		v1 = 'B'; 
		System.out.println(v1);
		
		byte v2; //정수형타입 
		short v3; //정수형타입
		int v4; //정수형타입
		long v5; //정수형타입
		
		v2 = (byte)128; //강제 형변환
		v3 = 540;
		v4 = 30;
		v5 = 50; //자동 형변환
		
		
		
		System.out.println(v2);
		System.out.println(v2 + v2); // overflow발생안됨
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
		
		float v6; //실수형타입 속도가 더 빠르긴한데 덜 정확
		v6 = 10.1f;
		v6 = 10.1F;
		v6 = (float)10.1;
		
		double v7; //실수형타입 *추천* 플롯보다 더 정확?
		v7 = 10.1;
		
		v6 = (float)v7; //v7에 있는 값이 감당할수 없는 값이면 오버플로우 발생
		v7 = (double)v6;
		
		boolean v8; //불린타입
		System.out.println();
		v8 = true;
		System.out.println(v8);
		v8 = false;
		System.out.println(v8);
		
		
		String r1;
		r1 = "안녕하세요."; //레퍼런스변수
		
		
		System.out.println(r1);
		
		Variable r2; //레퍼런스변수
	}
}
