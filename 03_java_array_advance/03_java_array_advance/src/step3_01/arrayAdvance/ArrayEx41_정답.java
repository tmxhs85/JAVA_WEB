package step3_01.arrayAdvance;
/*
 * # 사다리 게임
 * 
 * 1. 0을 만나면 아래로 내려간다.
 * 2. 1일 때에는 좌우를 검사해 1인 쪽으로 이동 후 아래로 내려간다.
 * 3. x의 위치를 입력받고 사다리를 표현한다.
 * 		x = 0	x = 4
 * 		x = 1	x = 2
 * 		x = 2	x = 1
 * 		x = 3	x = 3
 * 		x = 4	x = 0
 */

import java.util.Scanner;

public class ArrayEx41_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int ladder[][]= {
				{0,0,0,0,0},
				{1,1,0,1,1},
				{0,1,1,0,0},
				{0,0,1,1,0},
				{1,1,0,0,0},
				{0,1,1,0,0},
				{1,1,0,0,0},
				{0,0,0,1,1},
				{0,0,0,0,0}};
		
		String[] result = {"꽝", "꽝", "꽝", "당첨", "꽝"};
		
		int x = 0; int y = 0;
		
		for (int i=0; i<ladder.length; i++) {
			for (int j=0; j<ladder[i].length; j++) {		// 특수문자 : ㅂ + 한자
				if (ladder[i][j] == 0) {					// 0인 경우에 아래로 내려감
					System.out.print(" │ ");
				}
				else if (ladder[i][j] == 1) {
					if (j != 0 && ladder[i][j-1] == 1) {	// j가 가장 왼쪽이 아니고 해당 부분과 왼쪽 부분이 1일 때
						System.out.print("─┤ ");			// 왼쪽으로 가는 사다리
					}
					else if (j != ladder[i].length - 1 && ladder[i][j+1] == 1){		// j가 가장 오른쪽이 아니고
						System.out.print(" ├─");	// 해당 부분과 오른쪽 부분이 1일 때 오른쪽으로 가는 사다리
					}
				}
			}
			System.out.println();
		}
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");			
		}
		System.out.println();
		
		System.out.print("0~4 입력 : ");
		x = scan.nextInt();
		
		for (int i=0; i<ladder.length; i++) {
			if (ladder[y][x] == 0) {						// 0일 때는 아래로 내려감
				y++;										// y만 플러스
			}
			else if (ladder[y][x] == 1) {					// 1일 때는
				if (x != 0 && ladder[y][x-1] == 1) {		// 왼쪽이 1이면
					x--;									// 왼쪽으로 이동 (x가 마이너스)
				}
				else if(x != 4 && ladder[y][x+1] == 1) {	// 오른쪽이 1이면
					x++;									// 오른쪽으로 이동 (x가 플러스)
				}
				y++;										// 아래로 내려가야하니까 y는 플러스
			}
		}
		
		System.out.println("결과는 " + result[x]);
		//System.out.println("y = " + y);
		
		scan.close();

	}

}
