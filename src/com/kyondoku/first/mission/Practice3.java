package com.kyondoku.first.mission;

public class Practice3 {

	public static void main(String[] args) {
		int len = 9;
		int[] arr = new int[len];
//		1~9 사이의 랜덤한 값을 중복되지 않게 arr배열 크기만큼 초기화한다.
		
//		int min = 1;
//		int max = 9;

		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 9 + 1);
			for(int z=0; z<i; z++) {
				if(arr[i] == arr[z]) {
					i--;
					break;
//					나랑 제일 가까운 for구문을 break시킴.
				}
			}
		}
		 
		
		
		for(int val : arr) {
			System.out.println(val);
		
		}		

	}

}
