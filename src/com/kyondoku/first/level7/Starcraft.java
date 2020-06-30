package com.kyondoku.first.level7;

public class Starcraft {

	public static void main(String[] args) {
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		Marine m3 = new Marine();
		
		m1.attack(m1);
		m1.attack(m1);
		
		
		
		System.out.println("m1: " + m1);
		System.out.println("m2: " + m2);
		
//		마린, 현재 HP : 50

	}

}
