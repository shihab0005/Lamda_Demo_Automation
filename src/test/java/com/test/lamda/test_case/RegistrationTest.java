package com.test.lamda.test_case;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.test.lamda.drivers.BaseDriver;
import com.test.lamda.drivers.PageDriver;
import com.test.lamda.pages.RegistrationPage;

public class RegistrationTest extends BaseDriver{

	@BeforeSuite
	public void openUrl() {
		PageDriver.getCurrentDriver().manage().window().maximize();
		PageDriver.getCurrentDriver().get(url);
	}
	
	@Test(priority = 0)
	public void loginTest() throws InterruptedException  {
		RegistrationPage regPage = new RegistrationPage();
		regPage.Registration();
	}

}
