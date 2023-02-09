package step6_02.method;

import java.util.Random;
import java.util.Scanner;

class MethodEx09 {

	Random ran = new Random();
	Scanner scan = new Scanner(System.in);
	
	//문제 1)
	void setRandomValuesinArray(int [] scores) {
		for (int i = 0; i < scores.length; i++) {
			scores[i] = ran.nextInt(100) + 1;
		}
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
		}
		System.out.println();
	}
	
	//문제 2)
	void printSumAndAverage (int [] scores) {
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		double avg = (double)sum / scores.length;
		System.out.println("총점 : " + sum + " 평균 : " + avg);
	}
	
	//문제 3)
	void printWinner (int [] scores) {
		int cnt = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= 60) {
				cnt++;
			}
		}
		System.out.println("합격생 수 : " + cnt + "명");
	}
	
	//문제 4)
	void printScore1 (int [] scores) {
		System.out.print("인덱스 : ");
		int idx = scan.nextInt();
		System.out.println("성적 : " + scores[idx] + "점");
	}
	
	//문제 5)
	void printScore2 (int [] scores) {
		System.out.print("성적 : ");
		int score = scan.nextInt();
		int idx = 0;
		for (int i = 0; i < scores.length; i++) {
			if (score == scores[i]) {
				idx = i;
			}
		}
		System.out.println("인덱스 : " + idx);
	}
	
	//문제 6)
	void printScore3(int [] hakbuns, int [] scores) {
		System.out.print("학번 : ");
		int num = scan.nextInt();
		int idx = 0;
		int check = 0;
		for (int i = 0; i < hakbuns.length; i++) {
			if (num == hakbuns[i]) {
				idx = i;
				check = 1;
			}
		}
		if (check == 0) {
			System.out.println("없는 학번입니다.");
		}
		else {
			System.out.println("성적 : " + scores[idx] + "점");
		}
	}
	
	//문제 7)
	void printNumberOne (int [] hakbuns, int [] scores) {
		int idx = 0;
		int max = scores[0];
		for (int i = 1; i < scores.length; i++) {
			if (max < scores[i]) {
				idx = i;
				max = scores[i];
			}
		}
		System.out.println(hakbuns[idx] + "번(" + max + "점)");
	}
	
}

public class MethodEx09_정답 {

	public static void main(String[] args) {
		
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores  = new int[5];
		
		MethodEx09 e = new MethodEx09();
		
		// 문제1) scores배열에 1~100점 사이의 랜덤 정수를 5개 저장하는 메서드
		// 예 1) 87, 11, 92, 14, 47
		e.setRandomValuesinArray(scores);

		// 문제2) 전교생의 총점과 평균 출력하는 메서드
		// 예 2) 총점(251) 평균(50.2)
		e.printSumAndAverage(scores);

		// 문제3) 성적이 60점 이상이면 합격이며 합격생 수를 출력하는 메서드
		// 예 3) 2명
		e.printWinner(scores);
		
		// 문제4) 인덱스를 입력받아 성적 출력하는 메서드
		// 정답4) 인덱스 입력 : 1 성적 : 11점
		e.printScore1(scores);
		
		// 문제5) 성적을 입력받아 인덱스 출력하는 메서드
		// 정답5) 성적 입력 : 11 인덱스 : 1
		e.printScore2(scores);
		
		// 문제6) 학번을 입력받아 성적 출력하는 메서드 // 단, 없는학번 입력 시 예외처리
	    // 단, 없는학번 입력 시 예외처리
		// 정답6) 학번 입력 : 1003 성적 : 45점
		e.printScore3(hakbuns, scores);
		
		// 문제7) 1등학생의 학번과 성적 출력하는 메서드
		// 정답7) 1004번(98점)
		e.printNumberOne(hakbuns, scores);

	}

}
