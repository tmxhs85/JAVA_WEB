package step4_01.string;


public class StringEx07_정답 {

	public static void main(String[] args) {
		
		// 문제) 이름은 name배열에 성적은 score배열에 각각 저장 및 출력
		
		String str = "김철수/87,이만수/42,이영희/95";
		
		String[] name = new String[3];
		int[] score = new int[3];
		
		String[] save = new String[3];
		save = str.split(",");
		
		for (int i = 0; i < save.length; i++) {
			name[i] = save[i].split("/")[0];
			score[i] = Integer.parseInt(save[i].split("/")[1]);
		}
		
		for (int j = 0; j < name.length; j++) {
			System.out.print(name[j] + " ");
		}
		System.out.println();

		for (int k = 0; k < name.length; k++) {
			System.out.print(score[k] + " ");
		}
		
	}

}
