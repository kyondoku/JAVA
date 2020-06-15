package com.kyondoku.first.mission;

public class Mission6_3 {
	
		/*
		 
		 2~9단
		 
		 단, 단이 바뀔때 개행을 한다.
		 
		 */
		
	public static void main(String[] args) {
		
		for(int q=2; q<10; q++) {
			
			for(int w=1; w<10; w++) {
				System.out.printf("%d * %d = %d\n", q, w, q*w );
				
			}
			System.out.println("-----------");
			
		}
		
		
	}
}
