package step8_01.technique;
/*
   
	# static
 	
 	- 정적 필드와 정적 메소드는 객체(인스턴스)에 소속된 멤버가 아니라 클래스에 고정된 멤버이다.
 	- Static 키워드를 통해 생성된 정적멤버들은 Heap영역이 아닌 Static영역에 할당한다.
 	- Static 영역에 할당된 메모리는 모든 객체가 공유하여 하나의 멤버를 어디서든지 참조할 수 있다.
 	- Garbage Collector의 관리 영역 밖에 존재하기에 Static영역에 있는 멤버들은 프로그램의 종료시까지 메모리가 할당된 채로 존재한다.
 
 */



class Character{
	
	
	
	int hp = 100;
	int mana = 30; 
	static int moveSpeed = 1; //static영역에 올라온 moveSpeed는 GC가 지우지 못함(권한이 없음)
	//프로그램이 실행하는 동안 계속 할당되 있음.
	void showStatus() {
		System.out.println("hp: " + hp);
		System.out.println("mana: " + mana);
		System.out.println("moveSpeed: " + moveSpeed);
		System.out.println();
	}
	
	static void speedUp() { // static 메서드는 static변수만 들어갈 수 있다. 
		// hp -= 10;
		moveSpeed +=30;
	}
	
	
}
public class TechniqueEx03 {

	public static void main(String[] args) {
		Character.moveSpeed = 100; //moveSpeed는 static 변수이므로 클래스 변수 = new 클래스();를 안해줘도 이미 메모리에 올라와있다.
		Character  c1 = new Character();
		c1.hp = 0;
		Character.moveSpeed = 100; // 클래스.static변수명으로 접근한다. 
		Character.speedUp();//클래스.static메서드명으로 접근 
		c1.showStatus();
		
		Character  c2 = new Character();
		
		c2.showStatus();
		
		Character  c3 = new Character();
		c3.showStatus();
		
		//static 예시 
		System.out.println(Math.PI);
		//S: Static, F:final(상수)
		System.out.println(Math.abs(-5)); // 절대값 
		
		try {
			Thread.sleep(3000); // 3초(1초 = 1000) 뒤에 끝 문구 출력함.
			System.out.println("끝");
			
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
