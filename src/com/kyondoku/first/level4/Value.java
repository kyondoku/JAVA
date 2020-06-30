package com.kyondoku.first.level4;

public class Value {
	
	private int val;
	
	public Value(int val) {
		this.val = val;
	}
	
	public int getVal() {
		return val;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Value val = (Value)obj;

		if(this.val == val.getVal()) {
			return true;
		}else{
			return false;
		}
	}
	
	@Override
	public String toString() {
//		String.format은 printf와 비슷. 스트링값으로 리턴해줌
		return String.format("%,d", val);
//		return String.valueOf(val);
	}
	
	
}
