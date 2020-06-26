package com.kyondoku.first.note;

public class Practice_GreatMission1 {
	public static void main(String[] args) {
		final int LEN = 3;
		
		System.out.printf("숫자 %d 야구 게임 시작\n", LEN);
		
//		
//		
//		
		
		int[] rArr = new int[LEN];
		int[] myArr = new int[LEN];
		
		System.out.println(rArr.length);
		
		for(int i=0; i<rArr.length; i++) {
			rArr[i] = (int)(Math.random() * 9 + 1);
			
			for(int z=0; z<i; z++) {
				if(rArr[i] == rArr[z]) {
					i--;
					break;
				}
			}
 		
		
		}
		
	}

}
