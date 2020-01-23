package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Purchasepage {
	
	public WebDriver driver;
	
	public Purchasepage (WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	public WebElement p;

	public WebElement getP() {
		return p;
	}

	
	
	
}
