package com.kyondoku.first.level2;

public class Continue {

	public static void main(String[] args) {
		
		for(int i=0; i<20; i++) {
			if(i == 5) { continue; }
//			for문을 종료하지않고 skip한다.(break와 마찬가지고 자신을 감싸고 있는 구문만 적용)
			
			System.out.println(i);
			System.out.println(i);
			System.out.println(i);
			System.out.println(i);
			System.out.println(i);
			System.out.println(i);
		}

	}

}
