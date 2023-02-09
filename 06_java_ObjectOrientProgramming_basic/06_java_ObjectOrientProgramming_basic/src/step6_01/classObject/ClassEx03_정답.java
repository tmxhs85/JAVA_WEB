package step6_01.classObject;

//# 학생성적관리 프로그램[1단계] : 클래스 + 변수

//class Ex03{
//	int[] arr = {87, 100, 11, 72, 92};
//}

class Score {
	int[] arr = {87, 100, 11, 72, 92};
}

public class ClassEx03_정답 {

	public static void main(String[] args) {
		
		Score score = new Score();
		
		// 문제 1) 전체 합 출력
		// 정답 1) 362
		int sum = 0;
		for (int i = 0; i < score.arr.length; i++) {
			sum += score.arr[i];
		}
		System.out.println(sum);
		
		// 문제 2) 4의 배수의 합 출력
		// 정답 2) 264
		sum = 0;
		for (int i = 0; i < score.arr.length; i++) {
			if (score.arr[i] % 4 == 0) {
				sum += score.arr[i];
			}
		}
		System.out.println(sum);
		
		// 문제 3) 4의 배수의 개수 출력
		// 정답 3) 3
		int cnt = 0;
		for (int i = 0; i < score.arr.length; i++) {
			if (score.arr[i] % 4 == 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
		// 문제 4) 짝수의 개수 출력
		// 정답 4) 3
		cnt = 0;
		for (int i = 0; i < score.arr.length; i++) {
			if (score.arr[i] % 2 == 0) {
				cnt++;
			}
		}
		System.out.println(cnt);

	}

}
