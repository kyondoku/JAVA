package com.kyondoku.first.level4;

// 상속관계에서 수직관계만 존재하지 형제같은거 없음.
public class Animal {
	private String name;
	private String type; //포유류, 조류, 어류
	
	protected Animal(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	
	
	void crying() {
		System.out.println("울다~~");
	}
	
	void eat() {
		System.out.println("먹다~~");
	}
	
	void whoAmI() {
		System.out.printf("나는 %s입니다.\n", name);
	}
}
