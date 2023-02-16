package TestBase;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import freemarker.log.Logger;

public class BaseClass {
	public static WebDriver driver;
	public static FileInputStream fis;
	public static ExtentReports report;
	public static ExtentSparkReporter spark;
	public static ExtentTest test;

	public static Logger log = Logger.getLogger("Base");

	public BaseClass() {
		// driver = new ChromeDriver();
	}

	public String readProperty(String key) throws Exception {

		Properties prop = new Properties();
		String path = "C:\\EclipseIDE\\AutomationTesting\\WhatACart\\src\\main\\java\\Utils\\WACart.properties";
		fis = new FileInputStream(path);
		prop.load(fis);
		return prop.getProperty(key);
	}

	public WebDriver startApplication() throws Exception {
		driver.get(readProperty("url"));
		log.info(" ******Maxmizing window******");

		driver.manage().window().maximize();
		log.info(" ******Applying Waits******");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		log.info("..User log in Wcart Apllication..");
		return driver;
	}

	public WebDriver intalization() throws Exception {
		if (readProperty("browser1").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
			startApplication();
			return driver;
		} else {
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			driver = new FirefoxDriver();
			startApplication();
			return driver;

		}
	}

	public void reportInit() {

		report = new ExtentReports();
		String path = System.getProperty("user.dir") + "\\target\\Extentreport.html";
		spark = new ExtentSparkReporter(path);
		report.attachReporter(spark);

	}

}
