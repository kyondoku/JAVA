package com.kyondoku.first.level2;

public class ArrayOrder {
	public static void main(String[] args) {
		int[] arr = { 29, 33, 15, 88, 5, 46, 92, 1, 19 };
		
		// 순차정렬


		for (int i = 0; i < arr.length - 1; i++) {

			for (int q = i + 1; q < arr.length; q++) {

				if (arr[i] > arr[q]) {

					int temp = arr[i];
					arr[i] = arr[q];
					arr[q] = temp;
				}
			}
		}
		for (int val : arr) {
			System.out.print(val + ", ");

		}
	}
}
