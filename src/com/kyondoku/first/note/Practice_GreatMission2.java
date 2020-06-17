package com.kyondoku.first.note;

import java.util.Scanner;

public class Practice_GreatMission2 {
	public static void main(String[] args) {
		
		String[] Menu = {"사이다", "콜라", "환타", "마운틴듀", "초코우유", "바나나우유"};
		int[] Price = {500, 600, 700, 800, 400, 400};
		
		int TotalPrice = 0;
		
		System.out.println("-메뉴-");
		
		for(int i=0; i<Menu.length; i++) {
			System.out.printf("%d. %s(%d원)\n", i+1, Menu[i], Price[i]);
		}
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("메뉴를 선택하세요:(종료:0)");
			int num = sc.nextInt();
			
			if(num == 0) {
				System.out.printf("종료! %d원 사용", TotalPrice);
				break;
			} else if(num < 0 || num > Menu.length-1) {
				System.out.println("잘못 입력하셨습니다.");
			} else {
				System.out.printf("%s %d원\n", Menu[num-1], Price[num-1]);
				TotalPrice += Price[num-1];
			}
		}
	}
}
