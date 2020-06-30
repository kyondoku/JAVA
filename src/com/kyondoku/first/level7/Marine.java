package com.kyondoku.first.level7;

// class일때                                            interface상속받을때 implements로
public class Marine extends Unit implements AttackUnit {
	
	private int damage;
	
	public Marine() {
		super("마린", 50);
		damage = 5;
	}

	@Override
	public void attack(Unit u) {
		System.out.println("따다다다~");
		
//		if(u == this) {
//			u.getDamage(0);
//		} else {
//		u.getDamage(damage);
//		}
		
		if(u == this) { return; }
		u.getDamage(damage);
		
		
	}
	

	

}
