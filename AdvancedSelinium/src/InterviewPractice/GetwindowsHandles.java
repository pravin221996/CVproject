package InterviewPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class GetwindowsHandles {
	WebDriver driver;
	@Test
	
	public void seleniumWindowHandle() throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[2]/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//div[2]/ul/li[4]/ul/li[2]/a")).click();
		//driver.findElement(By.xpath("//div[@id='ad_position_box']")).click();

		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("window.scrollBy(0,1000)", "");
//        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/a/button")).click();
        //main Window
        String MainWindow = driver.getWindowHandle();
        
        //going to the window"Selenium"
        Set<String> win =  driver.getWindowHandles();
        for(String all : win) {
        if(!win.equals(MainWindow)) {
        	driver.switchTo().window(all);
        	System.out.println(driver.getCurrentUrl());	
        }
        //back to "frames&windows"
        driver.switchTo().window(MainWindow);
    	System.out.println(driver.getCurrentUrl());
        
       }
        driver.close();


        
	}        
}
