package step2_01.array;

import java.util.Random;
import java.util.Scanner;

/*
 * # 1 to 50[1단계] : 1 to 4
 * 
 * 1. arr배열에 1~4 사이의 숫자를 중복없이 저장한다.
 * 2. 사용자는 가장 작은수 1부터(다음은 2) 순서대로 해당 위치 값을 입력한다.
 * 3. 정답을 맞추면 해당 값은 9로 변경되어 모든 값이 9가 되면 게임은 종료된다.
 
 * 예)
 * [ 4 2 3 1 ]
 * 
 * 입력 : 3  (가장 작은수 1이 3번째에 위치 )
 * 4 2 3 9
 * 입력 : 1  ( 그 다음으로 작은 수 2가 1번째에 위치 )
 * 4 9 3 9
 * 입력 : 2  ( 그 다음으로 작은 수 3이 2번째에 위치 )
 * 4 9 9 9
 * 입력 : 0  ( 그 다음으로 작은 수 4가 0번째에 위치 )
 * 9 9 9 9
 * 
 * 코드 종료
 */

// 2022-01-07 14:17 ~ 14:26

public class ArrayEx16_정답 {

	public static void main(String[] args) {
		
		int[] arr = new int[4];
		boolean[] isCheck = new boolean[4];
		
		Random rand = new Random();
		
		int count = 0;
		while (count < 4) {			
			int num = rand.nextInt(4);
			if (isCheck[num] == false) {
				arr[count] = num+1;
				isCheck[num] = true;
				count++;
			}
		}
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = 1;
		while (true) {
			for (int i = 0; i < arr.length; i++) {				
				System.out.print(arr[i] + " ");
			}
			System.out.println();

			int check = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != 9) {
					check = 1;
				}
			}
			
			if (check == 0) {
				System.out.println("종료");
				break;
			}
			
			System.out.print("입력 : ");
			int idx = sc.nextInt();
			
			if (arr[idx] == cnt) {
				arr[idx] = 9;
				cnt++;
			}
		}
		
		sc.close();
		
	}
	
}
