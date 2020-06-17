package com.kyondoku.first.mission;

import java.util.Scanner;

public class GreatMission2_ans2 {

	/*
	 * 자판기 만들기
	 * 
	 * 1. 사이다(500원) 2. 콜라(600원) 3. 환타(700원) 4. 마운틴듀(800원) 5. 초코우유(400원) 6.
	 * 바나나우유(400원)
	 * 
	 * 메뉴를 선택하세요: (종료:0)1 사이다 500원 메뉴를 선택하세요: (종료:0)5 초코우유 400원 메뉴를 선택하세요: (종료:0)7
	 * 잘못입력! 메뉴를 선택하세요: (종료:0)0 종료! 900원 사용
	 * 
	 */

	public static void main(String[] args) {

		String[] menuArr = { "사이다", "콜라", "환타", "마운틴듀", "초코우유", "바나나우유", "박카스" };
		int[] PriceArr = { 500, 600, 700, 800, 400, 400, 1000 };

		String quit = "종료!";
		int TotalPrice = 0;

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < menuArr.length; i++) {
			System.out.printf("%d. %s(%,d원)\n", (i + 1), menuArr[i], PriceArr[i]);
		}

		while (true) {
			System.out.println("메뉴를 선택하세요: (종료:0)");
			int num = scan.nextInt();

			if (num == 0) {
				System.out.printf("%s %d 사용", quit, TotalPrice);
				break;
			}

			if (num > menuArr.length) {
				System.out.println("잘못 입력하셨습니다.");
			} else {
				TotalPrice += PriceArr[num - 1];
				System.out.printf("%s  %d원\n합계 : %d\n", menuArr[num - 1], PriceArr[num - 1], TotalPrice);
				
			}

		}

		scan.close();
	}

}
