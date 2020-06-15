package com.kyondoku.first.mission;

import java.util.Scanner;

public class Mission3 {

	public static void main(String[] args) {
	  /*
	   
	   		성별을 입력해 주세요: (남/여)
	   		키를 입력해 주세요:
	   		
	   		남자 기준: 160
	   		여자 기준: 150
	   		
	   		"평균 미만입니다."
	   		"평균입니다."
	   		"평균 초과입니다." */
	   

		Scanner scan = new Scanner(System.in);
		System.out.printf("성별이 무엇입니까?(남자/여자)");
		String gender = scan.next();
		
		System.out.printf("키가 몇입니까?");
		int height = scan.nextInt();
		
		if((gender == "남자") && (height > 160)) {
			System.out.println("평균 초과입니다.");
				
			} else if((gender == "남자") && (height == 160)) {
				System.out.println("평균입니다.");
				
			} else if((gender == "남자") && (height < 160)) {
				System.out.println("평균 미만니다.");
				
			} else if((gender == "여자") && (height > 150)) {
				System.out.println("평균 초과입니다.");
				
			} else if((gender == "여자") && (height == 150)) {
				System.out.println("평균입니다.");
				
			} else if((gender == "여자") && (height < 150)) {
				System.out.println("평균 미만입니다."); }
			
			

	}
		
}