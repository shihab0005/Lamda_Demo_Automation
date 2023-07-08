package com.test.lamda.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.lamda.drivers.PageDriver;
import com.test.lamda.utilities.CommonMethods;

public class RegistrationPage extends CommonMethods{

	public RegistrationPage() {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
	}

	@FindBy(xpath="//input[@name='firstname']")
	WebElement firstName;

	@FindBy(name="lastname")
	WebElement lastName;

	@FindBy(id="input-email")
	WebElement emailId;

	@FindBy(id="input-telephone")
	WebElement phone;

	@FindBy(id="input-password")
	WebElement password;

	@FindBy(id="input-confirm")
	WebElement cpassword;

	@FindBy(xpath="//label[text()='No']")
	WebElement subscribeBtn;

	@FindBy(xpath="//label[@for='input-agree']")
	WebElement agreeBtn;

	@FindBy(xpath="//input[@value='Continue']")
	WebElement continueBtn;

	public void Registration() throws InterruptedException  {
		
		//input firstName
		
		try {
			if(firstName.isDisplayed()) {
				firstName.clear();
				firstName.sendKeys("SHihab");

			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

		//input lastName
		try {
			if(lastName.isDisplayed()) {
				lastName.clear();
				lastName.sendKeys("Khan");

			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}


		//input EMail
		try {
			if(emailId.isDisplayed()) {
				emailId.clear();
				emailId.sendKeys(emailID);

			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}


		//input phone
		try {
			if(phone.isDisplayed()) {
				phone.clear();
				phone.sendKeys("0194888555");

			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}


		//input password
		try {
			if(password.isDisplayed()) {
				password.clear();
				password.sendKeys(passwordVal);

			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

		//input cpassword
		try {
			if(cpassword.isDisplayed()) {
				cpassword.clear();
				cpassword.sendKeys(passwordVal);

			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}


		//input Subscribe
		try {
			if(subscribeBtn.isDisplayed()) {
				subscribeBtn.click();

			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}


		//input Agree Button
		try {
			if(agreeBtn.isDisplayed()) {
				agreeBtn.click();

			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

		//input COntinue Btn
		try {
			if(continueBtn.isDisplayed()) {
				continueBtn.click();

			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

		timeout(2000);
	}

}
