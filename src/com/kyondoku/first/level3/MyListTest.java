package com.kyondoku.first.level3;

import java.util.Arrays;

// 파일명이랑 같은 클래스 앞에만 public 붙힐수 있음
public class MyListTest {
	public static void main(String[] args) {
		MyList list = new MyList();
		list.add(10);
		list.add(15);
		list.add(25);
		list.add(12);
		list.add(77);
		
		int len = list.size(); //2
		int val = list.get(1); //15
		val = list.get(0); //10
		
//		list.remove();
		list.remove(0);
	}
	
}

class MyList {
	private int[] arr;
	
	MyList() {
		init();
	}
	
	private void init() {
		arr = new int[0];
	}
	
	int size() {
		return arr.length;
	}
	
	int get(int idx) {
		return arr[idx];
	}
	
	void add(int num)  {
		int temp[] = new int[arr.length+1];
		for(int i=0; i<arr.length; i++) {
			temp[i] = arr[i];
		}
		temp[arr.length] = num;
		arr = temp;
		System.out.println(Arrays.toString(arr));	
	}
	
	void remove() {
		int temp[] = new int[arr.length-1];
		for(int i=0; i<temp.length; i++) {
			temp[i] = arr[i];
		}
		arr = temp;
		System.out.println(Arrays.toString(arr));
	}
	
	void remove(int num) {
		int[] temp = new int[arr.length-1];
		for(int i=0; i<temp.length; i++) {
			if(i < num) {
				temp[i] = arr[i];
			} else {
				temp[i] = arr[i+1];
			}
		
		}
		arr = temp;
		System.out.println(Arrays.toString(arr));
	}
	
	
	
	
	
	
}