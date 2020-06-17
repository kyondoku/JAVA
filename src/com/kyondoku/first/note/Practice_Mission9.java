package com.kyondoku.first.note;

public class Practice_Mission9 {
//	버블정렬하기
	public static void main(String[] args) {
		int[] arr = { 24, 2, 16, 8, 33 };
		
		for(int i=arr.length-1; i>0; i--) {
			
			for(int z=0; z<i; z++) {
				if(arr[z] > arr[z+1]) {
					int temp = arr[z];
					arr[z] = arr[z+1];
					arr[z+1] = temp;
				}
			}
		}
		
	
		
		for(int val : arr) {
			System.out.print(val + ", ");
		}
	}
}
