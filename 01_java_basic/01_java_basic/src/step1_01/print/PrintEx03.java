package step1_01.print;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintEx03 {

	public static void main(String[] args) {

		/*
		 * 
		 * 	# Date
		 * 
		 * 	[1] 날짜 및 시간 출력 서식 지정 방법
		 * 		- 날짜 및 시간 서식에 사용되는 영문자를 제외한 나머지 문자는 입력하는 그대로 출력된다.
		 * 		- Date date = new Date();
		 * 		- SimpleDateFormat sdf = new SimpleDateFormat("날짜 및 시간 서식");
		 * 	[2] 날짜 및 시간 서식 적용 방법
		 * 		- sdf.format(date);
		 * 	[3] 날짜 및 시간 출력 서식 문자의 종류
		 * 		- 구글에서 "simpledateformat 날짜 형식" 이라고 검색하기
		 * 
		 * 	# System.currentTimeMillis()
		 * 
		 * 		- 1970년 1월 1일 자정부터 이 메서드가 실행되는 순간까지 지나온 시간을 밀리초 (1/1000초) 단위로 얻어온다.
		 * 		- 13자리의 숫자를 얻어오기 때문에 int로 처리하면 에러가 발생되므로 long으로 처리해야 한다.
		 * 
		 */
		
		Date date = new Date();
		System.out.println(date);	// Thu Feb 17 13:05:52 GMT+09:00 2022
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf1.format(date));	// 2022-02-17
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMdd");
		String temp = sdf2.format(date);
		System.out.println(temp);	// 20220217
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 a hh시 mm분 ss초");
		System.out.println(sdf3.format(date));	// 2022년 02월 17일 목요일 오후 01시 30분 21초
		
		System.out.println("\n=================================================\n");
		
		// int time = System.currentTimeMillis();	// 에러 발생
		long time = System.currentTimeMillis();
		System.out.println(time);	// 1645072807514
		System.out.println(sdf1.format(time));	// 2022-02-17
		System.out.println(sdf2.format(time));	// 20220217
		System.out.println(sdf3.format(time));	// 2022년 02월 17일 목요일 오후 01시 40분 36초
		
		System.out.println("\n=================================================\n");
		
		// DecimalFormat df = new DecimalFormat("숫자 서식");
		// 숫자 서식은 "#,##0"을 쓰고 필요한 문자를 앞 또는 뒤에 붙여준다.
		
		int salary1 = 10000000;
		int salary2 = 1000000;
		int salary3 = 100000;
		
		DecimalFormat df1 = new DecimalFormat("#,##0");
		DecimalFormat df2 = new DecimalFormat("$#,##0");
		DecimalFormat df3 = new DecimalFormat("#,##0원");
		
		System.out.println(df1.format(salary1));
		String temp2 = df2.format(salary2);
		System.out.println(temp2);
		System.out.println(df3.format(salary3));
		
	}

}
