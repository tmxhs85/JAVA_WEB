package step2_01.array;

import java.util.Scanner;

/*
 * 
 * # 영화관 좌석예매
 * 
 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
 * 2. 예매가 완료되면 해당 좌석 값을 'O'로 변경한다.
 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
 * 4. 한 좌석당 예매 가격은 12000원이다.
 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
 * 예)
 * [X] [X] [X] [X] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 * 
 * (1번 입력)
 * 
 * 좌석선택(1~7) : 1
 * [O] [X] [X] [X] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 * 
 * (1번 입력)
 * 
 * 좌석선택(1~7) : 3
 * 
 * [O] [X] [O] [X] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 *
 * (1번 입력)
 * 
 * 좌석선택(1~7) : 3
 * 이미 예매가 완료 되었습니다.
 * 
 * [O] [X] [O] [X] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 * 
 * (2번 입력)
 * ----------------------
 * 매출액 : 24000원
 * 
 */

// 2022-01-06 14:15 ~ 14:31

public class ArrayEx09_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		char seat[] = {'X','X','X','X','X','X','X'};
		int price = 0;
		
		while(true) {
			System.out.println("1. 좌석 예매");
			System.out.println("2. 종료");
			int click = scan.nextInt();
			
			if (click == 2) {
				System.out.println("매출액 : " + price + "원");
				break;
			}
			else if (click == 1) {
				System.out.print("좌석선택(1~7) : ");
				int choice = scan.nextInt();
				
				if (seat[choice-1] == 'X') {
					seat[choice-1] = 'O';
					price += 12000;
				}
				else if (seat[choice-1] == 'O') {
					System.out.println("이미 예매가 완료 되었습니다.");
				}
				
				System.out.println();
				for (int i = 0; i < seat.length; i++) {	
					System.out.print("[" + seat[i] + "] ");
				}
				System.out.println();
				System.out.println();
			}
		}
		
		scan.close();
		
	}
	
}
