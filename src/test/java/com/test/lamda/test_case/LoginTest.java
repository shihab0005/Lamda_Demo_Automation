package com.test.lamda.test_case;

import org.testng.annotations.Test;

import com.test.lamda.pages.LoginPage;

public class LoginTest {
	
	@Test(priority =0)
	public void Logout() throws InterruptedException {
		LoginPage login=new LoginPage();
		login.Logout();
		login.Login();
		
	}
	

	
	
     

}
