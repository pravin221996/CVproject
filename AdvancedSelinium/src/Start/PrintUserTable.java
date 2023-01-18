package Start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


//Printing table by using xpath
public class PrintUserTable {
	
	WebDriver driver = null;
	
	@Test 
	public void test() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/pravi/OneDrive/Desktop/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/Offline%20Website/pages/examples/dashboard.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a")).click();
		for(int i=1;i<8;i++) {
			for(int j=2;j<5;j++) {
			String text=driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["+j+"]/td["+i+"]")).getText();
			System.out.print(text+" ");
		}
			System.out.println();
		}
	}

}
