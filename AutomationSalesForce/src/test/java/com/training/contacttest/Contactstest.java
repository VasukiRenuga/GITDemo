package com.training.contacttest;


import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.basepage.BaseTest;
import com.training.page.AccountPage;
import com.training.page.ContactsPage;
import com.training.page.HomePage;
import com.training.page.LeadsPage;
import com.training.page.LoginPage;
import com.training.page.Opportunitypage;
import com.training.utilities.CommonUtilities;

public class Contactstest extends BaseTest {
	WebDriver driver;
	LoginPage login;
	HomePage home;
	AccountPage account;
	Opportunitypage opportunity;
	LeadsPage leads;
	ContactsPage contacts;
	static Actions action;
	static  WebDriverWait wait;
	CommonUtilities common = new CommonUtilities();
	
	
	@BeforeMethod
	public void beforeMethod(Method method) throws Exception {
		report.startSingleTestReport(method.getName());
		driver = getDriver();
	    String url = common.getApplicationProperty("url");
		driver.get(url);
		login = new LoginPage(driver);
		home = new HomePage(driver);
		account = new AccountPage(driver);
		opportunity = new Opportunitypage(driver);
		leads = new LeadsPage(driver);
		contacts = new ContactsPage(driver);
		String Username = common.getApplicationProperty("Uname");
		enterText(login.enterintoUsername(), Username, "Username");
		String Password = common.getApplicationProperty("pwd");
		enterText(login.enterIntoPassword(), Password, "Passwordtext");
		clickObj(login.LoginButton(), "Login");
		waitforElement(contacts.EnterContacts());
			clickObj(contacts.EnterContacts(), "contacts");
			Thread.sleep(10000);
			clickObj(account.clickclosepop(), "closepop");
	}
	
   @Test(description = "Create New contact 25")
   public void CreateNewcontact() throws Exception {
		waitforElement(contacts.NewContacts());
		clickObj(contacts.NewContacts(),"newcontacts");
		clearElement(contacts.EnterContactslastname());
		contacts.EnterContactslastname().sendKeys("Krish");
		clickObj(opportunity.ClickLookup(),"lookup");
		Thread.sleep(10000);
		String oldWindow = driver.getWindowHandle();
		//Switching driver control to new window.
		Set<String> getAllWindows = driver.getWindowHandles();
		//String[] getWindow = getAllWindows.toArray(new String[getAllWindows.size()]);
		//driver.switchTo().window(getWindow[1]);
		
		for(String windowHandle:getAllWindows) {
			if(!windowHandle.equals(oldWindow)) {
				driver.switchTo().window(windowHandle);
				break;
			}}
		Thread.sleep(3000);
		
		//switch to first frame
		driver.switchTo().frame("searchFrame");
		opportunity.EnterNameinLookup().sendKeys("Vasuki");
		clickObj(opportunity.ClickGo(),"go");
		//Switching to Lookup Window
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.switchTo().frame("resultsFrame");
		Thread.sleep(5000);
		clickObj(opportunity.PickaccountName(),"pickaccountname");
		driver.switchTo().window(oldWindow);
		//driver.switchTo().window(getWindow[0]);
		clickObj(contacts.SaveNewContacts(),"savecontacts");
		System.out.println("Createnewcontact is completed");
		
}
@Test(description = "Create Newview in contact page 26")
	
	public void newviewinContactPage() throws Exception {
        waitforElement(contacts.CreateNewviewLink());
		clickObj(contacts.CreateNewviewLink(), "createnewview");
		contacts.EnterViewname().sendKeys("DevTharun");
		contacts.EnterViewUniquename().clear();
		contacts.EnterViewUniquename().sendKeys("Renuga");
		waitforElement(contacts.SaveContacts());
		clickObj(contacts.SaveContacts(), "save");
		System.out.println("CreatenewviewintheContactPage is Completed");
		
}
   @Test(description = "Check recently created contact in the contact page 27")

