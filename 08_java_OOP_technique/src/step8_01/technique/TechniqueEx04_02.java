package step8_01.technique;

import java.text.SimpleDateFormat;
import java.util.Scanner;



// # 생성자를 이용한 멤버변수 초기화

class GoodsDTO{
	
	String goodsCd;
	String goodsNm;
	int price;
	
	//생성자 단축키 > 좌측 상단 > Source > Generate Constructor Using Fields....
	GoodsDTO(String goodsCd, String goodsNm, int price) {
		this.goodsCd = goodsCd;
		this.goodsNm = goodsNm;
		this.price = price;
	}
	
	
	void setData(String goodsCd, String goodsNm, int price) {
		this.goodsCd = goodsCd;
		this.goodsNm = goodsNm;
		this.price = price; 
	}
	
	
	
	
	
	
	
}


public class TechniqueEx04_02 {

	public static void main(String[] args) {

		// 생성자를 이용한 멤버변수 초기화
		
		
		GoodsDTO goods1 = new GoodsDTO("0x001","맨투맨",40000);
		// goods1.setData("0x001","맨투맨",40000);
		
		new GoodsDTO("0x002", "머슬핏 반팔", 25000);
		new GoodsDTO("0x003", "바람막이", 100000);
		
		
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat();
		//File file = new File("파일이름");
		
	}

}
