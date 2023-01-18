package Start;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleLinkCaptureLinkList {
	WebDriver dri=null;
	
	@Test
	public void TC1() {
		
	      System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	      dri= new ChromeDriver();
	      dri.get("file:///C:/Users/pravi/Downloads/Selenium%20Softwares%20allll/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
	      
	      dri.manage().window().maximize();
	      dri.findElement(By.id("email")).sendKeys("kiran@gmail.com");
	      dri.findElement(By.id("password")).sendKeys("123456");
          dri.findElement((By.xpath("//button"))).click();
	      
	      List<WebElement> links=dri.findElements(By.tagName("a"));
	     
//	      for(int i=0;i<links.size();i++)
//	      {
//	    	 System.out.println(links.get(i).getText()); 
//	    	 System.out.println(links.get(i).getAttribute("href")); 
//	    	  
//	      }
	     
	      for(WebElement link:links)
	      {
	    	  System.out.println(link.getText()); 
		      System.out.println(link.getAttribute("href")); 		    	  

	    	  
	      }
	      
	}

}