   public void Checkrecentlycreatedcontact() throws Exception {
       clickObj(contacts.Recentlycreateddropdown(), "recentlcreated");
	   Select dropdown = new Select(contacts.Recentlycreateddropdown());
	   dropdown.selectByValue("2");
	   System.out.println("Checkrecentlycreatedcontact is Completed");

}	

   @Test(description = "Check my Contacts in the contact page 28")

   public void CheckMycontacts() throws Exception {
       clickObj(leads.ListhandleDropdown(), "listhandledropdown");
	   Select dropdown = new Select(leads.ListhandleDropdown());
	   dropdown.selectByIndex(4);
	   Thread.sleep(3000);
	   System.out.println("MyContacts is Completed");

}
   @Test(description = "View Contacts in the contact page 29")

   public void Viewcontacts() throws Exception {

       clickObj(contacts.RecentContactName(),"contactname");
       System.out.println("ViewcontactinthecontactPage is completed");
}
   
   @Test(description = "Error message in the Create Newview in contact page 30")

   public void ErrorMessage() throws Exception {
       waitforElement(contacts.CreateNewviewLink());
	   clickObj(contacts.CreateNewviewLink(), "createnewview");
	   contacts.EnterViewUniquename().clear();
	   contacts.EnterViewUniquename().sendKeys("EFGH");
	   Thread.sleep(1000);
	   clickObj(contacts.SaveContacts(), "save");
	   Thread.sleep(3000);
	   String actualmsg = contacts.Errormessage().getText();
	   String errormsg = "Error: You must enter a value";
	   validateErrormessage(actualmsg, errormsg);
	   System.out.println("ChecktheContactErrormessage is Completed");
}
   @Test(description = "Check cancel button works fine in the Create Newview in contact page 31")

   public void CheckCancelButton() throws Exception {
       waitforElement(contacts.CreateNewviewLink());
	   clickObj(contacts.CreateNewviewLink(), "createnewview");
	   waitforElement(contacts.EnterViewname());
	   contacts.EnterViewname().sendKeys("ABCD");
	   contacts.EnterViewUniquename().clear();
	   contacts.EnterViewUniquename().sendKeys("EFGH");
	   waitforElement(contacts.ClickcancelButton());
	   clickObj(contacts.ClickcancelButton(), "cancelbutton");
	   System.out.println("CheckingCancelbutton is Completed");
}

   @Test(description = "Checking Save and Newbutton in contact page 32")

   public void CheckingSaveandNewbutton() throws Exception {
       waitforElement(leads.ClickNew());
       clickObj(leads.ClickNew(), "clicknew");
       waitforElement(contacts.EnterContactslastname());
	   contacts.EntertheLastname().sendKeys("Vasuki");
	   clickObj(opportunity.ClickLookup(),"lookup");
	   Thread.sleep(10000);
	   String oldWindow = driver.getWindowHandle();
	   //Switching driver control to new window.
	   Set<String> getAllWindows = driver.getWindowHandles();
	   for(String windowHandle:getAllWindows) {
			if(!windowHandle.equals(oldWindow)) {
				driver.switchTo().window(windowHandle);
				break;
			}}
	   //String[] getWindow = getAllWindows.toArray(new String[getAllWindows.size()]);
	   //driver.switchTo().window(getWindow[1]);
	   Thread.sleep(3000);
       //switch to first frame
	   driver.switchTo().frame("searchFrame");
	   opportunity.EnterNameinLookup().sendKeys("Vasuki");
	   clickObj(opportunity.ClickGo(),"go");
	   //Switching to Lookup Window
	   driver.switchTo().defaultContent();
	   //Switching to Insideframe(result)
	   driver.switchTo().frame("resultsFrame");
	   waitforElement(opportunity.PickaccountName());
	   clickObj(opportunity.PickaccountName(),"pickaccountname");
	   driver.switchTo().window(oldWindow);
	   //driver.switchTo().window(getWindow[0]);
	   waitforElement(contacts.ClickSaveAndNew());
	   clickObj(contacts.ClickSaveAndNew(), "saveandnewbutton");
}
}
