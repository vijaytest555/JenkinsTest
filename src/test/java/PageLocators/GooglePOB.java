package PageLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePOB {
	public WebDriver Driver;
	
	@FindBy(xpath="//div[@class='FPdoLc tfB0Bf']//input[@value='Google Search']")
	public WebElement GoogleSearch;

	@FindBy(xpath="//a[contains(text(),'Forgot')]")
	public WebElement ForgotPassword;
	
	public GooglePOB(WebDriver Driver) {
		this.Driver = Driver;

		//DriverManagerClass DriverManagerClass = new DriverManagerClass(); 
			PageFactory.initElements(Driver, this);
			
		}

}
