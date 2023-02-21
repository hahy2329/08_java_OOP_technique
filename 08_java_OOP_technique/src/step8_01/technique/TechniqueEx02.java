package step8_01.technique;

/*
 * 
 *  # 캡슐화 (capsulation)
 * 
 * - 접근제어자 : public , private  + getter/setter
 * 
 * 
 * [ 접근제어자(Modifier)의 종류 ]
 * 
 * public  : 프로젝트 전체에서 접근 가능
 * private : 클래스 내부에서만 접근 가능
 * 
 * default(package) : 패키지 내에서만 접근가능 // 패키지는 파일 안에 있는 자바 파일들만 이용 가능 
 * protected        : 상속관계에서 접근 가능
 * 
 * 
 * */

class ModifierTest{
	
	private int a; // private은 get과 set이 세트메뉴처럼 같이 움직여야 변수 접근이 가능하다.
	int b;
	
	
	
	
	
	//private변수를 클래스 외부로 꺼내주는 메서드 getter
	int getA() { //변수명 앞에 get을 추가하여 메서드의 이름을 지정한다.
		return this.a;
	}
	
	//private변수를 클래스 외부에서 수정하는 메서드 setter
	void setA(int a){ // 변수명 앞에 set을 추가하여 메서드의 이름을 지정한다.
		this.a = a;
	}
	
	
	
}
//VO : Value Object : 값 객체 
//DTO : Data Transfer Object : 데이터 전송 모델 객체 


class ProductDTO{
	
	private String productCd; // 상품 코드
	private String productNm; //상품 이름
	private int price; // 가격 
	private String brandCd; 
	private String brandNm;
	
	//getter & setter 생성 단축키 
	//좌측 상단 source > Generate Getters and Setters > selectAll > Generate
	
	
	public String getProductCd() {
		return productCd;
	}
	public void setProductCd(String productCd) {
		this.productCd = productCd;
	}
	public String getProductNm() {
		return productNm;
	}
	public void setProductNm(String productNm) {
		this.productNm = productNm;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrandCd() {
		return brandCd;
	}
	public void setBrandCd(String brandCd) {
		this.brandCd = brandCd;
	}
	public String getBrandNm() {
		return brandNm;
	}
	public void setBrandNm(String brandNm) {
		this.brandNm = brandNm;
	}
	

	
	
	
}



public class TechniqueEx02 {

	public static void main(String[] args) {
		
		ModifierTest test = new ModifierTest();
		
		//private 변수는 클래스 외부에서 접근 불가 
		//test.a = 1000;
		//System.out.println(test.a);
		
		test.setA(1000); // setter를 이용하여 private 변수에 값 대입 
		System.out.println(test.getA()); // getter를 이용하여 private변수에 데이터 접근 
		
		test.b = 2000;
		System.out.println(test.b);
		
		
		System.out.println();
		
		
		ProductDTO productDTO = new ProductDTO();
		productDTO.setProductCd("0x001");
		productDTO.setProductNm("기계식키보드");
		productDTO.setPrice(45000);
		productDTO.setBrandCd("b1");;
		productDTO.setBrandNm("로지택");
		
		System.out.println(productDTO.getProductCd());
		System.out.println(productDTO.getProductNm());
		System.out.println(productDTO.getPrice());
		System.out.println(productDTO.getBrandCd());
		System.out.println(productDTO.getBrandNm());
	}

}
