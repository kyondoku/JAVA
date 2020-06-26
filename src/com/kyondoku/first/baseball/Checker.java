package com.kyondoku.first.baseball;

public class Checker {
	

	
	// S:0 / B:0 / O: 0
	// 성공하면 false, 성공전이면 true
	public static boolean check(int gameCnt, Baseball b, MyBall mb) {
		
		int S=0, B=0;
		int O;
		O= gameCnt-S-B;
		for(int i=0; i<gameCnt; i++) {
			for(int z=0; z<gameCnt; z++) {	
				if(b.get(i) == mb.get(z)) {
					
					if(i == z) {
					S++;		
				} else {
					B++;	
				}
			} 
		} 
	} 	if( S == gameCnt ) {
		return false;
} 
		System.out.printf("S:%d / B:%d / O:%d\n", S, B, O);
		return true;
		}
		
} 
