package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DekstopPage {

	WebDriver driver;

	@FindBy(xpath = "//a[@href='/other/Wcart/catalog/productCategories/site/view?id=1']")
	WebElement dekstop;
	// By dekstop = By.xpath("//div[1]/nav/div[2]/ul/li[1]/a");

	@FindBy(xpath = "/html/body/nav/div/div[2]/ul/li[1]/a/span")
	WebElement MyAcc;
	// By MyAcc = By.xpath("//div[@id=\"top-links\"]/ul/li[1]/a/span");

	@FindBy(xpath = "//div[2]/ul/li[1]/ul/li[2]/a")
	WebElement Login;
	// By Login = By.xpath("//a[@tabindex='-1'
	// ][@href='/other/Wcart/customer/site/login']");

	@FindBy(xpath = "//div[3]/div/div/div/div/div[2]/div/form/div[1]/input")
	WebElement UserName;
	// By UserName = By.xpath("//input[@id='loginform-username']");

	@FindBy(xpath = "//div[3]/div/div/div/div/div[2]/div/form/div[2]/input")
	WebElement Password;
	// By Password = By.xpath("//input[@id='loginform-password']");

	@FindBy(xpath = "//div[3]/div/div/div/div/div[2]/div/form/div[3]/div/label/input[2]")
	WebElement Label;
	// By Label = By.xpath("//input[@id='loginform-rememberme'][@type='checkbox']");

	@FindBy(xpath = "/html/body/div[3]/div/div/div/div/div[2]/div/form/button")
	WebElement LoginClick;
	// By LoginClick = By.xpath("//button[@id='savebutton'][@type='submit']");

	@FindBy(xpath = "//div[2]/div[2]/div/div[3]/button[1]")
	WebElement AddToCart;

	@FindBy(xpath = "//header/div/div/div[3]/div/div/a/span[1]")
	WebElement CartItem;

	@FindBy(xpath = "//div[3]/div/div/ul/li[3]/div/p/a[1]")
	WebElement ViewCart;

	@FindBy(xpath = "//div[1]/table/tbody/tr/td[2]/a")
	WebElement ProductName;
	
	@FindBy(xpath = "//header/div/div/div[3]/div/div/ul/li[3]/div/p/a[2]")
	WebElement CheckOut;
	
	@FindBy(xpath = "//div[3]/div/div/div/div/div[2]/form/div[1]/div[4]/div[2]/div/div/label/input[2]")
	WebElement CheckBoxBtnClick;
	                 //div[3]/div/div/div/div/div[2]/form/div[2]/div/button
	@FindBy(xpath = "//div[3]/div/div/div/div/div[2]/form/div[2]/div/button")
	WebElement ContinueBtn;
	
	@FindBy(xpath = "//li[@class='active']")
	WebElement ConfirmOrderText;
	
	@FindBy(xpath = "//div[2]/div/div/div/div[2]/div[3]/div/div[2]/h4/a")
	WebElement ClickOnProduct;
	
	@FindBy(xpath ="/html/body/div[3]/div/div/div/div/div[2]/ul[1]/li[1]/a" )
	WebElement checkProductName;
	
	@FindBy(xpath ="//div[3]/div/div/div/div/div[1]/ul/li[2]/a" )
	WebElement ReviewButton;
	
	@FindBy(xpath ="//div[3]/div/div/div/div/div[1]/div[3]/div[2]/div[1]/form/legend" )
	WebElement WriteInterview;
	
	@FindBy(xpath ="//div[2]/ul/li[1]/ul/li[1]/a" )
	WebElement Rgister;

	@FindBy(xpath ="/html/body/div[3]/div/div/div/div[2]/div[2]/form/div[1]/div/div[1]/div[2]/div/div/a/span[1]" )
	WebElement TimeZone;
	
	@FindBy(xpath ="//*[@id=\\\"customer-password\\\"]" )
	WebElement RegPassword;
	
	@FindBy(xpath ="//*[@id=\\\"customer-confirmpassword\\\"]" )
	WebElement ConfirmRegPassword;

	@FindBy(xpath ="//*[@id=\\\"customerprofileeditview\\\"]/div[1]/ul/li[2]/a" )
	WebElement RegContinueButton;

	@FindBy(xpath ="//*[@id=\\\"s2id_autogen1_search\\\"]" )
	WebElement TimeZoneSearchBox;
	

	@FindBy(xpath ="//*[@id=\\\"person-firstname\\\"]" )
	WebElement FirstName;
	

	@FindBy(xpath ="//*[@id=\\\"person-lastname\\\"]" )
	WebElement LastName;
	

	@FindBy(xpath ="//*[@id=\\\"person-email\\\"]" )
	WebElement PersonEmail;
	

	@FindBy(xpath ="//*[@id=\\\"customerprofileeditview\\\"]/div[1]/ul/li[3]/a" )
	WebElement CoustmorProfileReview;

	
	@FindBy(xpath ="//*[@id=\\\"address-address1\\\"]" )
	WebElement Address;

	@FindBy(xpath ="//*[@id=\\\"address-city\\\"]" )
	WebElement Address_city;

	@FindBy(xpath ="//span[@id='select2-chosen-2']" )
	WebElement  SelectCity;

	@FindBy(xpath ="//input[@id='address-postal_code']" )
	WebElement adressPostalCode;
	
	@FindBy(xpath ="//button[@id='save']" )
	WebElement SaveButton;



	
	public DekstopPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	public void check_DekstopOption() {

		String Act_name = dekstop.getText();
		String Exp_name = "Desktop";

		Assert.assertEquals(Act_name, Exp_name);
	}

	public void LoginWithValidCredentials() {

		MyAcc.click();
		Login.click();
		UserName.sendKeys("pravin");
		Password.sendKeys("Pro@13248167");
		Label.click();
		LoginClick.click();
	}

	public void LoginWithInValidCredentials() {
		MyAcc.click();
		Login.click();
		UserName.sendKeys("priyansh");
		Password.sendKeys("Pri@1234");
		Label.click();
		LoginClick.click();

	}

	public void LoginWithBlankCredentials() {

		MyAcc.click();
		Login.click();
		UserName.sendKeys("");
		Password.sendKeys("");
		Label.click();
		LoginClick.click();

	}
	
	public void AddToCartfuctionality() throws Exception {
		
		AddToCart.click();
		Thread.sleep(3000);
		// checking item added to cart or not
		CartItem.click();

		// click on View Cart
		ViewCart.click();
		Thread.sleep(5000);

		// checking added model name
		String Actual_ProductName = ProductName.getText();
		String Expected_ProductName = "Sony Vaio 30\"";

		Assert.assertEquals(Actual_ProductName, Expected_ProductName);
	}

	public void checkOut() throws Exception {
		AddToCart.click();
		Thread.sleep(3000);
		//checking item added to cart or not
		CartItem.click();
		CheckOut.click();
	}
    public void ContinueBtn() {
    	CheckBoxBtnClick.click();
    	ContinueBtn.click();	
    }
    public void ConifirmOrder() {
    	ContinueBtn.click();
        String Act_msg = ConfirmOrderText.getText();
        String Exp_Msg = "Confirm Order";
        
        Assert.assertEquals(Act_msg, Exp_Msg);
    }
	
    public void ClickOnProduct() {
    	ClickOnProduct.click();
    }
    public void checkProductName() {
    	String Act_Msg = checkProductName.getText();
		String Exp_Msg = "Sony";
		Assert.assertEquals(Act_Msg, Exp_Msg);
    }
    public void reviewButton() {
    	ReviewButton.click();
        String Act_msg = WriteInterview.getText();
   	    String Exp_msg = "Write Review";
   	  
   	    Assert.assertEquals(Act_msg, Exp_msg);

    }
    
    public void registerFunctionality() {
    	MyAcc.click();
    	Rgister.click();
    	UserName.sendKeys("pravin");
		WebElement drop = TimeZone;
		drop.click();
		TimeZoneSearchBox.sendKeys("Asia/kolkata");
//		Select se = new Select(drop);
//		se.selectByVisibleText("Asia/kolkata");
//		se.selectByIndex(1);
//		se.selectByValue("Asia/kolkata");
		RegPassword.sendKeys("Pro@13248167");
		ConfirmRegPassword.sendKeys("Pro@13248167");
		RegContinueButton.click();
		FirstName.sendKeys("Pravin");
		LastName.sendKeys("Pingle");
		PersonEmail.sendKeys("pravinpingle4@gmail.com");
		
		CoustmorProfileReview.click();
		
		Address.sendKeys("karve Nagar,pune");
		Address_city.sendKeys("Pune");
		SelectCity.sendKeys("India");
		
		adressPostalCode.sendKeys("445-203");
		SaveButton.click();
		

    }
}

