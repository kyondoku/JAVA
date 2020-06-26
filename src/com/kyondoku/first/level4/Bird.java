package com.kyondoku.first.level4;

public class Bird extends Animal {
	
//	protected인데 빨간줄이 안뜨는이유? 상속관계도 쓸수 있다.
	protected Bird(String name) {
		super(name, "조류");
	}

	
	void flying() {
		System.out.println("훨~ 훨~");
	}
	
//	실수하는걸 방지하기 위해 @Override 무조건 붙여야함
	@Override
	void crying() {
		super.crying();
		System.out.println("짹짹!!");
	}

}
