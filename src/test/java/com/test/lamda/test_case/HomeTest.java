package com.test.lamda.test_case;

import org.testng.annotations.Test;
import com.test.lamda.pages.HomePage;


public class HomeTest {
	
	@Test(priority =0)
	public void Home() throws InterruptedException {
		HomePage home=new HomePage();
		home.HomeAssertionCheck();
		
	}
	

}
