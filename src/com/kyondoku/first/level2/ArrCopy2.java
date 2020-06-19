package com.kyondoku.first.level2;

import java.util.Arrays;

public class ArrCopy2 {

	public static void main(String[] args) {
		int[] arr = {2, 4, 6, 7, 10, 55, 77};
		int[] arr2 = copyArr(arr); 
//		new arr2[0] = 2;
//		
//		
//		
		System.out.println(arr == arr2);
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("arr2 : " + Arrays.toString(arr2));

	}
	
	public static int[] copyArr(int[] arr) {
		
		int[] temp = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			temp[i] = arr[i];
		} return temp;	
	}
}
