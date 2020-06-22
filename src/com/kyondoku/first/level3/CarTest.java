package com.kyondoku.first.level3;

public class CarTest {

	public static void main(String[] args) {
		Car car = new Car();
//		기본생성자 호출
		Car car1 = new Car("그랜저", "검정색", 3000);
//		파라미터가 있는 생성자 호출
		Car car2 = new Car("그랜저");
		Car car3 = new Car("그랜저", 3000);
		
		car.introduceMyCar();
		car1.introduceMyCar();
		car2.introduceMyCar();
		car3.introduceMyCar();
		
		System.out.println("------------");

	}

}
