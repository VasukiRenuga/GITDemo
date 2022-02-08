package com.training.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.training.basepage.BasePage;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@id='username']")
	WebElement Uname;
	@FindBy(xpath = "//input[@id='password']")
	WebElement pwd;
	@FindBy(xpath = "//div[@id='error']")
	WebElement errormessage;
	@FindBy(xpath = "//*[@id='Login']")
	WebElement login;
	@FindBy(xpath = "//*[@id='rememberUn']")
	WebElement remember;
	@FindBy(xpath="//div[@aria-label='vasuki@123.com']//span")
	WebElement userfield;
	@FindBy(xpath = "//*[@id='forgot_password_link']")
	WebElement Fpwd;
	@FindBy(xpath = ".//*[@id='un']")
	WebElement Fname;
	@FindBy(xpath ="//input[@name='continue']")
	WebElement Continue;
	@FindBy(xpath ="//body//div//p[1]")
	WebElement forgetpwmessage;
	@FindBy(xpath ="//div[@title='User menu for Vasuki Krishnasamy']//div[1]//div[1]")
	WebElement usermenu;


	public void enterintoUsername(String strusername) {
		Uname.sendKeys(strusername);
	}

	public void enterIntoPassword(String strpassword) {
		pwd.sendKeys(strpassword);
	}

	public void clickLoginButton() {
		login.click();
	}

	public WebElement enterintoUsername() {
		return Uname;
	}

	public WebElement enterIntoPassword() {
		return pwd;
	}

	public WebElement checkRememberme() {
		return remember;
	}
    
	public WebElement Userfield() {
		return userfield;
	}
	
	public WebElement LoginButton() {
		return login;
	}
	public WebElement forgotPassword() {
		return Fpwd;
	}
	public WebElement FUserNamefield() {
		return Fname;
	}
	public WebElement Continue() {
		return Continue;
	}
	public WebElement ForgetPwMessage() {
		return forgetpwmessage;
	}
	public WebElement Selectusermenu() {
		return usermenu;
	}

	
	public void loginapplication(String strusername, String strpassword) {
		Uname.sendKeys(strusername);
		pwd.sendKeys(strpassword);
		login.click();
	}
		
}
	

	
	