package step5_01.exception;

/*
 *
 * # finally
 * 
 * 에러발생과 상관없이 무조건 실행할 명령어를 작성한다.
 * 주로 외부모듈과의 커넥션을 종료할 때 사용한다.
 * 
 */


public class ExceptionEx02 {

	public static void main(String[] args) {
		
		try {
			
			int[] testArr = new int[5];
			//System.out.println(testArr[999]);	
			//System.out.println(testArr[0] / 0);
			System.out.println(testArr[0]);	
		
		} catch (Exception e) {
			System.out.println("모든 에러클래스의 조상");
			e.printStackTrace();
		} finally {
			System.out.println("try ~ catch 수행 후 반드시 실행");
		}

	}

}
