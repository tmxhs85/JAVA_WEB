package step4_01.string;


public class StringEx05_정답 {

	public static void main(String[] args) {

		String jumin = "890101-2012932";
		// 문제 1) 나이 출력
		// 정답 1) 34세
		int age = Integer.parseInt(jumin.substring(0,2));
		System.out.println((2022 - (1900 + age) + 1) + "세");
		
		// 문제 2) 성별 출력
		// 정답 2) 여성
		char c = jumin.charAt(7);
		if (c == '1') {
			System.out.println("남성");
		}
		else if (c == '2') {
			System.out.println("여성");
		}

	}

}
