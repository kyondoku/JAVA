package com.kyondoku.first.level3;

public class TvTest2 {
	public static void main(String[] args) {
		Tv tv1 = new Tv();
		Tv tv2 = tv1;
		
//		하나의 객체임, 주소값이 같으니까 같은 티비를 2번 업한거임
		
		tv1.channelUp();
		tv2.channelUp();
		
		System.out.println("tv1 channel : " + tv1.channel);
		System.out.println("tv2 channel : " + tv2.channel);
	}
}
