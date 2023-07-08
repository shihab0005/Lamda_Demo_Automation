package com.test.lamda.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.test.lamda.drivers.PageDriver;

public class HomePage {


		
		public HomePage() {
			PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		}
		
		@FindBy(xpath="//div[@id='entry_217821']//a")
		WebElement logo;
		
		@FindBy(xpath="//div[@id='entry_217822']")
		WebElement SearchBox;
		
		@FindBy(xpath="//div[@id='entry_217823']")
		WebElement compareBtn;
		
		@FindBy(xpath="//div[@id='entry_217824']")
		WebElement wishListBtn;
		
		@FindBy(xpath="//div[@id='entry_217825']")
		WebElement cartBtn;
		
		@FindBy(xpath="//div[@id='widget-navbar-217834']/ul/li")
		List<WebElement> navItem;
		
		@FindBy(xpath="//div[@id='entry_213249']/h3")
		WebElement trandingCatTitle;
		
		@FindBy(xpath="//div[@id='swiper-wrapper-10d47dbae1281170b']/div")
		List<WebElement> trandingCatProducts;
		
		@FindBy(xpath="//div[@id='entry_213258']/h3")
		WebElement topProductsTitle;
		
		@FindBy(xpath="//div[@id='swiper-wrapper-a1da61f813ff7c11']/div")
		List<WebElement> topProducts;
		
		@FindBy(xpath="//div[@id='mz-product-listing-39213264']/div/h3")
		WebElement topCollectionTitle;
		
		@FindBy(xpath="//*[@id='mz-product-listing-39213264']/div[1]/div/ul/li")
		List<WebElement> topCollectionCat;
		
		@FindBy(xpath="//*[@id='entry_213271']/h3")
		WebElement blog;
		
		@FindBy(xpath="//*[@id='swiper-wrapper-7a53a9107bd213c22']/div")
		List<WebElement> blogCard;
		
		public void HomeAssertionCheck() {
		
			try {
				if(logo.isDisplayed()) {
					Assert.assertTrue(logo.isDisplayed());
					System.out.println("Logo is Displayed");
				}
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			
			//SearchBox
			try {
				if(SearchBox.isDisplayed()) {
					Assert.assertTrue(SearchBox.isDisplayed());
					System.out.println("SearchBox is Displayed");
				}
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			
			//compareBtn
			try {
				if(compareBtn.isDisplayed()) {
					Assert.assertTrue(compareBtn.isDisplayed());
					System.out.println("compareBtn is Displayed");
				}
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			//wishListBtn
			try {
				if(wishListBtn.isDisplayed()) {
					Assert.assertTrue(wishListBtn.isDisplayed());
					System.out.println("wishListBtn is Displayed");
				}
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			
			//cartBtn
			try {
				if(cartBtn.isDisplayed()) {
					Assert.assertTrue(cartBtn.isDisplayed());
					System.out.println("cartBtn is Displayed");
				}
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			
			//navItem
			try {
				if(navItem.size() != 0) {
					
					int total= navItem.size();
					System.out.println("Nav  is Displayed");
					System.out.println("Total Nav :"+total);
					
				}
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
				
			
			
		}
			
}
