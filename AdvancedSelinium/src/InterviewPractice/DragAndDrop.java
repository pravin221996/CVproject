package InterviewPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("file:///C:/selenium%20Start/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
	    
	   WebElement from = driver.findElement(By.xpath("//img[@src='pages/images/jbk.png']"));
	   WebElement to = driver.findElement(By.xpath("/html/body/div/div[1]"));
	   
	   Actions act = new Actions(driver);  
	   
	 //Performing the drag and drop action  
	 act.dragAndDrop(from,to).build().perform();   
	   
	}

}
