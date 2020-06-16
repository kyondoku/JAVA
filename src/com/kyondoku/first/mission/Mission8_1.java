package com.kyondoku.first.mission;

import java.util.Scanner;

public class Mission8_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("랜덤값 10~90을 맞추는 게임");
		int min = 10;
		int max = 90;
		int rVal = (int)(Math.random() * (max - min + 1) + min);
		
		while(true) {
			System.out.println("랜덤값을 입력하세요");
			int val = scan.nextInt();
			
			if(rVal < val) {
				System.out.println("UP");
			} else if(val > rVal) {
				System.out.println("DOWN");
			} else {
				System.out.println("Great!!");
				break;
				}
			}
	}
}
		
