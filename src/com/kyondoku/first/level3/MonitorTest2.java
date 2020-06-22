package com.kyondoku.first.level3;

public class MonitorTest2 {
	public static void main(String[] args) {
		Monitor.brand = "삼성";
		Monitor.printBrand();
//		static이 붙은 메소드를 호출할때는 그냥 바로 이렇게 하믄됨.
//		그래서 static 붙이는걸 지향. 근데 객체마다 다른값을 주고싶을때는 붙이면 안된다.
		
		
		Monitor m1 = new Monitor();
		m1.printInfo();
//		static이 안붙었을때는 객체화먼저하고 주소값으로 호출해야됨.
		
		int result = Integer.parseInt("11");
//					class명.메소드 -> static
		
		
	}
}
