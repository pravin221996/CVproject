package Start;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeTestCases {
	
	WebDriver web;

	@BeforeMethod
	void test01() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		web=new ChromeDriver();
		web.navigate().to("file:///C:/Users/pravi/OneDrive/Desktop/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
	   WebElement ele= web.findElement(By.xpath("//*[@id=\"email\"]"));
	   ele.sendKeys("kiran@gmail.com");
	   
	   web.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
	   web.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();  
	}
	@Test
	void test2() {
		String exp =web.findElement(By.xpath("/html/body/div/div[1]/section[1]/h1")).getText();
		String actual="Dashboard";
		
		assertEquals(exp, actual);
	}
	@Test
	void test3() {
		
		
		String exp =web.findElement(By.xpath("")).getText();
		String actual="Dashboard";
		
		assertEquals(exp, actual);
		
		
		
	
	    
   
	
	

}}
