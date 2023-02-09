package step6_02.method;

/*
 * 
 * # 메서드 오버로딩(overloading), 메서드 중복정의
 * 
 * 1) 매개변수의 개수와 2) 매개변수의 데이터 타입이 달라도
 * 같은 이름으로 만들어진 여러 개의 메서드를 사용할 수 있는 기법
 * [메서드 오버라이딩과 헷갈림 주의]
 * 
 */

class MethodOverloadingEx {
	
	int add(int x, int y) {
		return x + y;
	}
	
	int add(int x, int y, int z) {
		return x + y + z;
	}
	
	double add(double x, int y) {
		return x + y;
	}

	double add(int x, double y) {
		return x + y;
	}
	
	double add(double x, double y) {
		return x + y;
	}
	
	int add(int[] x) {
		int result = 0;
		for (int i = 0; i < x.length; i++) {
			result += x[i];
		}
		return result;	
	}
	
}

public class MethodEx18 {

	public static void main(String[] args) {

		MethodOverloadingEx test = new MethodOverloadingEx();
		
		int[] arr = {1, 2, 3, 4, 5};
		
		System.out.println(test.add(12, 3));		// 정수, 정수
		System.out.println(test.add(12, 3, 1));		// 정수, 정수, 정수
		System.out.println(test.add(3.14, 3));		// 실수, 정수
		System.out.println(test.add(3, 3.14));		// 정수, 실수
		System.out.println(test.add(3.14, 5.87));	// 실수, 실수
		System.out.println(test.add(arr));			// 배열
		
	}

}
