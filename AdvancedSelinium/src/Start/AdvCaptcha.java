package Start;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvCaptcha {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver web = new ChromeDriver();
	
		web.manage().window().maximize();
		web.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		web.get("https://www.irctc.co.in/nget/train-search");
		web.findElement(By.xpath("//button[text()='ok']")).click();
		web.findElement(By.xpath("//a[normalize-space()='LOGIN']")).click();
		web.findElement(By.xpath("/html/body/app-root/app-home/div[3]/app-login/p-dialog[1]/div/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/form/div[4]/div/app-captcha/div/div/div/span[1]/img"));
		
		
		
	

}
}