package step8_01.technique;

/*
 * # 싱글턴 패턴
 * 
 *  - 객체를 1번만 생성하고 싶을 때 사용하는 기법
 *  
 *  - 싱글턴 패턴을 만드는 방법
 *  
 *    1) private 기본 생성자를 만든다.
 *    2) 내부에서 static으로 자기자신의 인스턴스를 생성한다. (핵심)
 *	  3) instance를 반환할 getter를 만들어준다.	  
 *  
 * */

class SingleTonTest{
		 // 1) private 기본 생성자를 만든다.
		private SingleTonTest(){}
			
		 // 2) 내부에서 static으로 자기자신의 인스턴스를 생성한다. (핵심)
		private static SingleTonTest instance = new SingleTonTest();
	
		 // 3) instance를 반환할 getter를 만들어준다.
		
		public static SingleTonTest getInstance() {
			return instance;
		}
		
		
		
		//테스트 변수 
		String testVar = "테스트변수";
		//테스트 메서드 
		void testMethod() {
			System.out.println("테스트 메서드");
		}
}
class ClassTest{
	
}


public class TechniqueEx05 {

	public static void main(String[] args) {
		/*
		System.out.println(new SingleTonTest());//다른객체
		System.out.println(new SingleTonTest());//다른객체
		System.out.println(new SingleTonTest());//다른객체
		*/
		
		
		//싱글톤으로 바꿔보자 아래부터 시작 
		
		
		// private 생성자로 인하여 new 클래스() 형태로 객체 생성 불가
		// new SingleTonTest();
		
		
		System.out.println(SingleTonTest.getInstance()); //클래스.static변수명 같은 객체(private 이 아닐때) 
		System.out.println(SingleTonTest.getInstance()); // 같은 객체 
		System.out.println(SingleTonTest.getInstance()); // 같은 객체 
		System.out.println();
		
		//싱글턴 클래스.instance.변수명 (private이 아닐때)
		//참조변수를 private로 재수정함 
		System.out.println(SingleTonTest.getInstance().testVar);
		
		//싱글턴 클래스.instance.메서드명()(private이 아닐때) 
		//참조변수를 private로 재수정함
		SingleTonTest.getInstance().testMethod();
		System.out.println();
		
		System.out.println(new ClassTest());//다른객체
		System.out.println(new ClassTest());//다른객체
		System.out.println(new ClassTest());//다른객체
		
	}

}
