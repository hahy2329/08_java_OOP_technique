package step8_01.technique;

import java.util.ArrayList;

public interface TechniqueEx10_02 {
	
	public abstract void addProduct(ProductDTO productDTO);
	public abstract ArrayList<ProductDTO> getOrderList();
	public abstract ProductDTO getOrderDetail(int orderCd);
	public void setProduct(ProductDTO productCd); // abstract생략 가능 
	public void removeProductList(int[] productCdList);
	public void removeProductOne(int productCd);
	
	
	
}
