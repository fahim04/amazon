package com.stepdef;

import org.openqa.selenium.By;

import com.common.Base;
import com.util.Screenshot;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdef extends Base  {
	
	
	@Given("^i am on amazon homepage$")
	public void i_am_on_amazon_homepage() throws Throwable {
	   driver= getdriver();
	   Screenshot.scn(driver, "Homepage");

	}

	@When("^i search iphone clear case and click search$")
	public void i_search_iphone_clear_case_and_click_search() throws Throwable {
		
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone case");
	Screenshot.scn(driver, "case");
	
	

	}

	@Then("^i see my search item$")
	public void i_see_my_search_item() throws Throwable {
	    
	driver.findElement(By.xpath("//input[@value='Go']")).click();
	Screenshot.scn(driver, "item");
	}

}
