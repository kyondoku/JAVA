package com.kyondoku.first.mission;

public class MethodMission1 {

	public static void main(String[] args) {

	guguDan(2, 3);	

	}

	
//	똑같은 이름의 메소드를 여러개 만드는것을 오버로딩
	
	public static void guguDan(int sDan, int eDan) {
		for(int i=sDan; i<eDan+1; i++) {
			guguDan(i);
		}
	}
	
	public static void guguDan(int dan) {
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, (dan*i));
		}
		System.out.println("-----------");
	}
}
