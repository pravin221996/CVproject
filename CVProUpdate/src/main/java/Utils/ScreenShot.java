package Utils;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Pages.DekstopPage;
import TestBase.BaseClass;

public class ScreenShot  extends BaseClass{
	
	public static  String getScreenshot(String name) throws Exception {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
	    File src= ts.getScreenshotAs(OutputType.FILE);
		String path =System.getProperty ("user.dir")+"\\WhatACart\\target"+name+".png";
		File dest =new File(path);
	
		FileUtils.copyFile(src, dest);
		return path;
	}	

}
