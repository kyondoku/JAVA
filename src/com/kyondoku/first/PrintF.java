package com.kyondoku.first;

public class PrintF {

	public static void main(String[] args) {
		String name = "주경덕";
		int age = 3600;
		float vision = 1.21f;
		char bloodType = 'O';
		
		System.out.println("나의 이름은 " + name + "입니다. 나의 나이는 " + age + "입니다."
			+ "나의 시력은" + vision + "입니다. 나의 혈액형은 " + bloodType + "입니다.");
		
		System.out.printf("나의 이름은 %s입니다. 나의 나이는 %d입니다. 나의 시력은 %s입니다. 나의 혈액형은 %s입니다.\n",
						 name, age, vision, bloodType);
		
        // s는 string(문자열), d는 정수, f는 실수, c는 문자열   전부다 s로 해도 되지만 %, 등과 같은 기능을 사용할 수 없음
		
		char v1 = '0';
		System.out.printf("%c : %d\n", v1, (int)v1);
		
		int v2 = 57;
		System.out.printf("%c : %d\n", (char)v2, v2);
	}
}
