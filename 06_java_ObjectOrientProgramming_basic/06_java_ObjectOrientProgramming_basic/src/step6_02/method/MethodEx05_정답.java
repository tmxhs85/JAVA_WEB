package step6_02.method;

import java.util.Scanner;

class MethodEx05{

	void test1() {
		int sum = 0;
		for (int i = 1; i < 6; i++) {
			sum += i;
		}
		System.out.println("1부터 5까지의 합 : " + sum);
	}
	
	void test2() {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[3];
		System.out.println("숫자 3개를 입력하세요");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		arr[0] = num1;
		arr[1] = num2;
		arr[2] = num3;
		
		int max = arr[0];
		for (int i = 1; i < 3; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("최대값 : " + max);
		
		scan.close();
	}
	
}

public class MethodEx05_정답 {

	public static void main(String[] args) {

			MethodEx05 e = new MethodEx05();
						
			// 문제 1) 1부터 5까지의 합을 출력하는 메서드
			e.test1();
			
			// 문제 2) 정수 3개를 배열에 입력받아 최대값을 출력하는 메서드
			e.test2();

	}

}
