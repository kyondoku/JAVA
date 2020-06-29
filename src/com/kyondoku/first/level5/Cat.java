package com.kyondoku.first.level5;

public class Cat extends Animal {
	
	@Override
	public void cry() {
		System.out.println("야옹~~");
	}
	
	public void sleep() {
		System.out.println("고양이 잔다~~");
//		이렇게 추가하면 애니멀 타입으로는 슬립을 호출못함. 
	}

}
