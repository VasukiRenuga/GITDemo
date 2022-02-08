package com.training.Leadstest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.training.basepage.BaseTest;
import com.training.page.AccountPage;
import com.training.page.HomePage;
import com.training.page.LeadsPage;
import com.training.page.LoginPage;
import com.training.page.Opportunitypage;
import com.training.utilities.CommonUtilities;

public class Leadstest extends BaseTest{
	WebDriver driver;
	LoginPage login;
	HomePage home;
	AccountPage account;
	Opportunitypage opportunity;
	LeadsPage leads;
	CommonUtilities common = new CommonUtilities();

	@BeforeMethod
	public void beforeTest() throws Exception {
		driver = getDriver();
		String url = common.getApplicationProperty("url");
		driver.get(url);
		login = new LoginPage(driver);
		home = new HomePage(driver);
		account = new AccountPage(driver);
		opportunity = new Opportunitypage(driver);
		leads = new LeadsPage(driver);
		String Username = common.getApplicationProperty("Uname");
		enterText(login.enterintoUsername(), Username, "Username");
		String Password = common.getApplicationProperty("pwd");
		enterText(login.enterIntoPassword(), Password, "Passwordtext");
		clickObj(login.LoginButton(), "Login");
		waitforElement(leads.EnterLeads());
		clickObj(leads.EnterLeads(), "leads");
		Thread.sleep(10000);
		clickObj(opportunity.ClickViewPopup(),"popup");
		

	}
   @Test(description = "LeadsTab 20")
	
	public void LeadsTab() throws Exception {
	    String expectedTitle = "Home ~ Salesforce - Developer Edition";
	    String actualTitle= driver.getTitle();
        System.out.println(actualTitle);
	    getTitle(actualTitle, expectedTitle);
	    System.out.println("LeadsTab is completed");
}
   @Test(description = " Listhandle 21")

   public void Listhandle() throws Exception {
	    clickObj(leads.ListhandleDropdown(), "listhandledropdown");
	    String actual=leads.ListhandleDropdown().getText();
	    System.out.println(actual);
	    System.out.println("LeadsSelectView is completed");
}
   @Test(description = " Defaultview 22")

   public void Defaultview() throws Exception {
        clickObj(leads.ListhandleDropdown(), "listhandledropdown");
	    Select dropdown = new Select(leads.ListhandleDropdown());
	    dropdown.selectByIndex(3);
	    Thread.sleep(3000);
	    clickObj(home.enterintoUsermenu(),"usermenu");
	    clickObj(home.enterintologout(),"logout");
	    Thread.sleep(10000);
	    String Username1 = common.getApplicationProperty("Uname");
	    enterText(login.enterintoUsername(), Username1, "Username");
	    String Password1 = common.getApplicationProperty("pwd");
	    enterText(login.enterIntoPassword(), Password1, "Passwordtext");
	    clickObj(login.LoginButton(), "Login");
	    Thread.sleep(6000);
	    clickObj(leads.EnterLeads(), "leads");
	    Thread.sleep(3000);
	    clickObj(leads.ClickLeadsGo(), "leadsgo");
	    System.out.println("Todays leads page is displayed");
	    System.out.println("Functionality of the go button is completed");
	
}

   @Test(description = " TodaysLeads 23")

   public void TodaysLeads() throws Exception {
	   clickObj(leads.ListhandleDropdown(), "listhandledropdown");
	   Select dropdown = new Select(leads.ListhandleDropdown());
	   dropdown.selectByIndex(3);
	   System.out.println("Todays leads page is displayed");
	   System.out.println("List item TodaysLeads work is completed");

}

@Test(description = " Check NewButton on leads 24")

public void CheckNewButtononleads() throws Exception {
	clickObj(leads.ClickNew(), "clicknew");
	Thread.sleep(10000);
	leads.EnterLastName().sendKeys("Krishna");
	leads.EnterCompanyName().sendKeys("Krishna");
	clickObj(leads.ClickSaveLeads(), "saveleads");
}
}
