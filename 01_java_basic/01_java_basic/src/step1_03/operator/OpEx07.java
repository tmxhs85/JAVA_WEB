package step1_03.operator;

/*
 * 
 *  증감 연산자 
 *  
 *  += , -= , *= , /= , %= , ++ , -- 
 * 
 * */ 

public class OpEx07 {

	public static void main(String[] args) {

		int tempData1 = 100;
		tempData1 -= 3; //tempData1 = tempData1 - 3;
		System.out.println(tempData1);
		
		int tempData2 = 10;
		tempData2 += 7000; //tempData2 = tempData2 + 7000;
		System.out.println(tempData2);
		
		int tempData3 = 100;
		tempData3 *= 3; //tempData3 = tempData3 * 3;
		System.out.println(tempData3);
		System.out.println();
		
		
		int x = 0;
		System.out.println(x++); // 명령어 수행후 증감
		System.out.println(x);
		System.out.println();
		
		int y = 0;
		System.out.println(++y); // 증감 후 명령후 수행
		System.out.println(y);
		System.out.println();
		
		int z = 0;
		System.out.println(z);
		z++; //z += 1; //z = z + 1;
		System.out.println(z);
		++z; //z += 1; //z = z + 1;
		System.out.println(z);
		
	}

}
