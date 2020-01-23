package com.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	
	public static void scn(WebDriver driver,String s) throws IOException {
		
		TakesScreenshot shot = (TakesScreenshot) driver;
		File fl = shot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fl, new File(s+".png"));
		
	}

}
