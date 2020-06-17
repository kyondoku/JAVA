package com.kyondoku.first.mission;

import java.util.Scanner;

public class GreatMission1 {
//	랜덤한 중복되지 않은 숫자 3개
//	(1~9)
//
//	4, 8, 2
//
//	-------
//	
//	1, 2, 3 > S:0 / B:1 / O:2
//	4, 5, 6 > S:1 / B:0 / O:2
//	
//	......	
//	
//	
	public static void main(String[] args) {
		final int LEN = 3;
		
		System.out.printf("숫자 %d 야구 게임 시작\n", LEN);
		
		int[] rArr = new int[LEN];
		int[] myArr = new int[LEN];
		
		for(int i=0; i<rArr.length; i++) {
			rArr[i] = (int)(Math.random() * 9 + 1);					
			
			for(int z=0; z<i; z++) {
				if(rArr[i] == rArr[z]) {
					i--;
					break;
				}
			}
		}
		
		while(true) {
			int s=0, b=0;
			
			System.out.print("숫자 입력: ");
			for(int i=0; i<myArr.length; i++) {
				Scanner scan = new Scanner(System.in);
				myArr[i] = scan.nextInt();
			}
			
			for(int i=0; i<LEN; i++) {
				for(int z=0; z<LEN; z++) {
					if(rArr[i] == myArr[z]) {
						if(i == z) {
							s++;
						} else {
							b++;
						}
					}
				}
			}
			
			if(s == LEN) {
				break;
			}
			
			System.out.printf("S:%d / B:%d / O:%d\n", s, b, (LEN-s-b));
			
			}	
		
			System.out.println("End!");
		}
	}