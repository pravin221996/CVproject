package Start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertPractice {
	
	WebDriver web = null;
	
	@Test
	public void alertTest() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		web = new ChromeDriver();
		web.get("file:///C:/Users/pravi/OneDrive/Desktop/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
		web.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/input")).sendKeys("kiran@gmail.com");
		web.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/input")).sendKeys("123456");
		web.findElement(By.xpath("//form/div[3]/div/button")).click();
		
		web.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a")).click();
		web.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[2]/td[8]/a/span")).click();
        
//		String nn = web.switchTo().alert().getText();
//		System.out.println(nn);
//		

		 web.switchTo().alert().accept();
       
		 //Once we any action is done on alert and we still doing some actions on alert then we will get NoAlertPresentException
		 
		 
	     web.switchTo().alert().dismiss();
		
		
		//System.out.println(web.switchTo().alert().getText());
	}

}
