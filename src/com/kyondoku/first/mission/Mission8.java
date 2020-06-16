package com.kyondoku.first.mission;

import java.util.Scanner;

public class Mission8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		
		int rannum = (int)((Math.random() * 81) + 10);
		
		
		while(true) {
			System.out.println("랜덤값을 입력하세요");
			int num = scan.nextInt();
			if(num < rannum) {
				System.out.println("UP");
			} else if(num > rannum) {
				System.out.println("DOWN");
			} else {
				System.out.println("Great!!");
				break;
				}
			}
	}
}
		
