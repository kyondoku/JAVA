package com.kyondoku.first.mission;

public class MethodMission2 {
	public static void main(String[] args) {
		
//		printStar(4);
		
//		printStarSquare(10);
		
//		printStarTriangle(5);
		
		printStarTriangleReverse(5);

	}
	
	public static void printStarTriangleReverse(int dan) {
		for(int i=dan-1; i>=0; i--) {
			printChar(' ', i);
			printStar(dan-i);
		}		
	}	
	
	public static void printChar(char ch, int cnt) {
		for(int i=0; i<cnt; i++) {
			System.out.print(ch);
		}
	}
	
	public static void printStarTriangle(int dan) {
		for(int i=1; i<=dan; i++) {
			printStar(i);
		}
	}
	
	public static void printStarSquare(int dan) {
		for(int i=0; i<dan; i++) {
			printStar(dan);
		}
	}
	
	public static void printStar(int star) {
		for(int i=1; i<=star; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
