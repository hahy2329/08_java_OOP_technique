package step8_01.technique;

/*
 * 
 *  # this , super
 * 
 * 	- this : 자신의 객체
 *    super : 부모클래스의 객체
 *  
 *  - this() : 자신의 생성자
 *    super() : 부모클래스의 생성자
 *  
 *  - this.testMethod() : 자신의 메서드 호출
 *    testMethod()		: 자신의 메서드 호출
 *    super.testMethod() : 부모의 메서드 호출
 * 
 * */

class Parent{
	
	String name;
	int age;
	
	Parent(){
		this("무명",-1);
		System.out.println("(P-기본) 부모클래스의 기본생성자 실행");
	}
	
	Parent(String name, int age){
		System.out.println("(P-추가) 부모클래스의 기본생성자 실행");
	}
	
	void testMethod() {
		System.out.println("(P)부모의 테스트 메서드");
	}
	
	
	
}
class Child extends Parent{
	Child(){
		super(); // 부모클래스의 기본생성자를 실행(기본적으로 생략되어있다.)
		//super("앨런튜링", 70); // 부모클래스의 추가된 생성자를 실행
		System.out.println("(C-기본) 자녀 클래스의 기본생성자 실행");
	}
	
	
	Child(String name, int age){
		
		this();
		//super();
		//super(name, age);
		
		System.out.println("(C-추가) 자녀클래스의 추가된 생성자 실행");
		
	}
	
	void testMethod() {
		System.out.println("(C)자녀의 테스트 메서드");
	}
	
	void showMethod() {
		
		System.out.println(super.name); // 부모 클래스의 변수
		System.out.println(super.age); // 부모 클래스의 변수
		
		super.testMethod(); //부모 클래스의 testMethod 호출
		this.testMethod(); // 자신의 testMethod호출
		testMethod(); // this는 보통 생략가능 (자신의 testMethod호출)
		
		
	}
	
	
}


public class TechniqueEx08 {

	public static void main(String[] args) {
		/*
		new Parent();
		System.out.println();
		
		new Parent("제임스고슬링", 70);
		System.out.println();
		
		new Child();
		System.out.println();
		*/
		Child c = new Child("제임스고슬링 주니어", 40);
		System.out.println();
		//c.showMethod();
		
		
		
	}

}
