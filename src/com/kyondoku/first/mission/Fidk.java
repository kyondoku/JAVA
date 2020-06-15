package com.kyondoku.first.mission;

import java.util.Scanner;

public class Fidk {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
			
		int sum = 0;
		
		while(true) {
			System.out.println("숫자를 입력:(종료:0)");
			int num = scan.nextInt();
			
			if(num == 0) {
				break;
			}
			sum += num; /* sum = sum + num; */
		}
		
		System.out.println("합계: " + sum);
		scan.close();

	}

}
