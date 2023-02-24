package step8_01.technique;


class Customer{
	String name;
	int age;
	int money;
	String address;
	String grade;
	
	Customer(String name, int age, String grade){
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	void showPrint() {
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("grade : " + grade);
		
	}
	
}

class GoldCustomer extends Customer{
	GoldCustomer(String name, int age, String grade){
		super(name, age, grade);
		
	}

	@Override
	void showPrint() {
	
		super.showPrint();
	}
	
	
}



public class Practice2 {

	public static void main(String[] args) {
		
		GoldCustomer customerLee = new GoldCustomer("주석", 29, "Gold");
		customerLee.showPrint();
	}

}
