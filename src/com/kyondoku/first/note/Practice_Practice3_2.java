package com.kyondoku.first.note;

public class Practice_Practice3_2 {
	public static void main(String[] args) {
		int len = 9;
		int[] arr = new int[len];
//		1~9사이의 랜덤한 값을 중복되지 않게 arr배열 크기만큼 초기화한다.
		
		int min = 1;
		int max = 9;
		
		
		
		for(int i=0; i<arr.length; i++) {
			int rVal = (int)(Math.random() * (max - min + 1) + min);
			for(int z=0; z<arr.length; z++) {
				if(arr[z] == 0) {
					arr[z] = rVal;
					break;
				} else if(arr[z] == rVal) {
					i--;
					break;
				}
			}
			
		}
		for(int val : arr) {
			System.out.println(val);
		}
	}
}
