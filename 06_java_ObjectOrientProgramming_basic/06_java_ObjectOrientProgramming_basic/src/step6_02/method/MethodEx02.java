package step6_02.method;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 
 *  # 메서드의 4가지 형태
 * 
 * - 입력값(파라메타 , 매개변수 , 인수 , 인자 , 아규먼트)과 결과값(return)의 유무에 따라 4가지 형태로 구분할 수 있따.
 * 
 * 		입력값이 있고 , 결과값이 있다. ( 11 )
 * 		입력값이 있고 , 결과값이 없다. ( 10 )
 * 		입력값이 없고 , 결과값이 있다. ( 01 )
 * 		입력값이 없고 , 결과값이 없다. ( 00 )
 * 
 */

class MethodType {
	
	// 입력값도 없고 결과값도 없는 경우
	void type00() {
		System.out.println("====================");
		System.out.println("1. 로그인");
		System.out.println("2. 로그아웃");
		System.out.println("3. 정보조회");
		System.out.println("4. 정보수정");
		System.out.println("5. 종료");
		System.out.println("====================");
	}

	// 입력값은 있고 결과값은 없는 경우
	void type10(String fileName) {

		try {
			FileWriter fw = new FileWriter(fileName);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

	// 입력값은 없고 결과값은 있는 경우
	double type01() {
		return 3.141592;
	}

	// 입력값과 결과값이 모두 있는 경우
	int type11(String birth) {
		String temp = birth.substring(0, 4);
		int age = 2022 - Integer.parseInt(temp) + 1;
		return age;
	}
	
}

public class MethodEx02 {

	public static void main(String[] args) {

		MethodType test = new MethodType();
		
		// 입력값도 없고 결과값도 없는 경우
		test.type00();
		System.out.println();
	
		// 입력값은 있고 결과값은 없는 경우
		test.type10("팀 버너스 리.txt");
		test.type10("데니스 리치.txt");
		test.type10("제임스 고슬링.txt");
		// test.type10('C'); // 불가능 (매개변수의 타입이 일치해야한다.)
		// test.type10("파일1.txt", "파일2.txt"); // 불가능 (매개변수의 개수가 일치해야한다.)
		
		// 입력값은 없고 결과값은 있는 경우
		System.out.println("PI : " + test.type01());
		
		double pi = test.type01();
		System.out.println("PI : " + pi);
		
		System.out.println();
	
		// 입력값과 결과값이 모두 있는 경우
		System.out.println("나이 : " + test.type11("19800101") + "살");
		
		int age1 = test.type11("19900101");
		System.out.println("나이 : " + age1 + "살");
		
		if (test.type11("20220101") == 1) {
			System.out.println("1살입니다.");
		}	
		
	}

}
