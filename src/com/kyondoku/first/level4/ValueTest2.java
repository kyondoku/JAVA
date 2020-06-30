package com.kyondoku.first.level4;

//	  class앞에 final붙이면 상속불가
public class ValueTest2 {

	public static void main(String[] args) {
		String str = new String("안녕");
		System.out.println("str: " + str);
		
		System.out.println();
		
		Value val = new Value(2000000);
		System.out.println("val : " + val);
//		                           val.toString()이 되는거..?
		
		
		
//		
//		String strVal = String.valueOf(val);
//		String strVal2 = strVal.toString();

	}
	


}
