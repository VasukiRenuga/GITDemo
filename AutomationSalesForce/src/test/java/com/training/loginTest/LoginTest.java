package com.training.loginTest;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.basepage.BaseTest;
import com.training.log.Log;
import com.training.page.HomePage;
import com.training.page.LoginPage;
import com.training.utilities.CommonUtilities;

public class LoginTest extends BaseTest {

	WebDriver driver;
	LoginPage login;
	HomePage home;
	CommonUtilities common = new CommonUtilities();

	@BeforeMethod
	public void beforeTest() throws IOException {
		driver = getDriver();
		String url = common.getApplicationProperty("url");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		login = new LoginPage(driver);
		home = new HomePage(driver);
		}

	@Test(description = "Login Error Message - 1",priority = 1)
	public void LoginErrorMessage1() throws InterruptedException, IOException {
		report.startSingleTestReport(Thread.currentThread().getStackTrace()[1].getMethodName());
         log4jXMLReport();
         Log.startTestCase("LoginErrorMessage1()");
         Log.info("LoginErrorMessage1() is the first test case");
		String Username = common.getApplicationProperty("Uname");
		login.enterintoUsername(Username);
		report.logTestInfo("UserName is entered");
		login.clickLoginButton();
		String actualErrorMessage = driver.findElement(By.xpath("//div[@id='error']")).getText();
		System.out.println(actualErrorMessage);
		String Expect = "Please enter your password.";
		validateErrormessage(actualErrorMessage, Expect);
		System.out.println("Login error message is completed");
		report.logTestInfo("Testcase 1 Login error message is completed");
     }

	@Test(description = "Login To SalesForce -2",priority = 2)
	public void LoginToSalesForce2() throws Exception {
		report.startSingleTestReport(Thread.currentThread().getStackTrace()[1].getMethodName());
		String Username = common.getApplicationProperty("Uname");
		enterText(login.enterintoUsername(), Username, "Username");
		report.logTestInfo("UserName is entered");
		String Password = common.getApplicationProperty("pwd");
		enterText(login.enterIntoPassword(), Password, "Passwordtext");
		report.logTestInfo("Password is entered");
		clickObj(login.LoginButton(), "Login");
		report.logTestInfo("Login is clicked");
		System.out.println("Login to Salesforce is completed");
		report.logTestInfo("Testcase 2 Login to Salesforce is completed");
		
		}

	@Test(description = "Check RemeberMe - 3", priority = 3)
	public void Check_RemeberMe_3() throws Exception {
		report.startSingleTestReport(Thread.currentThread().getStackTrace()[1].getMethodName());
		String Username = common.getApplicationProperty("Uname");
		enterText(login.enterintoUsername(), Username, "Username");
		report.logTestInfo("Username is entered");
		String Password = common.getApplicationProperty("pwd");
		enterText(login.enterIntoPassword(), Password, "Passwordtext");
		report.logTestInfo("Password is entered");
		selectCheckBox(login.checkRememberme(), "RememberMe");
		report.logTestInfo("RememberMe is selected");
		clickObj(login.LoginButton(), "Login");
		report.logTestInfo("Login is clicked");
		String expectedTitle = "Home Page ~ Salesforce - Developer Edition";
		String actualTitle = driver.getTitle();
		getTitle(actualTitle, actualTitle);
		clickObj(home.enterintoUsermenu(),"usermenu");
		report.logTestInfo("UserMenu is clicked");
		clickObj(home.enterintologout(), "logout");
		report.logTestInfo("Logout is clicked");
		String actualtext= login.Userfield().getText();
		String expectedtext="vasuki@123.com";
		validateErrormessage(actualtext, expectedtext);
		System.out.println("Check Remember Me is completed");
		report.logTestInfo("Testcase 3 Check Remember Me is completed");
}
	   
	
	@Test(description = "Forgot Password- 4A",priority = 4)
	public void Forgot_Password_4_A() throws Exception {
		report.startSingleTestReport(Thread.currentThread().getStackTrace()[1].getMethodName());
		String Username = common.getApplicationProperty("Uname");
		enterText(login.enterintoUsername(), Username, "Username");
		report.logTestInfo("Username is entered");
		clickObj(login.forgotPassword(), "ForgotPassword");
		String Fname = common.getApplicationProperty("fname");
		enterText(login.FUserNamefield(),Username, "UsernameField");
		clickObj(login.Continue(), "Continue");
		String actualmessage = login.ForgetPwMessage().getText();
		String expected="We’ve sent you an email with a link to finish resetting your password.";
		validateErrormessage(actualmessage, expected);
		System.out.println("Forget password is completed");
		report.logTestInfo("Testcase 4A Forget password is completed");
	}
	
	@Test(description = "Wrong Password- 4B",priority = 5)
	public void Forgot_Password_4_B() throws Exception {
		report.startSingleTestReport(Thread.currentThread().getStackTrace()[1].getMethodName());
		String Username = common.getApplicationProperty("Uname");
		enterText(login.enterintoUsername(), Username, "Username");
		report.logTestInfo("Username is entered");
		String Password = common.getApplicationProperty("wrongpassword");
		enterText(login.enterIntoPassword(), Password, "Passwordtext");
		report.logTestInfo("Password is entered");
		clickObj(login.LoginButton(), "Login");
		report.logTestInfo("Login is clicked");
		String alertmessage = driver.findElement(By.xpath("//div[@role='alert']")).getText();
		String expected = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		Assert.assertEquals(alertmessage, expected);
			System.out.println("testcase is pass");
			System.out.println("Wrong password is completed");
			report.logTestInfo("Testcase 4B Wrong password is completed");
		}
	}

