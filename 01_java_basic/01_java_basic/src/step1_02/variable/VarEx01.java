package step1_02.variable;


/*
 * 
 *  # 변수 ( variable )
 *  
 *  - 단 하나의 값을 저장할 수 있는 메모리 공간
 *  
 *  	1) 변수의 선언 그리고 초기화
 *  	
 *  	변수의 선언 	: int nData;	// 메모리 공간 할당
 *  	변수의 초기화	: nData = 0;    // 값 저장
 *  
 *  	
 *  	2) 변수의 선언과 동시에 초기화
 *  	
 *  	int nData = 0;
 *  	
 *  
 *  	3) 변수의 특징
 *  	
 *  	3-1) 변수는 변수 하나당 값을 한개만 저장할 수 있다. [ 고유성 ]
 *  	3-2) 새로운 값이 변수에 저장되면 이전값은 사라진다.
 *  
 * 
 * */

public class VarEx01 {

	public static void main(String[] args) {

		// 1. 정수 : Integer (int)
		int nData;   	// 변수의 선언 
		nData = 3;		// 값을 저장
		System.out.println(nData);
		
		
		// 2. 실수 : double
		double fData; 
		fData = 3.14;
		System.out.println(fData);
		
		
		// 3. 문자 : character(char)
		char cData1 = 'a';
		char cData2 = '가';
		
		System.out.println(cData1);
		System.out.println(cData2);
		
		
		// 4. 문자열 : String
		String strData = "java";
		System.out.println(strData);
		
		
		// 5. 참과 거짓 : boolean
		boolean isChecked = true;
		System.out.println(isChecked);
		
		int tempData = 10;
		//int tempData = 12; // (error) 변수명은 고유해야 한다.
		tempData = 3;
		System.out.println(tempData);
		tempData = 5;
		tempData = 7;
		System.out.println(tempData); // 마지막 대입된 값 1개만 저장되어 있다.
		
	}

}
