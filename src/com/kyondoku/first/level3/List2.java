package com.kyondoku.first.level3;

import java.util.ArrayList;

public class List2 {
	public static void main(String[] args) {		
		ArrayList<Integer> list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(10);
		
		list.add(2, 11);
		
		list.remove(list.size() - 1);
		list.remove(list.size() - 1);
		
		int value = list.get(2);
		System.out.println(value);
		
		
//		for(int i=0; i<list.size(); i++) {
//			int val = list.get(i);
//			System.out.print(val + ", ");
//		}
//		System.out.println();
////		Object는 최상위 부모
//		int i = 0;
		for(int val : list) {
//			System.out.print("i: " + i++ + ", " + val + ", ");
//			System.out.printf("i: %d, %d / ", i++, val);
			System.out.print(val + ", ");
		}
	}
}
