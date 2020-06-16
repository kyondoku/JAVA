package com.kyondoku.first.level2;

public class ArrayOrder2 {
	public static void main(String[] args) {
		int[] arr = { 29, 33, 15, 88, 5, 46, 92, 1, 19 };

		//선택정렬

		int least;
//		전체에서 제일 작은 숫자를 찾을거임
		for (int i = 0; i < arr.length - 1; i++) {
			least = i;
//			이때  least의 값은 0(0번째)
			for (int z = i + 1; z < arr.length; z++) {
				if (arr[least] > arr[z]) {
					least = z;
//					제일 처음 바뀔때는 2로 바뀜 29 > 15를 체크했을때.
				}
			}
			if (least != i) {
				int temp = arr[least];
				arr[least] = arr[i];
				arr[i] = temp;
			}
		}
		for(int val : arr) {
			System.out.print(val + ", ");
		}
	}
}
