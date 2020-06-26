package com.kyondoku.first.level3;

import java.util.Arrays;

// 파일명이랑 같은 클래스 앞에만 public 붙힐수 있음
public class MyListTest {
	public static void main(String[] args) {
		
		MyList list = new MyList();
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(1, 1200); 
		
		list.remove();
			
		
		
		MyArrays.print(list); // [10, 1200, 15] 프린트 되도록
		String str = MyArrays.toString(list); // "[10, 1200, 15]" 문자열을 리턴하도록 구현하기
		
		System.out.println("str : " + str);
		
//		
//		int delVal = list.remove(); // 마지막 값 지우고, 지우는 값 리턴!(20);
//		System.out.println(delVal);
//		
//		int len = list.size(); //2
//		int val = list.get(1); //15
//		val = list.get(0); //10
		
//		list.remove(0);
		
		
		
	}
	
}

class MyArrays {
	static String toString(MyList list) {
		String str = "";
		for(int i=0; i<list.size(); i++) {
			if(i>0) { str += ", "; }
			str += list.get(i);
		}
//		return "[" + str + "]";
		return String.format("[%s]", str);
	}
	
	
	
	
	
	
	
	
	static void print(MyList list) {
		System.out.print("[");
	for(int i=0; i<list.size(); i++) {
		System.out.printf(i < list.size() - 1 ? "%d, " : "%d]\n"
			, list.get(i));
	}
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
	
//	int remove() {
//		int[] temp = new int[arr.length-1];
//		
//		int tempLast = arr[arr.length-1];
//		
//		for(int i=0; i<arr.length-1; i++) {
//				temp[i] = arr[i];
//			} 
//		
//		arr = temp;
//		return tempLast;
//		
//		} 
	
	void add(int num)  {
		int temp[] = new int[arr.length+1];
		for(int i=0; i<arr.length; i++) {
			temp[i] = arr[i];
		}
		temp[arr.length] = num;
		arr = temp;
		System.out.println(Arrays.toString(arr));	
	}
	
	void add(int num1, int num2) {
		int[] temp = new int[arr.length+1];
		for(int i=0; i<arr.length; i++) {
			if(i < num1) {
				temp[i] = arr[i];
			} else {
				temp[i+1] = arr[i];
			} 
		}
		temp[num1] = num2;
		arr = temp;
		System.out.println(Arrays.toString(arr));
	}
	
//	void add(int num1, int num2) {
//		int[] temp = new int[arr.length+1];
//		for(int i=0; i<arr.length; i++) {
//			temp[(i < num2) ? i : i + 1] = arr[i];
//			} 
//			temp[num2] = num1;
//			arr = temp;
//			System.out.println(Arrays.toString(arr));
//		}
//	

	
	
	
//	void remove() {
//		int temp[] = new int[arr.length-1];
//		for(int i=0; i<temp.length; i++) {
//			temp[i] = arr[i];
//		}
//		arr = temp;
//		System.out.println(Arrays.toString(arr));
//	}

//	int remove(int idx) {
//		int[] temp = new int[arr.length-1];
//		for(int i=0; i<temp.length; i++) {
//			if(i < idx) {
//				temp[i] = arr[i];
//			} else {
//				temp[i] = arr[i+1];
//			}
//		
//		}
//		int delVal = arr[idx];
//		arr = temp;
//		return delVal;
//	}
//	
//	int remove() {
//		return remove(arr.length-1);
//	}
	
	int remove(int idx) {
		int[] temp = new int[arr.length-1];
		for(int i=0; i<temp.length; i++) {
			if(i < idx) {
				temp[i] = arr[i];
			} else {
				temp[i] = arr[i+1];
			}
		}
		int delVal = arr[idx];
		arr = temp;
		return delVal;
	}
	
	int remove() {
		return remove(arr.length-1);
		
		}
	}
	
