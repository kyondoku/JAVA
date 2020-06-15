package com.kyondoku.first.mission;

import java.util.Scanner;

public class Mission5 {

		
//		점수를 입력해 주세요: (0~100)
//		90점 이상  A
//		80점 이상  B
//		70점 이상  C
//		나머지는 D입니다.
//		
//		일의 자리수가 7점 이상이면 +
//		일의 자리수가 3점 이하이면 -
//		
//		예를들어 95 > A, 
//		      97 > A+,
//		      83 > B-
		
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("몇점입니까?(0~100)");
		int score = scan.nextInt();
		scan.close();
		
		if(score > 100) { System.out.println("잘못 입력하셨습니다."); }
		
		if(score >= 90) {

			switch(score) {
			
			case 90: case 91: case 92: case 93:
				System.out.println("A-");
				break;
			case 94: case 95: case 96: 
				System.out.println("A");
				break;
			case 97: case 98: case 99: case 100:
				System.out.println("A+");
				break;
			}	
		} 
		
		if(score >= 80) {

			switch(score) {
			
			case 80: case 81: case 82: case 83:
				System.out.println("B-");
				break;
			case 84: case 85: case 86: 
				System.out.println("B");
				break;
			case 87: case 88: case 89: 
				System.out.println("B+");
				break;
			}	
		} 
		
		if(score >= 70) {

			switch(score) {
			
			case 70: case 71: case 72: case 73:
				System.out.println("C-");
				break;
			case 74: case 75: case 76: 
				System.out.println("C");
				break;
			case 77: case 78: case 79: 
				System.out.println("C+");
				break;
			}
			
		} else {
			System.out.println("D");
		}
	}
}
