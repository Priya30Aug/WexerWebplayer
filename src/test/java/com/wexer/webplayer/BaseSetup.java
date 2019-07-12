package com.wexer.webplayer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseSetup 
{
 public WebDriver driver;
 public String testurl= "https://wexer-test.web.app";

 @Parameters ({"browser"})
 @BeforeSuite
 public void initiatebrowser(String browser)
 {
	    try

        { 

               if(browser.equalsIgnoreCase("Firefox"))

               { 
           
              
            	   System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
                    driver= new FirefoxDriver();
               }

               if(browser.equalsIgnoreCase("Chrome"))

               {

                     //Location of the chromedriver.exe file stored in your machine

            		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

                     driver = new ChromeDriver();

               }
        }
catch(Exception e)
{
	System.out.println("not a valid browser"+e.getMessage());
}
	    driver.manage().window().maximize();
	    driver.get(testurl);
        
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	}
 
 

@Test()
public void loginwithinvaliddata()
{
	LoginTestcases login= new LoginTestcases(driver);
	login.loginWithInvalidDetails();
	
}

@Test()
public void loginwithvaliddata() throws InterruptedException
{
	LoginTestcases login= new LoginTestcases(driver);
	login.LoginWithValidDetails();
	
}

}
            
 

