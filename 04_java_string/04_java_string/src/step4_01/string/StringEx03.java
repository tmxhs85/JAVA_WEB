package step4_01.string;

// 문자열 관련 메서드

public class StringEx03 {

	public static void main(String[] args) {

		String strData = "megait";
		System.out.println(strData);
		System.out.println("\n ============== \n");
		
		// [1] 문자열의 길이 : length()
		System.out.println(strData.length());
		int size = strData.length();
		System.out.println(size);
		System.out.println("\n ============== \n");
		
		// [2] 문자 한개 추출(인덱싱) : charAt(index)
		System.out.println(strData.charAt(0));
		System.out.println(strData.charAt(1));
		char ch = strData.charAt(2); // charAt의 반환타입은 char
		System.out.println(ch);
		System.out.println(strData.charAt(strData.length() - 1));
		System.out.println();
		
		for (int i = 0; i < strData.length(); i++) {
			System.out.println(strData.charAt(i));
		}
		
		System.out.println("\n ============== \n");
		
		// [3] 문자 여러개 추출(슬라이싱) : substring()
		
		// 3-1) substring (index1 이상, index2 미만)
		System.out.println(strData.substring(0, 4));
		System.out.println(strData.substring(4, 6));
		String subStr = strData.substring(2, 4); // substring의 반환타입은 String
		System.out.println(subStr);
		
		// 3-2) substring (index1 이상)
		System.out.println(strData.substring(2));
		System.out.println(strData.substring(4));
		System.out.println("\n ============== \n");
		
		// [4] 구분자로 잘라내기 : split("구분자")
		String str1 = "hello,java";
		String str2 = "hello java programming";
		String str3 = "hello@java@programming@megait";
		
		String[] temp = str1.split(",");
		System.out.println(temp.length);
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
		System.out.println();

		temp = str2.split(" ");
		System.out.println(temp.length);
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
		System.out.println();
		
		temp = str3.split("@");
		System.out.println(temp.length);
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
		System.out.println();

		// [5] 문자열 비교 : compareTo()
		
		str1 = "ac";
		str2 = "dc";
		str3 = "ac";
		
		System.out.println(str1.compareTo(str2)); // 왼쪽값(기준값)이 작을 경우 음수가 반환된다
		System.out.println(str2.compareTo(str1)); // 왼쪽값(기준값)이 클 경우 양수가 반환된다
												  // a와 d를 비교했을 때 3만큼 차이나기 때문에 -3, 3이 출력된다

		System.out.println(str1.compareTo(str3)); // 양쪽값이 같을 경우 0이 반환된다
		
	}

}
