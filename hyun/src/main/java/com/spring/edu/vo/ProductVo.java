package com.spring.edu.vo;

import java.util.Date;
import lombok.Data;

@Data
public class ProductVo {
	
	/*상품번호*/
	private int pNo;
	
	/*상품이름*/
	private String pName;

	/*상품성별*/
	private String pGender;
	
	/*상품품종*/
	private String pKind;
	
	/*상품가격*/
	private int pPrice;
	
	/*상품분양유무*/
	private String pSale;
	
	/*상품예방접종*/
	private String pVaccine;
	
	/*상품생년월일*/
	private String pBirth;
	
	/*상품이미지*/
	private String pImg;
	
	/*상품등록일*/
	private Date pRegdate;
	

}
