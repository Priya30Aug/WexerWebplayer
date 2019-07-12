package SeleniumLearning.SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Firefox_webplayer{
	
	private WebDriver driver;
	@BeforeClass
	public void SetupFirefox()
	{
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
	//	System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
	//	DesiredCapabilities capabilities = DesiredCapabilities.firefox();
	//	capabilities.setCapability("marionette",true);
	//	driver= new FirefoxDriver(capabilities);
		driver= new FirefoxDriver();
		driver.get("https://wexer-test.web.app");
		System.out.println(Thread.currentThread().getId());
	}
 @Test()
 
 public void Login()
 {
	 driver.findElement(By.xpath("/html/body/div/div/div/div/div/header/div/div[3]/div/div[1]/button[1]/span/span")).click();
  System.out.println(Thread.currentThread().getId());
 }
	
	@AfterClass
	public void CloseFirefox()
	{
		
	}

}
