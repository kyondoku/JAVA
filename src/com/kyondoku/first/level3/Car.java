package com.kyondoku.first.level3;

public class Car {
	String name;
	String color;
	int cc;
	
//	        1. 생성자이름이 클래스명과 같다. 2. 리턴타입이 없다.
	public Car() {
		/*생략가능, 내 직속부모의 주소값 . 내 부모의 기본 생성자를 호출하겠다는 의미*/
		this("소나타", "흰색", 2500);
	}
	
	

	public Car(String name, String color, int cc) {
	super();
	this.name = name;
	this.color = color;
	this.cc = cc;
}



	public void introduceMyCar() {
		System.out.printf("%s의 컬러는 %s이고 %dcc이다.\n"
				, name, color, cc);
	}
}
