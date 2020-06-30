package com.kyondoku.first.level6;

public class PlayerTest {
	
	public static void main(String[] args) {
		Player player = new CDDPlayer();
		player.play();
//		player.ff();
		
		player = new DVDPlayer();
		player.play();
	}

}
