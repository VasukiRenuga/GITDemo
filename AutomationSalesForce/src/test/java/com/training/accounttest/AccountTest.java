package com.training.accounttest;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.training.basepage.BaseTest;
import com.training.page.AccountPage;
import com.training.page.HomePage;
import com.training.page.LoginPage;
import com.training.utilities.CommonUtilities;

public class AccountTest extends BaseTest {
	WebDriver driver;
	LoginPage login;
	HomePage home;
	AccountPage account;
	CommonUtilities common = new CommonUtilities();

	@BeforeMethod
	public void beforeMethod(Method method) throws Exception {
		report.startSingleTestReport(method.getName());
		driver = getDriver();
		String url = common.getApplicationProperty("url");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		login = new LoginPage(driver);
		home = new HomePage(driver);
	   account = new AccountPage(driver);
	   String Username = common.getApplicationProperty("Uname");
		enterText(login.enterintoUsername(), Username, "Username");
		String Password = common.getApplicationProperty("pwd");
		enterText(login.enterIntoPassword(), Password, "Passwordtext");
		clickObj(login.LoginButton(), "Login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		clickObj(account.enterintoAccount(), "account");
		Thread.sleep(3000);
		clickObj(account.clickclosepop(), "closepop");

	}
	@Test(description = "Select Account 10",priority = 1)
	
	public void SelectAccount() throws Exception {
        String actualTitle = driver.getTitle();
		String expectedTitle = "Home Page ~ Salesforce - Developer Edition";
		getTitle(actualTitle, expectedTitle);
		clickObj(account.CreatenewAccount(), "createnew");
	    clickObj(account.ClickAccount(), "newaccount");
		Thread.sleep(1000);
		String Accountname = common.getApplicationProperty("Accountname");
		enterText(account.enterAccountName(), Accountname, "accountname");
		clickObj(account.enterintoTypeDropdown(),"type");
		Thread.sleep(1000);
		selectByVisibleText(account.enterintoTypeDropdown(), "Technology Partner");
		selectByVisibleText(account.enterintoCustomerPriority(), "High");
		Thread.sleep(1000);
		clickObj(account.ClickAccountSave(),"save");
		System.out.println("Clicked on Save button..");
		System.out.println("create account is completed");
		
	
	
}
   @Test(description = "Create newview in account 11",priority = 2)
	
	public void Selectnewview() throws Exception {
	    clickObj(account.ClickViewDropdown(), "viewdropdown");
	    dropDownoptionsclick(account.ClickViewDropdown(), "saro");
	    clickObj(account.ClickEdit(), "edit");
	    waitforElement(account.deleteAccountName());
	    clickObj(account.deleteAccountName(), "deleteaccount");
	    switchtoAlert(driver);
		clickObj(account.enterintocreateNewView(), "createnewview");
		account.enterViewName().sendKeys("saro");
		account.enterUniqueName().clear();
		account.enterUniqueName().sendKeys("saro");
		Thread.sleep(1000);
		clickObj(account.SaveCreatenewview(), "saveview");
		Thread.sleep(10000);
		clickObj(account.ClickViewDropdown(), "viewdropdown");
		dropDownGetOptions(account.ClickViewDropdown(), "saro");
		System.out.println("Createnewview is completed");
		
}
   @Test(description = "Select Edit view in account 12")

   public void SelectEditview() throws Exception {
      clickObj(account.ClickViewDropdown(), "viewdropdown");
	  Thread.sleep(20000);
	  selectByIndex(account.ClickViewDropdown(), 2);
	  Thread.sleep(20000);
	  clickObj(account.ClickEdit(), "edit");
	  Thread.sleep(6000);
	  account.EnterEditviewname().clear();
	  account.EnterEditviewname().sendKeys("VasukiRenuga");
	  clickObj(account.SelectFilterField(), "filterfield");
	  selectByVisibleText(account.SelectFilterField(), "Account Name");
      clickObj(account.SelectOperator(), "operator");
      selectByVisibleText(account.SelectOperator(), "contains");
	  account.Selectvalue().sendKeys("a");
      Thread.sleep(3000);
      clickObj(account.SaveEditview(), "saveedit");

}
@Test(description = "MergeAccount 13")

public void MergeAccount() throws Exception {
	clickObj(account.ClickMergeaccount(), "merge");
	account.Enternameoftheaccount().sendKeys("Vasuki");
	clickObj(account.ClickFindAccount(),"findaccount");
	Radiobutton(account.ClickRadiobutton1(), "radiobutton1");
	Radiobutton(account.ClickRadiobutton2(), "radiobutton2");
	//Radiobutton(account.ClickRadiobutton3(), "radiobutton3");
	Thread.sleep(3000);
	clickObj(account.ClickNext(),"next");
	clickObj(account.ClickMerge(),"merge");
	switchtoAlert(driver);	
   System.out.println("TC13_MergeAccounts is completed");
	}
@Test(description = "Create account report 14")

public void CreateAccountreport() throws Exception {
	clickObj(account.Accountwithlastactivity(), "lastactivity");
	Thread.sleep(6000);
	selectDropdown(account.Datefielddropdown(), "datefield");
	clickObj(account.ClickCreateDate(), "created date");
	clickObj(account.CalendarStartdate(), "calendarstartdate");
	clickObj(account.TodayStartdate(), "todaystartdate");
	clickObj(account.CalendarEnddate(), "calendarenddate");
	Thread.sleep(10000);
	clickObj(account.TodayEnddate(), "todayenddate");
	Thread.sleep(6000);
	clickObj(account.SaveCreatedate(), "savecreatedate");
	account.EnterreportName().sendKeys("Vasu");
	clearElement(account.EnterReportUniqueName());
	account.EnterReportUniqueName().sendKeys("Vasuki");
	Thread.sleep(3000);
	clickObj(account.ClicksaveandRun(), "saveandrun");
	System.out.println("create accout report is completed");
	}}

	


