package com.kyondoku.first;

public class Switch {

	public static void main(String[] args) {
		
		String num = "이";
		
		switch(num) {
		case "일": 	
			System.out.println("1이다");
			break;
//			break는 빠져나온다고 생각하믄댐
			
		case "이": case "사":
			System.out.println("짝수이다");
//			break;		
//			스위치는 폭포와 같음 break를 만나기전까지 계속 진행
			
		case "삼":
			System.out.println("3이다");
			break;
			
		default:
			System.out.println("1~3이 아니다");
			break;
//			마지막 브레이크니까 생략가능
			
			
//			문자열 비교할때는 if보다 switch가 훨씬 편함
		}

	}

}
