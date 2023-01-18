package Start;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//printing table by using tagname
public class PrintTableByTagname {
	
WebDriver driver = null;
	
	@Test 
	public void test() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/pravi/OneDrive/Desktop/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/Offline%20Website/pages/examples/dashboard.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a")).click();
		
		//to locate table
		WebElement web=driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody"));
		//to locate the rows of table
		List<WebElement> rows =driver.findElements(By.tagName("tr"));
		
//		System.out.println(rows);
		//to calculate number of rows present
		int rowscount = rows.size();
		
		//loop will execute the till the last row of the table
		for(int row=0;row<rowscount;row++) {
			
			//to locate columns(cell) of that specific row
			List<WebElement> columncount=rows.get(row).findElements(By.tagName("td"));
			//to calculate no of columns(cell) of that specific row
			
//			System.out.println(columncount);
//
            int columnnumber=columncount.size();
//			
//			System.out.println(+row+" are"+columnnumber);
//			
//			//loop will execute the till the last cell of that specific row

			for(int column=0;column<columnnumber;column++) {
				
				//To retrieve text from that specific cell
				String colmText=columncount.get(column).getText();
				System.out.println(colmText);
				//System.out.println("cell value of row number "+row+" and colum number"+column+"is"+colmText);
			}
			
		}
		
		
}}
