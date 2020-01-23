package com.common;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown {
	
	@Test
	
	public void drop() {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		System.out.println((driver.getTitle()));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Select s = new Select(driver.findElement(By.xpath("//select[@class='nav-search-dropdown searchSelect']")));
		s.selectByVisibleText("Books");
		List<WebElement> l = s.getOptions();
		System.out.println(l.size());
		
		
		
		
	}

}
