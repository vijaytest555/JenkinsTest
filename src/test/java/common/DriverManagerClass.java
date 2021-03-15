package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManagerClass {

public WebDriver Driver;
	
	public void SetDriver(WebDriver Driver)
	{
		
		this.Driver = Driver;
		WebDriverManager.chromedriver().setup();
		ChromeOptions options;
		options = getChromeOptions();
		this.Driver = new ChromeDriver(options);
	//	return Driver;
	}
	
	public WebDriver getDriver()
	{

	return this.Driver;		
	}
	
	
	public  ChromeOptions getChromeOptions() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--ignore-certificate-errors");
		options.addArguments("--disable-popup-blocking");

		return options;

	}
	
	public void initializeWebDriver()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options;
		options = getChromeOptions();
		Driver = new ChromeDriver(options);
	}


	
}
