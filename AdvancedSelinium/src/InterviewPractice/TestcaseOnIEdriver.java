package InterviewPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestcaseOnIEdriver {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.get("https://ingecnotechnologies.com/other/Wcart/");
		
		
	}

}
