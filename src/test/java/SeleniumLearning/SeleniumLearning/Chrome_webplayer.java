package SeleniumLearning.SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Chrome_webplayer {
	
	protected WebDriver driver;
	
	@BeforeTest
	public void Intialise()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		 
		driver= new ChromeDriver();
		driver.get("https://wexer-test.web.app");
		System.out.println(Thread.currentThread().getId());
		
	}
 @Test(threadPoolSize = 3, invocationCount = 3, timeOut = 3000 , dependsOnMethods= {"test", "test1"})
 public void Login()
 {
	 driver.findElement(By.xpath("/html/body/div/div/div/div/div/header/div/div[3]/div/div[1]/button[1]/span/span")).click();
	 
		System.out.println(Thread.currentThread().getId());}
 
 @Test()
 public void test()
 {
 System.out.println("Session on chrome is started");
}
 @Test()
 public void test1()
 {
 System.out.println("yes it is started");
}

}