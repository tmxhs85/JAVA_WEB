package step5_02.file;

import java.io.FileWriter;
import java.io.IOException;

//# 파일 저장하기 : 연습문제1

public class FileEx03_정답 {

	public static void main(String[] args) {
		
		// 김철수/20,이만수/30,이영희/40
		
		String[] names = {"김철수", "이만수", "이영희"};
		int[] ages     = {	   20,     30,     40};
		
		String fileName = "fileTest01.txt";
		
		String data = "";
		
		int num = 0;
		
		FileWriter fw = null;
		
		try {

			fw = new FileWriter(fileName);
			
			for (int i = 0; i < names.length; i++) {
				if (num % 2 == 0) {
					data += names[i];
					num++;
					if (i < names.length - 1) {
						data += "/";
					}
					i--;
				}
				else {
					data += ages[i];
					num++;
					if (i < names.length - 1) {
						data += ",";
					}
				}
			}
			
			fw.write(data);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {fw.close();} catch (IOException e) {e.printStackTrace();}
		}
		
	}

}
