package com.kyondoku.first;

public class Operator6 {

	public static void main(String[] args) {
		String str1 = "안녕1";
		String str2 = "안녕2";
		
		String str3 = str1;
//		주소값이 다르니까 다른거임. 같은반에 동명이인이 다른 사람인거랑 같은 원리
		
		System.out.println(str1 == str3);
		System.out.println(str2.equals(str1));
		System.out.println("안녕1".equals(str1));
		
//		String(문자열) 비교는 무조건 equals로 해야됨
		
	}
}
