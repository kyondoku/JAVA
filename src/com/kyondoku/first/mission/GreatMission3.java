package com.kyondoku.first.mission;

public class GreatMission3 {

	
	/*
 	영어합계: ?, 평균: ?
 	수학합계: ?, 평균: ?
 	국어합계: ?, 평균: ?
 	전체합계: ?, 평균: ?
 
 */
	
	public static void main(String[] args) {
		 	 int[][] arr = {
				{90, 100, 88}, 	//영어
				{34, 99, 45},  	//수학
				{98, 65, 87}	//국어
		};
		
		 	 
		 	 
		 	 
		 	 
		 	 
		 	 
		 	 
		
		int EngSum = (arr[0][0]+arr[0][1]+arr[0][2]);
		double EngAve = (double)EngSum/(double)arr[0].length;
		
		int MathSum = (arr[1][0]+arr[1][1]+arr[1][2]);
		double MathAve = MathSum/arr[1].length;
		
		int KorSum = (arr[2][0]+arr[2][1]+arr[2][2]);
		double KorAve = KorSum/arr[2].length;
		
		int TotalSum = EngSum + MathSum + KorSum;
		double TotalAve = TotalSum/(arr.length*arr.length);
		
	
		
		System.out.printf("영어합계: %d, 평균: %f\n", EngSum, EngAve);
		System.out.printf("수학합계: %d, 평균: %f\n", MathSum, MathAve);
		System.out.printf("국어합계: %d, 평균: %f\n", KorSum, KorAve);
		System.out.printf("총합계: %d, 총평균: %f\n", TotalSum, TotalAve);
		
		
	}
	

}
