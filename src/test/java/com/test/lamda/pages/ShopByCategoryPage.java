package com.test.lamda.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.lamda.drivers.PageDriver;

public class ShopByCategoryPage {

	public ShopByCategoryPage() {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
	}
	
	@FindBy(xpath="//div[@id='entry_217832']")
	WebElement shopByCatBtn;
	
	@FindBy(xpath="//div[@id='widget-navbar-217841']//ul[@class='navbar-nav vertical']/li//div[@class='info']/span")
	List<WebElement> categories;
	
	@FindBy(xpath="//div[@id='entry_212408']/div/div/div//h4/a")
	List<WebElement> product;
	
	@FindBy(xpath="//button[@title='Add to Wish List']")
	List<WebElement> addToWishList;
	
	@FindBy(xpath="//div[@id='entry_212408']/div/div/div/div[@class='product-thumb-top']/div")
	List<WebElement> productsCart;
	
	public void PurchesProduct() {
		
		shopByCatBtn.click();
		
		int total= categories.size();
		System.out.println("Total Category :"+total);
		
		//select camera
		for(int i=0;i<total;i++) {
			String item= categories.get(i).getText();
			System.out.println(item);
			
			if(item.equals("MP3 Players")) {
				categories.get(i).click();
			}
		}		
	}
	
	
	
	public void FindAllProduct() {
		int length= product.size();
		System.out.println("Total Product "+length);
		
		for (int i = 0; i < length; i++) {
			String name = product.get(i).getText();
			System.out.println(name);
		}
		
		
	}
	
	public void SelectProduct() {
		int length= product.size();
		System.out.println("Total Product "+length);
		WebElement SelCart= PageDriver.getCurrentDriver().findElement(By.xpath("//*[@id=\"entry_212408\"]/div/div[2]/div/div[1]"));
		for (int i = 1; i < length; i++) {
			String name = product.get(i).getText();
//			System.out.println(name);
			
			if(name.equals("iPhone")) {
				if(SelCart.isDisplayed()) {
					Actions act= new Actions(PageDriver.getCurrentDriver());
					act.moveToElement(PageDriver.getCurrentDriver().findElement(By.xpath("//*[@id='entry_212408']/div/div["+i+"]/div/div[1]"))).build().perform();
					
				}
			
				addToWishList.get(i).click();
				
			}
		}
		
		
	}
	
	
	
}
