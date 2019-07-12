package com.wexer.webplayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.pom.files.LoginPOM;

public class LoginTestcases extends LoginPOM {
	LoginPOM login = new LoginPOM(driver);

	public LoginTestcases(WebDriver driver) {
		super(driver);

	}
	public void loginWithInvalidDetails() {
		login.Home_Loginbtn.click();

		if (login.Login_title.isDisplayed()) {
			Reporter.log("User lands to screen with title :" + login.Login_title.getText());

			login.Login_email.click();
			login.Login_email.clear();
			login.Login_email.sendKeys("abc@gmail.com");

			login.Login_password.click();
			login.Login_password.clear();
			login.Login_password.sendKeys("abcde");

			login.Login_loginbtn.click();

			Reporter.log("On entering invalid details , user will get message :" + login.Login_error.getText());
		}

	}
	public void LoginWithValidDetails() throws InterruptedException {
		login.Login_email.click();
		login.Login_email.clear();
		login.Login_email.sendKeys("newuser21@gmail.com");

		login.Login_password.click();
		login.Login_password.clear();
		login.Login_password.sendKeys("saak@123");

		login.Login_loginbtn.click();
		Thread.sleep(5000);
		if (driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/header/div/div[3]/a[1]")).isDisplayed()) {
			
			Reporter.log("User lands to Ondemand collection screen");
		}

	}
}
