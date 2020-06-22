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
	
	
//	스트링값2개와 정수1개를 받는 생성자
	public Car(String name, String color, int cc) {
//		super(); 위에는 아무것도 적을수 없음. super가 가장 먼저 실행되어야 하니까
		super(); /* Object의 기본 생성자를 호출 */
		this.name = name;
		this.color = color;
		this.cc = cc;
//		this.은 내가 가지고 있는 메소드를 호출 , super.는 부모가 가지고 있는 메소드를 호출
}

	public Car(String name) {
		this(name, "검정색", 3000);

	}
	
	public Car(String name, int cc) {
		this(name, "검정색", cc);
	}
	
	
//	생성자는 여러개 만들수 있음. 구분만 할수 있으면.

	public void introduceMyCar() {
		System.out.printf("%s의 컬러는 %s이고 %dcc이다.\n"
				, name, color, cc);
	}
}
