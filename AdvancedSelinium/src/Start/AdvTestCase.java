package Start;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AdvTestCase {

	WebDriver driver;
	
	@Test
	@BeforeMethod
	public void test01() {
		System.setProperty("webdrivr.gecko.driver", "geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("file:///C:/selenium%20Start/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
		
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/input")).sendKeys("kiran@gmail.com");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/input")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
		
	}
	
	@Test
	public void test02() {
		
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]")).click();
		
		ArrayList<String> str = new ArrayList<>();
		
	    List<WebElement> list =	driver.findElements(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[2]/td[2]"));
		
	    for(WebElement li :list) {
	    	
	    	String name = li.getText();
	    	System.out.println(name);
	    	str.add(name);
	    	boolean text =str.equals(name);
	    	
	    	
	    	Assert.assertTrue(text);
	    
	    	
	    }
		
		
	}
	@Test
	@AfterMethod
	public void test03() {
		
		driver.close();
		
	}
			
	
}
