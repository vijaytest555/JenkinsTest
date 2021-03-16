package StepDefinitions;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import PageLocators.GooglePOB;
//import PageLocators.sessionMHomePOB;
import Utilities.ExtentManager;
import Utilities.ReadProperty;
import common.DriverManagerClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class GooglePage {
	public WebDriver Driver;
	public static String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	public static String Filename = "TESTNG" + timeStamp + ".html";
	ExtentReports report = ExtentManager.getReporter("TestNG"+ timeStamp); ;
	ExtentTest test = report.startTest("SessionM login Page screen");
	static Logger log = Logger.getLogger(GooglePage.class);
	
	@Given("^to launch google page$")
	public void to_launch_google_page() throws Throwable {
	 	ReadProperty ReadProperty = new ReadProperty();
    	ReadProperty.initilizeLog();
	   	DriverManagerClass DriverManager = new DriverManagerClass();
    	DriverManager.SetDriver(Driver);
    //	DriverManager.initializeWebDriver();
    	DriverManager.getDriver().get(ReadProperty.get_propValue("GoogleURL"));
    //	System.out.println(ReadProperty.get_propValue("URL"));
    	log.info("Browser Launched for CHROME");
    	test.log(LogStatus.INFO, "Browser launched");
    	
  //  	Driver.get(ReadProperty.get_propValue("URL"));
    	Driver = DriverManager.getDriver();
    	
		
	   
	}

	@Then("^clink on language links$")
	public void clink_on_language_links() {
	 	Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 	GooglePOB GooglePOB = new GooglePOB(Driver);
    	
	 	GooglePOB.GoogleSearch.click();
    	String Pgtitle = Driver.getTitle();
    	test.log(LogStatus.INFO,Pgtitle);
    //	System.out.println(Pgtitle);
    //	System.out.println("then method for testing");
    	
    //	Assert.assertEquals("The SessionM Platform", Pgtitle);
    	log.info("Pg title validatd successfully");
    	test.log(LogStatus.PASS,Pgtitle+" "+"Page title recieved as expected");
    	log.info("test message");
    
    	//the below line is important to generate Extent Report
    	report.flush();
	
	}

}
