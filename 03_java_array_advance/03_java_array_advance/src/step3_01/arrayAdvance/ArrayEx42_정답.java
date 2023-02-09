package step3_01.arrayAdvance;

import java.util.Scanner;

/*
 * 
 * # 나만의 마블
 * 
 * 옷 □ □ □ □ 
 * □ ■ ■ ■ □ 
 * □ ■ ■ ■ □ 
 * □ ■ ■ ■ □ 
 * □ □ □ □ □
 * 
 * 
 * 정답의 소스를 컴파일 해보고 동작을 파악하여 코드를 작성하기.
 * 
 */

public class ArrayEx42_정답 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int size = 5;
		int road = 20;
		
		int[][] map = {
			{0,   1,  2,  3, 4},	
			{15, 20, 20, 20, 5},
			{14, 20, 20, 20, 6},
			{13, 20, 20, 20, 7},
			{12, 11, 10,  9, 8}
		};
		
		int player = 0;
		
		while(true) {
			
			// 화면출력
			for (int i=0; i<size; i++) {
				for (int j=0; j<size; j++) {
					if (map[i][j] == road) 		  	System.out.print("■ ");		// road(20)일 때는 벽
					else if (map[i][j] == player) 	System.out.print("P ");		// player(초기값 0)일 때는 플레이어
					else 							System.out.print("□ ");		// 나머지 부분은 길
				}
				System.out.println();
			}
			System.out.println();

			
			// 입력받기
			System.out.print("1~3을 입력하세요 : ");
			int move = scan.nextInt();
			
			player += move;		// player에 move값을 더해서 map을 이동
			
			player %= 16;		// 15까지 map에 표시되어 있기 때문에 16부터는 다시 0이 되어서 map을 처음부터 돈다
			
		}

	}

}
