package step3_01.arrayAdvance;

import java.util.Scanner;

/*
 *	# 2차원배열 기본문제[2단계]
*/

public class ArrayEx38_정답 {

	public static void main(String[] args) {
		
		int[][] arr = new int[3][3];
		
		int k = 1;
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		
		Scanner sc = new Scanner(System.in);
		
		// 문제 1) 인덱스 2개를 입력받아 값 출력
		// 예    1) 인덱스1 입력 : 1	인덱스2 입력 : 2
		//		   값 출력 : 60 
		System.out.print("인덱스1 입력 : ");
		int idx1 = sc.nextInt();
		System.out.print("인덱스2 입력 : ");
		int idx2 = sc.nextInt();
		System.out.println("값 출력 : " + arr[idx1][idx2]);
		
		// 문제 2) 값을 입력받아 인덱스 2개 출력
		// 예    2) 값 입력 : 60
		//		   인덱스1 출력 : 1	인덱스2 출력 : 2
		System.out.print("값 입력 : ");
		int val = sc.nextInt();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (arr[i][j] == val) {
					idx1 = i;
					idx2 = j;
					break;
				}
			}
		}
		System.out.println("인덱스1 출력 : " + idx1 + " 인덱스2 출력 : " + idx2);
		
		// 문제 3) 가장 큰 값의 인덱스 2개 출력
		// 정답 3) 2 2
		val = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (arr[i][j] > val) {
					val = arr[i][j];
					idx1 = i;
					idx2 = j;
				}
			}
		}
		System.out.println(idx1 + " " + idx2);
		
		// 문제 4) 값 2개를 입력받아 값 교체
		System.out.print("값1 입력 : ");
		int val1 = sc.nextInt();
		System.out.print("값2 입력 : ");
		int val2 = sc.nextInt();
		int idx3 = 0;
		int idx4 = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (arr[i][j] == val1) {
					idx1 = i;
					idx2 = j;
				}
				if (arr[i][j] == val2) {
					idx3 = i;
					idx4 = j;
				}
			}
		}
		arr[idx1][idx2] = val2;
		arr[idx3][idx4] = val1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();
		
	}

}
