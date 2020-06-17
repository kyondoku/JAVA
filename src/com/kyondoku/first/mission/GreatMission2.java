package com.kyondoku.first.mission;

import java.util.Scanner;

public class GreatMission2 {

/*
 * 자판기 만들기
 * 
 * 1. 사이다(500원)
 * 2. 콜라(600원)
 * 3. 환타(700원)
 * 4. 마운틴듀(800원)
 * 5. 초코우유(400원)
 * 6. 바나나우유(400원)
 * 
 * 메뉴를 선택하세요: (종료:0)1
 * 사이다 500원
 * 메뉴를 선택하세요: (종료:0)5
 * 초코우유 400원
 * 메뉴를 선택하세요: (종료:0)7
 * 잘못입력!
 * 메뉴를 선택하세요: (종료:0)0
 * 종료! 900원 사용
 * 
 */
	
	public static void main(String[] args) {
		
	String[] menuArr = {"사이다", "콜라", "환타", "마운틴듀", "초코우유", "바나나우유"};
	int[] PriceArr = {500, 600, 700, 800, 400, 400};
	
	String quit = "종료!";
	int TotalPrice = 0;
	
	Scanner scan = new Scanner(System.in);
	
	for(int i=0; i<menuArr.length; i++) {
		System.out.printf("%d. %s(%,d원)\n",(i+1), menuArr[i], PriceArr[i]);
	}
	
	while(true) {
	System.out.println("메뉴를 선택하세요: (종료:0)");
	int num = scan.nextInt();
	
	if(num == 0) {
		System.out.printf("%s %d 사용", quit, TotalPrice);
		break;
	}
	
	if(num == 1) {
		System.out.printf("%s %d원\n", menuArr[0], PriceArr[0]);
		TotalPrice += PriceArr[0];
	} else if(num == 2) {
		System.out.printf("%s %d원\n", menuArr[1], PriceArr[1]);
		TotalPrice += PriceArr[1];
	} else if(num == 3) {
		System.out.printf("%s %d원\n", menuArr[2], PriceArr[2]);
		TotalPrice += PriceArr[2];
	} else if(num == 4) {
		System.out.printf("%s %d원\n", menuArr[3], PriceArr[3]);
		TotalPrice += PriceArr[3];
	} else if(num == 5) {
		System.out.printf("%s %d원\n", menuArr[4], PriceArr[4]);
		TotalPrice += PriceArr[4];
	} else if(num == 6) {
		System.out.printf("%s %d원\n", menuArr[5], PriceArr[5]);
		TotalPrice += PriceArr[5];
	} else {
		System.out.println("잘못 입력하셨습니다.");
	}
	

	}
		

	}

}
