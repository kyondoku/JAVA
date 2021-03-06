package com.kyondoku.first.level4;

public class ValueTest {

	public static void main(String[] args) {
		String str = new String("A");
		String str2 = new String("A");
		
		System.out.println("1: " + (str == str2));
		System.out.println("2: " + str.equals(str2));
//                                  equals는 오브젝트로부터 상속받아서 씀.
//									오브젝트의 equals는 기본적으로 주소값 비교.
//	                                true인 이유 : string은 equals
		
		Value val1 = new Value(1); // int val =1
		Value val2 = new Value(1); // int val =1
		val2.getVal(); 
		
		System.out.println("3: " + (val1 == val2));
		System.out.println("4: " + val1.equals(val2));

	}

}
