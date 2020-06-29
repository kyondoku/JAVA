package com.kyondoku.first.level5;

public class AnimalMission {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Sparrow spa = new Sparrow();
		Animal ani = new Cat();

		ani.cry();
		ani = new Dog();
		
//		애니는 뉴캣의 객체 주소값을 가지고 있지만, 캣이 가지고 있는 sleep은 호출할수 없다.
//		이유는 애니멀은 슬립메소드를 가지고 있지 않기 때문에.
		
		
		
		doCry(dog);
		doCry(cat);
		doCry(spa);

	}
	
	public static void doCry(Animal species) {
		species.cry();
	}

}
