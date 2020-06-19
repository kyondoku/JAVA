package com.kyondoku.first.level3;

public class TvTest {
//	객체는 멤버필드와 멤버메소드로 구성되어있다
	public static void main(String[] args) {
//		Tv 객체를 생성해서 주소값을 복사해주는거임.
//					()는 기본생성자/객체생성할떄 생성자중에 1개는 무조건 입력해야됨
		Tv tv1 = new Tv();
//		Tv tv1 : 객체 중에서도 Tv객체만 저장할거야, 따라서 Tv tv1 = ""; 오류뜸. 
		
		System.out.println("name : " + tv1.name);
		System.out.println("power : " + tv1.power);
		System.out.println("channel : " + tv1.channel);
		
		System.out.println("-----------------");
		tv1.name = "삼성Tv";
		System.out.println("name : " + tv1.name);
		tv1.changePower();
		System.out.println("power : " + tv1.power);
		tv1.changePower();
		System.out.println("power : " + tv1.power);
//		보이드형이라서 앞에 = 넣으면 오류뜸
		tv1.channelUp();
		tv1.channelUp();
		tv1.channelUp();
		System.out.println("channel : " + tv1.channel);
		
	}
}
