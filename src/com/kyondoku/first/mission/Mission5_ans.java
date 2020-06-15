package com.kyondoku.first.mission;

import java.util.Scanner;

public class Mission5_ans {

		
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
		
		if(score > 100 || score < 1) {
			System.out.println("잘못 입력되었습니다.");
			
		} else if(score >= 90) {
			System.out.print("A");
			
		} else if(score >= 80) {
			System.out.print("B");
			
		} else if(score >= 70) {
			System.out.print("C");
			
		} else {
			System.out.print("D");
		}
		
		if(score == 100) {
			System.out.println("+");
			
		} else if(score >= 70) {
			int mod = score % 10;
			
			if(mod >= 7) {
				System.out.println("+");
			} else if(mod < 4) {
				System.out.println("-");
			}
		}
		
		
	
	}	
}
	