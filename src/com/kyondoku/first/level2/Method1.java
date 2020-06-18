package com.kyondoku.first.level2;

public class Method1 {
	
//	위치에 따라서 메소드(객체안)라고 불리기도하고 함수(객체밖)라고 불린다.

//	public static은  무조건 작성
//	                   선언부:리턴타입/메소드명(매개변수) { 구현부 }
//	public static void main(String[] args) {   구현부
//	}                                             -> 정의
	
	/* 리턴타입 :  보이드 -> 일을 시켜도 회신이 없음
	  		      비보이드 -> 일을 시키면 데이터 회신?(레터럴or주소값)
	 
	 	메소드안에 메소드를 호출할수는 있지만 정의는 불가능함.
	
	 */
	
	
	public static void main(String[] args) {
	
//		 이름옆에 소괄호 -> 메소드와 연관되어있음
//		Method1.sum(10, 15); 원래는 이렇게 적어줘야하는데 같은 메소드안에 있는거라서 안적어줘도됨
		
//		Method1 me1 = new Method1();
//		me1.sum(10, 15); 밑에 static 안넣을 경우

//		     (인수)
		sum(15, 10); 
		minus(20, 5);
	
		
	}
	
//	     static을 안넣으면 메모리에 직접 올려야한다..?
	public static void sum(int n1, int n2) {
		System.out.println(n1 + n2);
//		return; 보이드에서는 자동으로 넣어주니까 안적어줘도됨, 선택적. 비보이드는 필수.
	}
	public static void minus(int n1, int n2) {
		System.out.println(n1 - n2);
	}

}
