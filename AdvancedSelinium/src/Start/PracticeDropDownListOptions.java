package Start;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class PracticeDropDownListOptions {
	WebDriver web= null;
	//opening browser
	@Test
	public void browserOpen() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		web=new ChromeDriver();
		web.get("file:///C:/Users/pravi/OneDrive/Desktop/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/Offline%20Website/pages/examples/logout.html");
		web.manage().window().maximize();
		web.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/input")).sendKeys("kiran@gmail.com");
		web.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/input")).sendKeys("123456");
		web.findElement(By.xpath("//form/div[3]/div/button")).click();
		web.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a/span")).click();
		web.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")).click();
		
		
		WebElement we = web.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select"));
		we.click();
		
		Select s1 = new Select(we);
		List<WebElement> op =s1.getOptions();

		s1.selectByIndex(0);
//		s1.getAllSelectedOptions();
//		s1.deselectByIndex(1);
//		s1.isMultiple();
		ArrayList<String> getOptionList = new ArrayList();

		for(WebElement ee: op) {
		  
			String text=ee.getText();
			getOptionList.add(text);
		}
		getOptionList.remove(0);
		
     	for(int i=0;i<getOptionList.size();i++) {
		
		System.out.println(getOptionList.get(i));
		
	}
	}
}
