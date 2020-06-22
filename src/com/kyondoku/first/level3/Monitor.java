package com.kyondoku.first.level3;

public class Monitor {
	static String brand;
//	static붙으면 값이 하나밖에 저장 안된다.
	int inch;
	
	void printInfo() {
		System.out.printf("brand: %s, inch: %d\n"
				, this.brand, this.inch);
	}
	
	void printInch() {
		System.out.println(brand);
		System.out.println(inch);
	} 
	
	
	
	static void printBrand() {
		System.out.println(brand);
	}
}
