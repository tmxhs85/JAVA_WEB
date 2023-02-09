package step3_01.arrayAdvance;

import java.util.Arrays;

// 배열의 주소

public class ArrayEx34 {

	public static void main(String[] args) {

		int nVar1 = 10;
		int nVar2 = nVar1; // 값을 복사하여 처리
		
		System.out.println("nVar1 : " + nVar1);
		System.out.println("nVar2 : " + nVar2);
		
		nVar1 = 100;
		System.out.println("nVar1 : " + nVar1);
		System.out.println("nVar2 : " + nVar2);
		System.out.println();
		
		int[] arr1 = {87 , 100 , 24 , 11 , 79};
		int[] arr2 = arr1; // 주소값을 전달

		System.out.println("arr1 : " + arr1);
		System.out.println("arr2 : " + arr2);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		arr1[0] = -1;
		arr2[1] = -2;
		arr1[2] = -3;
		arr2[3] = -4;
		arr1[4] = -5;
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
	}

}
