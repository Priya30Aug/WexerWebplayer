package com.pom.files;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.wexer.webplayer.BaseSetup;

public class LoginPOM extends BaseSetup {
	public LoginPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/header/div/div[3]/div/div[1]/button[1]/span/span")
	public WebElement Home_Loginbtn;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/main/div/div/form/div[4]/div[1]/div/input")
	public WebElement Login_email;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/main/div/div/form/div[4]/div[2]/div/input")
	public WebElement Login_password;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/main/div/div/form/div[4]/div[5]/button")
	public WebElement Login_loginbtn;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/main/div/div/form/div[4]/div[3]/p/a/span")
	public WebElement Login_forgetPassword;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/main/div/div/form/div[4]/div[6]/p/a/span")
	public WebElement Login_signup;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/main/div/div/form/div[1]/p/span")
	public WebElement Login_title;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/main/div/div/form/div[3]/span/span")
	public WebElement Login_error;
/*
	public void loginWithInvalid() {
		Home_Loginbtn.click();

		if (Login_title.isDisplayed()) {
			Reporter.log("User lands to screen with title :" + Login_title.getText());

			Login_email.click();
			Login_email.clear();
			Login_email.sendKeys("abc@gmail.com");

			Login_password.click();
			Login_password.clear();
			Login_password.sendKeys("abcder");

			Login_loginbtn.click();

			Reporter.log("On entering invalid details , user will get message :" + Login_error.getText());
		}

	}

	public void LoginWithValidDetails() {
		Login_email.click();
		Login_email.clear();
		Login_email.sendKeys("priyaglitter.always.com");

		Login_password.click();
		Login_password.clear();
	    Login_password.sendKeys("saak@123");

		Login_loginbtn.click();

	}
*/
}
