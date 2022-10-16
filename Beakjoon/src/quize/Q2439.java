package quize;

import java.util.Scanner;

public class Q2439 {
	/*
	 	첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i =0; i < n; i++) {
			for(int j = 0; j <n ; j++) {
				System.out.print("*");
			}
			for(int k = 0; k< n; k++) {
			
			}
			System.out.println();
			
		}
		
	}
}
