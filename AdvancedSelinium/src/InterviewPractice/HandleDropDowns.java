package InterviewPractice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDowns {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.get("file:///C:/selenium%20Start/Selenium%20Softwares/Offline%20Website/Offline%20Website/pages/examples/add_user.html");
		    WebElement web = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select"));
		    web.click();
		    Select se =new Select(web);
		 List<WebElement> li =   se.getOptions();
		 
		 ArrayList<String> ar = new ArrayList<>();
		    for(WebElement we: li) {
		    	String name = we.getText();
		    	ar.add(name);
		    	
		    }
		    ar.remove(0);
		    System.out.println(ar);
		  //se.selectByVisibleText("Maharashtra");
		 // se.selectByIndex(2);
		   //se.selectByValue("Delhi");
		
	}

}
