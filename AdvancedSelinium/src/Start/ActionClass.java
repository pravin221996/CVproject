package Start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ActionClass {

      WebDriver driver=null;
      
      @Test
      @BeforeClass
      public void test1() {
    	  
    	  System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
    	  driver=new ChromeDriver();
    	  driver.get("file:///C:/Users/pravi/OneDrive/Desktop/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/Offline%20Website/pages/examples/logout.html");
    	  
    	  driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
    	  driver.findElement(By.id("email")).sendKeys("123456");
    	  driver.findElement(By.xpath("//button")).click();
    	  
    	 
      }
     
}
