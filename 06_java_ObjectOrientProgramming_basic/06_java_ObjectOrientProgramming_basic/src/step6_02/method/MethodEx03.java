package step6_02.method;

/*
 * 
 * # return
 * 
 * 	1) 값을 반환한다.
 * 	2) 메서드를 종료한다.
 * 	3) 메서드에서의 return 값은 1개이다.
 * 
 */

class ReturnEx {
	
	void setScore1(int param) {
		param = 100;
	}
	
	int setScore2(int param) {
		param = 100;
		return param;
	}
	
	int testReturn() {
		
		System.out.println("리턴 전 명령어1");
		System.out.println("리턴 전 명령어2");
		System.out.println("리턴 전 명령어3");
		
		return 100;
		// return 1, 2, 3, 4, 5; // return 값은 1개만 가능하다.
		
		// return 명령어에서 함수가 종료되므로 아래의 명령어에서 error가 발생한다.
//		System.out.println("리턴 후 명령어1");
//		System.out.println("리턴 후 명령어2");
//		System.out.println("리턴 후 명령어3");
		
	}
	
}

public class MethodEx03 {

	public static void main(String[] args) {

		ReturnEx test = new ReturnEx();
		
		int score1 = 87;
		System.out.println("메서드 호출 전의 성적 : " + score1);
		
		test.setScore1(score1);
		System.out.println("메서드 호출 후의 성적 : " + score1);
		
		System.out.println();
		
		int score2 = 87;
		System.out.println("메서드 호출 전의 성적 : " + score2);
	
		test.setScore2(score2);
		System.out.println("메서드 호출 후의 성적 : " + score2);
		
		score2 = test.setScore2(score2);
		System.out.println("메서드 호출 후의 성적 : " + score2);
				
	}

}
