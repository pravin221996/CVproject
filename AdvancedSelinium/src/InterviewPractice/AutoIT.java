package InterviewPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIT {
	
	WebDriver driver;
	
	
	public void testAutoit() {
		
		System.setProperty("webdriver.chrome.driver", "ChromeDriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		
		driver.findElement(By.id("//a[@id='pickfiles']")).click();
		
		
	}

}
