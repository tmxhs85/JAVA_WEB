package step8_01.technique;

/*
 * 
 * 	# static
 * 
 * 	 - 정적 필드와 정적 메서드는 객체(인스턴스)에 소속된 멤버가 아니라 클래스에 고정된 멤버이다.
 * 	 - static 키워드를 통해 생성된 정적 멤버들은 Heap 영역이 아닌 static 영역에 할당한다.
 * 	 - static 영역에 할당된 메모리는 모든 객체가 공유하여 하나의 멤버를 어디서든지 참조할 수 있다.
 * 	 - Garbage Collector의 관리 영역 밖에 존재하기에 static 영역에 있는 멤버들은 프로그램의 종료시까지 메모리가 할당된 채로 존재한다.
 * 
 */

class Character {
	
	int level = 1;
	int hp = 100;
	int mana = 30;
	static int moveSpeed = 5;
	
	void showStatus() {
		
		System.out.println("level : " + level);
		System.out.println("hp : " + hp);
		System.out.println("mana : " + mana);
		System.out.println("moveSpeed : " + moveSpeed);
		System.out.println();

	}
	
	static void speedUp() {
		moveSpeed += 10000;
	}
	
}

public class TechniqueEx03 {

	public static void main(String[] args) {

		Character c1 = new Character();
		c1.hp -= 50;
		
		// 클래스이름.static변수명 으로 접근
		Character.moveSpeed += 1000; // c1.moveSpeed += 1000;
		
		// 클래스이름.static메서드명() 으로 접근
		Character.speedUp(); // c1.speedUp();
		
		c1.showStatus();
		
		Character c2 = new Character();
		c2.hp = 0;
		c2.level++;
		Character.moveSpeed += 3000; // c2.moveSpeed += 3000;
		c2.showStatus();
		
		Character c3 = new Character();
		c3.showStatus();
		
		// static 사용 예시
		// new Math()로 객체를 생성하지 않고도 class명으로 접근하여 Math 내부의 메서드를 사용할 수 있다.
		System.out.println(Math.PI);
		System.out.println(Math.abs(-5));
		
		try {
			Thread.sleep(3000);
			System.out.println("끝");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
