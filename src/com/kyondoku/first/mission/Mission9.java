package com.kyondoku.first.mission;

public class Mission9 {

	/*
	 * 
	 * arr 1~100값이 들어가도록 해주세요 순서대로 0번방에 1 1번방에 2 ... 99번방에 100 ------- 각방에 있는 모든 값을
	 * 더한 후 결과값 출력 ------- 각각 for문 따로
	 * 
	 */

	public static void main(String[] args) {
		int[] arr = new int[10];

//		for(int i=0; i<arr.length; i++) {
//			arr[i] = i + 1;
//		}

//		for(int i=0; i<arr.length; i++) {
//			System.out.println(i + ":" + arr[i]);
//		}

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1) * 2;
		}

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("sum : " + sum);

		for (int i = 0; i < arr.length; i++) {
			if (i != 0) {
				System.out.print(", ");
			}
			System.out.print(arr[i]);

		}

	}
}
