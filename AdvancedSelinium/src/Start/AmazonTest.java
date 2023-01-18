package Start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonTest {
	
	WebDriver driver=null;

	@Test
	public void test1(){
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		WebElement web=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		web.sendKeys("mobile");
		web.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();		
		
		
	}
	
	

}
