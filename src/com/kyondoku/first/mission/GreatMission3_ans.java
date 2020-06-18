package com.kyondoku.first.mission;

public class GreatMission3_ans {

	public static void main(String[] args) {
		int[][] arr = {
//              [0]  [1]  [2]
		/*[0]*/	{90, 100, 88},		 //영어
		/*[1]*/	{34, 99, 45, 55},	 //수학
		/*[2]*/	{98, 65, 87} 		 //국어
		};
		
		String[] clsArr = {"영어", "수학", "국어"}; // 	claArr[0] = 영어, 	claArr[1] = 수학, 	claArr[2] = 국어
		int[] sumArr = new int[clsArr.length]; // 	sumArr[0] = 0, 		sumArr[1] = 0, 		sumArr[2] = 0
		
		for(int i=0; i<arr.length; i++) {
			for(int z=0; z<arr[i].length; z++) {
 				sumArr[i] += arr[i][z];  	 
			}
		} //  z가 한번씩 돌때마다 arr[i] 즉 제일 처음에는 arr[0]인 영어배열의 값이 더해지고 다 더해지면 안쪽 for구문 끝.
		
		int totalSum = 0; //전체합계용
		int totalCnt = 0; //전체평균 계산하기 위한 카운트(과목별 아이템 수 모두 더 함)
		for(int i=0; i<sumArr.length; i++) {
			System.out.printf("%s합계: %d, 평균: %.1f\n"
					, clsArr[i], sumArr[i], (float)sumArr[i]/arr[i].length);
			totalSum += sumArr[i];
			totalCnt += arr[i].length; //과목별로 점수의 갯수가 같으면 숫자를 지정해줘도 되지만 수학이 4개라서 자식의수를 계속 카운팅
		}
		
		System.out.printf("전체합계: %d, 평균: %.1f\n", totalSum, (float)totalSum/totalCnt);
		
		/*
			영어합계: ?, 평균: ?
			수학합계: ?, 평균: ?
			국어합계: ?, 평균: ?
			전체합계: ?, 평균: ?
		 */

	}

}