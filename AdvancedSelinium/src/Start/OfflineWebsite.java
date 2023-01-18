package Start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OfflineWebsite {
	
	WebDriver web=null;
	
	@Test
	public void Test1() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		web= new ChromeDriver();
		web.navigate().to("file:///C:/Users/pravi/OneDrive/Desktop/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
		web.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		web.findElement(By.id("password")).sendKeys("123456");
		web.findElement(By.xpath("//button")).click();
		System.out.println(web.getTitle());
		web.navigate().back();
		System.out.println(web.getTitle());
		web.navigate().forward();
		System.out.println(web.getTitle());
		
		String name=web.findElement(By.tagName("b")).getText();
        System.out.println(name);
		
		
	}
	

}
