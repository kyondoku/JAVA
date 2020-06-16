package com.kyondoku.first.mission;

import java.util.Scanner;

public class Mission8_ans {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int min = 10;
		int max = 80;

		System.out.printf("랜덤값 %d~%d을 맞추는 게임\n", min, max);

		int rVal = (int) (Math.random() * (max - min + 1) + min);

		while (true) {
			System.out.println("랜덤값을 입력하세요");
			int val = scan.nextInt();

			if (val < min || val > max) {
				System.out.println("범위의 값을 입력하세요.");

			} else if (val > rVal) {
				System.out.println("DOWN");

			} else if (val < rVal) {
				System.out.println("UP");

			} else {
				break;
			}
		}
		System.out.println("Great!!");
	}
}
