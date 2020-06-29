package com.kyondoku.first.level4;

public class ClassTest2 {
	public static void main(String[] args) {
/*	ClassA clsA = new ClassB();
	ClassA clsA2 = new ClassC();
	ClassA clsA3 = new ClassA();*/
	
	ClassA clsA = new ClassB();
	
	clsA.print();
//	clsA.showMe();
	
	ClassB clsB = (ClassB)clsA;
//	(ClassB)가 없으면 빨간줄이 뜨지만 사실상 문제는 없다. 컴파일러가 염려를 하는것임.
	clsB.showMe();
	
	
	}
}	

