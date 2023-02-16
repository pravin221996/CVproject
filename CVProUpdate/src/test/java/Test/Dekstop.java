package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Listners.MyList;
import Pages.DekstopPage;
import TestBase.BaseClass;

@Listeners(MyList.class)
public class Dekstop  extends BaseClass{

	public WebDriver driver;
	public DekstopPage dp;

	@Test
	@BeforeTest
	public void open_Browser() throws Exception {
		// System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		// driver = new FirefoxDriver();
//		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		driver = new ChromeDriver();
		driver=intalization();
		driver.get("https://ingecnotechnologies.com/other/Wcart/catalog/productCategories/site/view?id=1");
		driver.manage().window().maximize();
		reportInit();
	}

	
//	@Test
//	@BeforeTest
//	public void open_Browser() throws Exception {
//		intalization();
//	}
//

	@Test
	public void check_DekstopOption() {
		dp = new DekstopPage(driver);
		dp.check_DekstopOption();

	}

	@Test
	public void check_LoginWithValidCredentials() {

		dp = new DekstopPage(driver);
		dp.LoginWithValidCredentials();

	}

	@Test
	public void check_LoginWithInValidCredentials() {

		dp = new DekstopPage(driver);
		dp.LoginWithInValidCredentials();

	}

	@Test
	public void check_LoginWithBlankCredentials() {

		dp = new DekstopPage(driver);
		dp.LoginWithBlankCredentials();

	}

	@Test
	public void check_RegisterFuctionality() {
		
//		driver.findElement(By.xpath("//div[2]/ul/li[1]/a/span")).click();
//		driver.findElement(By.xpath("//div[2]/ul/li[1]/ul/li[1]/a")).click();
//		driver.findElement(By.xpath("//*[@id=\"customer-username\"]")).sendKeys("pravin");
//		WebElement drop = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/div[2]/form/div[1]/div/div[1]/div[2]/div/div/a/span[1]"));
//		drop.click();
//		driver.findElement(By.xpath("//*[@id=\"s2id_autogen1_search\"]")).sendKeys("Asia/kolkata");
////		Select se = new Select(drop);
////		se.selectByVisibleText("Asia/kolkata");
////		se.selectByIndex(1);
////		se.selectByValue("Asia/kolkata");
//		
//		driver.findElement(By.xpath("//*[@id=\"customer-password\"]")).sendKeys("Pro@13248167");
//		driver.findElement(By.xpath("//*[@id=\"customer-confirmpassword\"]")).sendKeys("Pro@13248167");
//		
//		driver.findElement(By.xpath("//*[@id=\"customerprofileeditview\"]/div[1]/ul/li[2]/a")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"person-firstname\"]")).sendKeys("Pravin");
//		driver.findElement(By.xpath("//*[@id=\"person-lastname\"]")).sendKeys("Pingle");
//		driver.findElement(By.xpath("//*[@id=\"person-email\"]")).sendKeys("pravinpingle4@gmail.com");
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"customerprofileeditview\"]/div[1]/ul/li[3]/a")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"address-address1\"]")).sendKeys("karve Nagar,pune");
//		driver.findElement(By.xpath("//*[@id=\"address-city\"]")).sendKeys("Pune");
//        driver.findElement(By.xpath("//span[@id='select2-chosen-2']")).sendKeys("India");
//		
//		
//		driver.findElement(By.xpath("//input[@id='address-postal_code']")).sendKeys("445-203");
//		driver.findElement(By.xpath("//button[@id='save']")).click();
//		
		dp = new DekstopPage(driver);
		dp.registerFunctionality();

		
	}
	
	@Test
	public void check_AddToCartfuctionality() throws Exception {

		// login
		dp = new DekstopPage(driver);
		dp.LoginWithValidCredentials();
		// to ScrollDown
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");

		Thread.sleep(5000);

		dp.AddToCartfuctionality();

	}

	@Test
	public void check_CheckOutFunctinality() throws Exception {

		dp = new DekstopPage(driver);
		dp.LoginWithValidCredentials();
		// to ScrollDown
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");

		Thread.sleep(5000);

		// AddToCart
		dp.checkOut();
		JavascriptExecutor l = (JavascriptExecutor) driver;
		l.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(5000);

		// Checking checkbox & click on Continue button
		dp.ContinueBtn();

		JavascriptExecutor m = (JavascriptExecutor) driver;
		m.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(5000);

		dp.ConifirmOrder();

	}

	@Test
	public void check_Discription() throws Exception {
		dp = new DekstopPage(driver);
		dp.LoginWithValidCredentials();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(5000);
		
        dp.ClickOnProduct();
        
		JavascriptExecutor java = (JavascriptExecutor) driver;
		java.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(5000);

		dp.checkProductName();
	}
   @Test
   public void check_review() throws Exception {
	   dp = new DekstopPage(driver);
	   dp.LoginWithValidCredentials();
	   
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("window.scrollBy(0,500)", "");
       Thread.sleep(5000);

       dp.ClickOnProduct();
       
       JavascriptExecutor java = (JavascriptExecutor) driver;
       java.executeScript("window.scrollBy(0,500)", "");
       Thread.sleep(5000);
       dp.reviewButton();
       
         }

}
