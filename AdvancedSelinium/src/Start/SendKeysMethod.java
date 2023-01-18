package Start;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SendKeysMethod {
	
	WebDriver web=null;
	
	@Test
	public void test() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		web= new ChromeDriver();
		JavascriptExecutor webdriver=null;
		
		web.get("file:///C:/Users/pravi/OneDrive/Desktop/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
		JavascriptExecutor JS = (JavascriptExecutor)webdriver;
		// Enter username
		JS.executeScript("document.getElementById('email').value='kiran@gmail.com'");
		// Enter password
		JS.executeScript("document.getElementById('Password').value='123456'");
		
	}

}
