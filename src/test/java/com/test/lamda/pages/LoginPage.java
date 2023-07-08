package com.test.lamda.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.lamda.drivers.PageDriver;
import com.test.lamda.utilities.CommonMethods;

public class LoginPage extends CommonMethods{

//public WebDriver driver;

	public LoginPage() {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
	}


	@FindBy(xpath="//*[@id=\"column-right\"]/div/a[14]")
	WebElement LogoutOption;

	@FindBy(xpath="//*[@id='column-right']/div/a[1]")
	WebElement LoginMenu;

	@FindBy(id="input-email")
	WebElement userEmail;


	@FindBy(id="input-password")
	WebElement userpassword;

	@FindBy(xpath="//input[@value='Login']")
	WebElement loginBtn;


	public void Logout() throws InterruptedException {


		try {
			if(LogoutOption.isDisplayed()) {
				
				LogoutOption.click();
				

			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		timeout(2000);

	}

	public void Login() throws InterruptedException {
		//click login Menu
		try {
			if(LoginMenu.isDisplayed()) {
				LoginMenu.click();

			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

		//input eamil
		try {
			if(userEmail.isDisplayed()) {
				userEmail.clear();
				userEmail.sendKeys(emailID);

			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

		//input Password
		try {
			if(userpassword.isDisplayed()) {
				userpassword.clear();
				userpassword.sendKeys(passwordVal);

			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

		//Login button
		try {
			if(loginBtn.isDisplayed()) {
				loginBtn.click();

			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());

		}

		timeout(2000);

	}

}
