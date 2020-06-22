package com.kyondoku.first.level3;

public class CalcTest {

	public static void main(String[] args) {
		
//		Clac.sum(10, 20); 만약에 이렇게 있었다? 그러면 void일 확률에 개개개 높음 그게 중요함.
		
		
		System.out.println(Calc.sum(10, 20)); //30
		
//		int result = Calc.sum(10, 20);
//		System.out.println(result);  이 두 줄을 위에 한 줄로 만든거임
		
		
		
		Calc calc1 = new Calc();
		calc1.n1 = 20;
		calc1.n2 = 30;
		
		System.out.println(calc1.sum()); //50
	
		}
	}
