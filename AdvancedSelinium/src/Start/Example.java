package Start;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import bsh.ParseException;

public class Example {
	 public static void main(String[] args) throws ParseException {
	    	WebDriver wd;
	    	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	    	wd = new ChromeDriver();
	    	wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    	wd.get("file:///C:/Users/pravi/OneDrive/Desktop/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/Offline%20Website/pages/examples/dashboard.html");
	    	//To locate table.
			wd.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a")).click();

	    	WebElement mytable = wd.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody"));
	    	//To locate rows of table. 
	    	List < WebElement > rows_table = mytable.findElements(By.tagName("tr"));
	    	//To calculate no of rows In table.
	    	int rows_count = rows_table.size();
	    	//Loop will execute till the last row of table.
	    	for (int row = 0; row < rows_count; row++) {
	    	    //To locate columns(cells) of that specific row.
	    	    List < WebElement > Columns_row = rows_table.get(row).findElements(By.tagName("td"));
	    	    //To calculate no of columns (cells). In that specific row.
	    	    int columns_count = Columns_row.size();
	    	    System.out.println("Number of cells In Row " + row + " are " + columns_count);
	    	    //Loop will execute till the last cell of that specific row.
	    	    for (int column = 0; column < columns_count; column++) {
	    	        // To retrieve text from that specific cell.
	    	        String celtext = Columns_row.get(column).getText();
	    	        System.out.println("Cell Value of row number " + row + " and column number " + column + " Is " + celtext);
	    	    }
	    	    System.out.println("-------------------------------------------------- ");
	    	}
	   	}

}
