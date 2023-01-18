package Start;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvSel {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "ChromeDriver.exe");
		WebDriver web = new ChromeDriver();
		web.navigate().to("file:///C:/Users/pravi/Downloads/Selenium%20Softwares%20allll/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
		web.manage().window().maximize();
		web.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		web.findElement(By.id("password")).sendKeys("123456");
		web.findElement((By.xpath("//button"))).click();
		
//		web.findElement(By.partialLinkText("info")).click();
//		web.findElement(By.linkText(" More info")).click();
		
    

		


	}

}
