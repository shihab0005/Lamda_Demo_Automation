package com.test.lamda.test_case;

import org.testng.annotations.Test;

import com.test.lamda.pages.ShopByCategoryPage;

public class ShopByCategoryTest {
	
	
	@Test
	public void BuyProduct() {
		
		ShopByCategoryPage buy= new ShopByCategoryPage();
		buy.PurchesProduct();
		buy.FindAllProduct();
		buy.SelectProduct();
	}

}
