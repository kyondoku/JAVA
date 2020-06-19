package com.kyondoku.first.level2;

import java.util.Arrays;

public class ArrCopy {

	public static void main(String[] args) {
		int[] arr = {2, 4, 6, 7, 10, 55, 52};
		int[] arr2 = new int[arr.length];
		
//		int[] arr2 = arr; 이렇게 바꾸는건 주소값을 복사하는거라서 같은값이 된다. 
//		이 상태에서
//		arr2[2] = 66; ===> arr[2], arr2[2] 둘다 66으로 바뀜.
		
		for(int i=0; i<arr.length; i++) {
			arr2[i] = arr[i];
		}
		
		
		System.out.println(arr == arr2);
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("arr2 : " + Arrays.toString(arr2));
					
	}
	
}