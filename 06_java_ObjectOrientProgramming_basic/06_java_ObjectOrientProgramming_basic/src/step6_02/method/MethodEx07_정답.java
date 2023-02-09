package step6_02.method;

class MethodEx07 {
	
	void printEvenOrOdd(int x) {
		if (x % 2 == 0) {
			System.out.println(x + "는 짝수");
		}
		else {
			System.out.println(x + "는 홀수");
		}
	}
	
	void getAvgBetweenValues(int x, int y) {
		int sum = 0;
		for (int i = x; i < y+1; i++) {
			sum += i;
		}
		double avg = (double)sum / (y-x+1);
		System.out.println(x + "부터 " + y + "까지의 합의 평균 : " + avg);
	}

	void printPrimeNums(int primeNumber) {
		System.out.print("2부터 " + primeNumber + "까지의 소수 : ");
		for (int i = 2; i < primeNumber+1; i++) {
			int cnt = 0;
			for (int j = 2; j < i+1; j++) {
				if (i % j == 0) {
					cnt++;
				}
			}
			if (cnt == 1) {
				System.out.print(i + " ");
			}
		}
	}
	
}

public class MethodEx07_정답 {

	public static void main(String[] args) {
		
			MethodEx07 e = new MethodEx07();
			
			// 문제 1) num이 홀수인지 짝수인지 출력하는 메서드
			int num = 19;
			e.printEvenOrOdd(num);
	
			// 문제 2) x부터 y까지 합의 평균을 출력하는 메서드
			int x = 1;
			int y = 10;
			e.getAvgBetweenValues(x, y);
	
			// 문제3) 2부터 primeNumber까지의 소수를 전부 출력하는 메서드 
			int primeNumber = 20;
			e.printPrimeNums(primeNumber);

	}

}
