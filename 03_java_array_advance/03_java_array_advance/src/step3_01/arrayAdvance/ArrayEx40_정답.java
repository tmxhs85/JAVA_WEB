package step3_01.arrayAdvance;

import java.util.Scanner;

/*
 *	# 관리비
*/

public class ArrayEx40_정답 {

	public static void main(String[] args) {
		
		int[][] apt = {
				{101, 102, 103},	
				{201, 202, 203},	
				{301, 302, 303}	
			};
			
		int[][] pay = {
			{1000, 2100, 1300},	
			{4100, 2000, 1000},	
			{3000, 1600,  800}
		};
			
		Scanner sc = new Scanner(System.in);
		
		// 문제 1) 각층별 관리비 합 출력
		// 정답 1) 4400, 7100, 5400
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				sum += pay[i][j];
			}
			System.out.print(sum + " ");
			sum = 0;
		}
		System.out.println();
		
		// 문제 2) 호를 입력하면 관리비 출력
		// 예    2) 입력 : 202	관리비 출력 : 2000
		System.out.print("입력 : ");
		int ho = sc.nextInt();
		int idx1 = 0;
		int idx2 = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (apt[i][j] == ho) {
					idx1 = i;
					idx2 = j;
				}
			}
		}
		System.out.println("관리비 출력 : " + pay[idx1][idx2]);
		
		// 문제 3) 관리비가 가장 많이 나온 집, 적게 나온 집 출력
		// 정답 3) 가장 많이 나온 집(201), 가장 적게 나온 집(303)
		int max = 0;
		int min = 9999;
		int max_ho = 0;
		int min_ho = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (pay[i][j] > max) {
					max = pay[i][j];
					max_ho = apt[i][j];
				}
				if (pay[i][j] < min) {
					min = pay[i][j];
					min_ho = apt[i][j];
				}
			}
		}
		System.out.println("가장 많이 나온 집(" + max_ho + "), 가장 적게 나온 집(" + min_ho + ")");
		
		// 문제 4) 호 2개를 입력하면 관리비 교체
		System.out.print("호수1 입력 : ");
		int ho1 = sc.nextInt();
		System.out.print("호수2 입력 : ");
		int ho2 = sc.nextInt();
		int pay1 = 0;
		int pay2 = 0;
		int idx3 = 0;
		int idx4 = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (apt[i][j] == ho1) {
					pay1 = pay[i][j];
					idx1 = i;
					idx2 = j;
				}
				if (apt[i][j] == ho2) {
					pay2 = pay[i][j];
					idx3 = i;
					idx4 = j;
				}
			}
		}
		pay[idx1][idx2] = pay2;
		pay[idx3][idx4] = pay1;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(pay[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();
		
	}

}
