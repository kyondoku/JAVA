package com.kyondoku.first;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("나이?");
		int age = scan.nextInt();
		System.out.println("나이 : " + age);
		
		System.out.print("이름?");
		String name = scan.next();
		System.out.println("나이 : " + name);
		
		scan.close();
		
	
	}

}
