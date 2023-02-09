package step7_01.classArray;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * 
 * [ 래퍼 클래스(wrapper class) ]
 * 
 * - 래퍼 클래스란, 기본 자료형을 클래스로 만들어 놓은 것을 의미한다.
 *   [기본형]          [래퍼 클래스]
 *    byte                Byte
 *    short               Short
 *    int                 Integer
 *    long                Long
 *    float               Float
 *    double              Double
 *    char                Character
 *    boolean             Boolean
 *
 *
 *
 *  [ 제네릭 ]
 *  
 * - 제네릭(generic)이라 부르며 ArrayList에 저장될 데이터 타입을
 *   반드시 클래스로 작성한다.
 * - 기본 자료형 데이터를 저장하는 ArrayList를 만들어야 하는 경우에는
 *   래퍼 클래스를 사용한다.
 *
 *
 *
 *  [ java.util.ArrayList ]
 *  
 * - 배열은 한번 선언하면 프로그램에서 그 크기를 바꿀 수 없다.
 * - ArrayList 클래스는 데이터가 입력되면, 자동으로 크기가 커지고
 * - 데이터가 제거되면, 자동으로 크기가 작아진다.
 * - 중간에 데이터가 삽입되면, 데이터가 삽입될 위치부터 모든 데이터가 뒤로 이동되고
 * - 중간의 데이터가 제거된 다음 위치부터 모든 데이터가 앞으로 이동한다.
 * - ArrayList 생성 방법
 * 
 *   ArrayList<Integer> list = new ArrayList<Integer>();     
 *   ArrayList<Integer> list = new ArrayList<>();           // 우변의 제네릭의 데이터형은 생략 가능하다.
 *   
 *   
 *   ArrayList<String> list = new ArrayList<String>();
 *   ArrayList<Product> list = new ArrayList<Product>();
 *   ArrayList<Member> list = new ArrayList<Member>();
 *   
 */

public class ClassArrayEx10 {

	public static void main(String[] args) {

		int[] arr = new int[10];
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.println(Arrays.toString(arr));
		System.out.println(list);
		
		System.out.println("====================================");
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		// add(value) : ArrayList의 맨 뒤에 value를 추가한다.
		// add(index, value) : ArrayList의 index번째에 value를 추가한다.
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(2,35);
		list.add(50);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(list);
		
		System.out.println("====================================");

		System.out.println("크기 : " + arr.length);
		// size() : ArrayList의 데이터의 개수를 반환한다.
		System.out.println("크기 : " + list.size());

		System.out.println("====================================");
		
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		
		// set(index, value) : ArrayList의 index번째의 값을 value값으로 수정한다.
		list.set(0, 100);
		list.set(1, 200);
		list.set(2, 300);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(list);
		
		System.out.println("====================================");
		
		arr[0] = 0;
		arr[1] = 0;
		arr[2] = 0;
		
		// remove(index) : ArrayList의 index번째 위치의 값을 삭제한다.
		list.remove(2);
		list.remove(1);
		list.remove(0);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(list);
		
		System.out.println("====================================");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) {
			// get(index) : ArrayList의 index번째의 value를 얻어온다.
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		System.out.println("====================================");
		
		/*
		 * 
		 * # 향상된 for문 (foreach)
		 * 
		 * [구조]
		 * 
		 * for (자료형 변수명 : Array of ArrayList) {
		 * 		명령어;
		 * }
		 * 
		 * element가 직접 변수에 저장된다.
		 * 
		 */

		for (int element : arr) {
			System.out.print(element + " ");
		}
		System.out.println();
		
		for (int element : list) {
			System.out.print(element + " ");
		}
		System.out.println();
		
		System.out.println("====================================");

		// 예시 1)
		String[] indexs = {"한놈", "두시기", "석삼", "너구리", "오징어"};
		
		for (int i = 0; i < indexs.length; i++) {
			System.out.print(indexs[i] + " ");
		}
		System.out.println();
		
		for (String index : indexs) {
			System.out.print(index + " ");
		}
		System.out.println();
		
		System.out.println("====================================");
		
		// 예시 2)
		ArrayList<Product> productList = new ArrayList<Product>();
		
		for (int i = 0; i < 10; i++) {
			
			Product product = new Product();
			product.name = "상품" + i;
					
			productList.add(product);
			
		}
		
		for (int i = 0; i < productList.size(); i++) {
			System.out.print(productList.get(i).name + " ");
		}
		System.out.println();
		
		for (Product pd : productList) {
			System.out.print(pd.name + " ");
		}
		System.out.println();
		
		System.out.println("====================================");

		arr = null;
		list.clear(); 	// ArrayList의 전체 데이터만 삭제
		list = null; 	// ArrayList 자체를 삭제
		
		
		
	}

}
