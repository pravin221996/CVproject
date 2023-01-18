package Start;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClickOnSameMultipleLinks {
	
	WebDriver driver=null;
	
	@Test
	public void ClickingLink() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("file:///C:/Users/pravi/OneDrive/Desktop/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/Offline%20Website/pages/examples/dashboard.html");
		
		List<WebElement> link = driver.findElements(By.partialLinkText("More"));
		
		for( WebElement ele :link) {
			
			ele.click();
		}
	
	
	}
	

}
