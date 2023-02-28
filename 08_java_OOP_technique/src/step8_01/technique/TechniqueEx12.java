package step8_01.technique;

import java.util.ArrayList;
import java.util.HashMap;

/*

	# 다형성 ( polymorphism )
	
	- 다형성이란 하나의 메소드가 서로 다른 클래스에서 다양하게 실행되는 것을 의미한다.
	
	- 다형성을 구현하기 위해서는 다형성을 구현할 메소드가 포함된 모든 클래스가 같은 부모 클래스를 가져야 한다.
	
	- 부모 클래스와 자식 클래스에 같은 메소드가 있어야 하며 자식 클래스는 이 메소드를 반드시 override 하여 사용해야 한다.
	
	- 부모 클래스 타입에 자식 클래스 타입을 대입시켜 다형성이 구현된 메소드를 실행한다.

*/


// 부모클래스
class Shape{
	void draw() {} // 자녀 클래스가 상속받아서 사용할 메서드를 정의
}

class Line extends Shape{
	void draw() {
		//부모 메서드를 오버라이딩(재정의)하여 사용
		System.out.println("선을 그린다.");
	}
}
class Circle extends Shape{
	//부모 메서드를 오버라이딩(재정의)하여 사용
	void draw() {
		System.out.println("원을 그린다.");
	}
}
class Rect extends Shape{
	//부모 메서드를 오버라이딩(재정의)하여 사용
	void draw() {
		System.out.println("사각형을 그린다.");
	}
}


//다형성 <==> 메서드 오버라이딩 

//다형성 : 부모 클래스에서 메서드를 선언하고 자식 클래스들이 메서드를 상속받아 자기 방식대로 재정의 후 다운캐스팅 시 자식 메서드가 호출
//메서드 오버라이딩 : 부모클래스를 상속받아 메서드를 재정의
public class TechniqueEx12 {

	public static void main(String[] args) {
		
		
		
		Shape line = new Line();
		Shape circle = new Circle();
		Shape rect = new Rect();
		
		
		
		//부모 클래스의 타입으로 배열 생성 자식클래스로 배열의 요소 추가
		 Shape[] shape = new Shape[3];
		 shape[0] = new Line();
		 shape[0].draw(); // 메서드의 이름은 같으나 구현되는 기능이 다양함.(다형성)
		 
		 shape[1] = new Circle();
		 shape[1].draw();
		 
		 shape[2] = new Rect();
		 shape[2].draw();
		 
		 
		 //참고자료1)
		 ArrayList<Object> test1 = new ArrayList<Object>();
		 test1.add(100);
		 test1.add("문자열");
		 test1.add("true");
		 test1.add(new Circle());
		 
		 
		 
		 //참고자료2) Object는 모든 데이터를 다 담을수 있다.
		 HashMap<String, Object> test2 = new HashMap<String, Object>();
		 test2.put("data1",100);
		 test2.put("data2","문자열");
		 test2.put("data3",true);
		 test2.put("data4",new Circle());
		 test2.put("data5",'a');
		 
		 
		
		
	}

}

