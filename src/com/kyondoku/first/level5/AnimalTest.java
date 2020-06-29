package com.kyondoku.first.level5;

public class AnimalTest {

	public static void main(String[] args) {
		Animal ani = new Dog();
		ani.cry();
		ani = new Cat();
		ani.cry();
//		ani.sleep(); 슬립을 알지 못하니까 호출 불
		
		Cat cat = (Cat)ani;
		cat.cry();
		cat.sleep();
		
		Animal dog = new Dog();
		dog.eat();
	
	}

}
