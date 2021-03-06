package com.kyondoku.first.baseball;

import java.util.Arrays;
import java.util.Scanner;

public class MyBall {
	private int[] myArr;
	private Scanner scan;
	
	public MyBall(int num) {
		init(num);	
	}
	
	private void init(int num) {
		myArr = new int[num];
		scan = new Scanner(System.in);
	}
	
	void setNumbers() {
		for(int i=0; i<myArr.length; i++) {
			System.out.printf("숫자 %d :", i+1);
			String val = scan.nextLine();
			try {
				myArr[i] = Integer.parseInt(val);
			} catch(Exception e) {
				i--;
				System.out.println("숫자만 입력하세요.");
				continue;
				
			}
			if(myArr[i] < 1 || myArr[i] > 9) {
					i--;
					System.out.println("1~9 값만 입력하세요.");
					continue;
				}
			for(int z=0; z<i; z++) {
				if(myArr[i] == myArr[z]) {
					i--;
					System.out.println("중복된 값을 입력하셨습니다.");
					break;
				}
			}
		}
		System.out.println(Arrays.toString(myArr));
	}		
	
	public int get(int idx) {
		return myArr[idx];
	}
}
	
	

