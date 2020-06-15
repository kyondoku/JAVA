package com.kyondoku.first.mission;

import java.util.Scanner;

public class Mission3_ans2 {

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
		System.out.print("성별을 입력해 주세요: (남/여)");
		String gender = scan.nextLine();

		
		if("남".equals(gender) || "여".equals(gender)) {
			
			System.out.print("키를 입력해 주세요: ");
			int height = scan.nextInt(); /* nextInt일경우 답변에 문자가 입력되면 에러가 뜬다 */
			
			int standHeight = 150;  /* 지역변수들은 초기화값주는거 추천 */
			
			if("남".equals(gender)) {
				standHeight = 160;
			
			}
			
			if(height > standHeight) {
				System.out.println("평균 초과입니다.");
			} else if(height < standHeight) {
				System.out.println("평균 미만입니다.");
			} else {
				System.out.println("평균입니다.");
			}
			
		} else {
			System.out.println("성별을 잘못 입력하셨습니다.");
		}
	


	}
		
}