package com.kyondoku.first.level6;

public abstract class Player {
	public abstract void play();
//	추상클래스는 강제 오버라이딩?
	
	public void stop() {
		System.out.println("재생을 멈췄다.");
	}	
}

abstract class CDPlayer extends Player {
	public abstract void ff();
}

class CDDPlayer extends CDPlayer {

	@Override
	public void ff() {
		
		
	}

	@Override
	public void play() {
		System.out.println("CD를 재생합니다.");
		
	}
	
}




class DVDPlayer extends Player {

	@Override
	public void play() {
		System.out.println("DVD를 재생합니다.");
		
	}
	
}
