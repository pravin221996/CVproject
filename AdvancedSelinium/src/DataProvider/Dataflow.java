package DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataflow {
	WebDriver driver;

	@Test(dataProvider = "CheckEmaildata")
	public void test(String username, String pass) throws Exception {

		System.setProperty("webdriver.chrome.driver", "ChromeDriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/selenium%20Start/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(pass);

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
		System.out.println(driver.getTitle());
	}

	@DataProvider(name = "CheckEmaildata")
	public Object[][] passdata() {

		Object[][] data = new Object[4][2];
		data[0][0] = "pravin@gmail.com";
		data[0][1] = "1221453";

		data[1][0] = "kunal@gmail.com";
		data[1][1] = "122143423";

		data[2][0] = "maddy@gmail.com";
		data[2][1] = "1221343";

		data[3][0] = "kiran@gmail.com";
		data[3][1] = "123456";

		return data;

	}

}
