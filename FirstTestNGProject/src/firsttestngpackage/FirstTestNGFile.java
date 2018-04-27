package firsttestngpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//Updates from Eclipse
//this is my 2nd commit - Nuwan
//3rd Commit


//Updates from Git Hub
//1st update from Github
public class FirstTestNGFile {
	WebDriver driver;
	public String url="http://demo.guru99.com/test/newtours/";
	public String ChromeDriverPath="C:\\Nuwan\\Software\\Selinium\\Chromedriver\\v2.37\\chromedriver.exe";
	
	@Test
	public void verifyTitle() {
	  	 
	  String expectedTitle="Welcome: Mercury Tours";
	  String actualTitle=driver.getTitle();	  
	  Assert.assertEquals(actualTitle, expectedTitle);	  
	  	  
  }
	
	@BeforeTest
	public void launchBrowser(){
	 System.setProperty("webdriver.chrome.driver", ChromeDriverPath);
	 driver=new ChromeDriver();		  
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		  
	 driver.get(url);		
	}
	
	@AfterTest
	public void closeBrowser(){
		driver.close();		  
	}
}
