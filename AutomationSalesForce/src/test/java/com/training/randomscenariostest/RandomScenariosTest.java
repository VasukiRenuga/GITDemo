package com.training.randomscenariostest;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
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
import com.training.page.RandomScenariosPage;
import com.training.utilities.CommonUtilities;

public class RandomScenariosTest extends BaseTest{
	WebDriver driver;
	LoginPage login;
	HomePage home;
	AccountPage account;
	Opportunitypage opportunity;
	LeadsPage leads;
	ContactsPage contacts;
	RandomScenariosPage randomscenarios;
	static Actions action;
	static  WebDriverWait wait;
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
		contacts = new ContactsPage(driver);
		randomscenarios= new RandomScenariosPage(driver);
		String Username = common.getApplicationProperty("Uname");
		enterText(login.enterintoUsername(), Username, "Username");
		String Password = common.getApplicationProperty("pwd");
		enterText(login.enterIntoPassword(), Password, "Passwordtext");
		clickObj(login.LoginButton(), "Login");
	}
	


    @Test(description = "Verify Firstname and Lastname 33")
	
	public void CreateNewcontact() throws Exception {
       waitforElement(randomscenarios.EnterHome());
       clickObj(randomscenarios.EnterHome(), "home");
       waitforElement(randomscenarios.popup());
       //Thread.sleep(10000);
       clickObj(randomscenarios.popup(), "popup");
       waitforElement(randomscenarios.ClickNameLink());
       clickObj(randomscenarios.ClickNameLink(), "namelink");
       System.out.println("FirstNameLastName page is displayed");

}

   @Test(description = "Verify the Edited Lastname 34")

   public void Editedlastname() throws Exception {
       waitforElement(randomscenarios.EnterHome());
       clickObj(randomscenarios.EnterHome(), "home");
       waitforElement(randomscenarios.popup());
       clickObj(randomscenarios.popup(), "popup");
       waitforElement(randomscenarios.ClickNameLink());
       clickObj(randomscenarios.ClickNameLink(), "namelink");
       Thread.sleep(10000);
       clickObj(home.enterintoedit(),"edit");
       switchFrame(driver, home.enterintoprofileiframe());
       waitforElement(home.enterintoabout());
       clickObj(home.enterintoabout(),"about");
       home.ClearLastname().clear();
       String Lastname = common.getApplicationProperty("Lastname");
       enterText(home.EnterLastname(), Lastname, "lastname");
       clickObj(home.MyProfileSave(),"saveall");
       System.out.println("Saved all");
       System.out.println("LastName edited is updated");
}

   @Test(description = "Verify the tab customization 35")

   public void tabCustomization() throws Exception {
      waitforElement(randomscenarios.EnterintoTab());
      clickObj(randomscenarios.EnterintoTab(), "tab");
      waitforElement(randomscenarios.Customizemytab());
      Thread.sleep(10000);
      clickObj(randomscenarios.Customizemytab(),"customizemytab");
      clickObj(randomscenarios.SelectChatter(),"chatter");
      clickObj(randomscenarios.AddChatter(), "addChatter"); 
      clickObj(randomscenarios.RemoveChatter(),"removechatter");
      waitforElement(randomscenarios.SaveTab());
      clickObj(randomscenarios.SaveTab(),"savetab");
      waitforElement(home.enterintoUsermenu());
      clickObj(home.enterintoUsermenu(),"usermenu");
      Thread.sleep(5000);
      clickObj(home.enterintologout(),"logout");
      Thread.sleep(6000);
      String Username = common.getApplicationProperty("Uname");
      enterText(login.enterintoUsername(), Username, "Username");
      String Password = common.getApplicationProperty("pwd");
      enterText(login.enterIntoPassword(), Password, "Passwordtext");
      clickObj(login.LoginButton(), "Login");
      driver.manage().window().maximize();
      System.out.println("Tab Customization is verified");
}

   @Test(description = "Blocking an event in the calendar 36")

   public void BlockinganeventinCalendar() throws Exception {
      waitforElement(randomscenarios.EnterHome());
      clickObj(randomscenarios.EnterHome(), "home");
      waitforElement(randomscenarios.popup());
      clickObj(randomscenarios.popup(), "popup");
      waitforElement(randomscenarios.ClickCurrentDate());
	  clickObj(randomscenarios.ClickCurrentDate(), "currentdate");
	  waitforElement(randomscenarios.Selecteightpmlink());
	  clickObj(randomscenarios.Selecteightpmlink(), "eightpmlink");
	  waitforElement(randomscenarios.ClickSubjectcombo());
	  clickObj(randomscenarios.ClickSubjectcombo(), "subjectcombo");
	  Set<String> windowHandles = driver.getWindowHandles();
	  String currentHandle = driver.getWindowHandle();
	  windowHandles.remove(currentHandle);
	  String newHandle = windowHandles.iterator().next();
	  driver.switchTo().window(newHandle);
	  clickObj(randomscenarios.Selectother(),"other");
	  driver.switchTo().window(currentHandle);
	  waitforElement(randomscenarios.Endtimedropdown());
	  clickObj(randomscenarios.Endtimedropdown(),"endtime");
	  clickObj(randomscenarios.EnterNinepm(),"ninepm");
	  clickObj(randomscenarios.Clicksave(),"save");
	  String actual = driver.findElement(By.xpath("//a[@title='Busy - Other']//span")).getText();
	  String expected ="Other";
	  validateErrormessage(actual, expected);
	  System.out.println("Calendar for FirstNameLastName page is displayed with other in 8-9PM time slot");
	
}
   @Test(description = "Blocking an event in the calendar with weekly reccurance 37")
   public void BlockinganeventinCalendarwithweeklyreccurance() throws Exception {
	      waitforElement(randomscenarios.EnterHome());
	      clickObj(randomscenarios.EnterHome(), "home");
	      waitforElement(randomscenarios.popup());
	      clickObj(randomscenarios.popup(), "popup");
	      waitforElement(randomscenarios.ClickCurrentDate());
		  clickObj(randomscenarios.ClickCurrentDate(), "currentdate");
		  Thread.sleep(10000);
		  clickObj(randomscenarios.ClickFourpm(), "fourpm");
		  waitforElement(randomscenarios.ClickSubjectcombo());
		  clickObj(randomscenarios.ClickSubjectcombo(), "subjectcombo");
		  Set<String> windowHandles = driver.getWindowHandles();
		  String currentHandle = driver.getWindowHandle();
		  for (String newHandle : windowHandles) {
			  if(!newHandle.equals(currentHandle))
		      driver.switchTo().window(newHandle);}
		  clickObj(randomscenarios.Selectother(),"other");
		  driver.switchTo().window(currentHandle);
		  waitforElement(randomscenarios.Endtimedropdown());
		  clickObj(randomscenarios.Endtimedropdown(),"endtime");
		  clickObj(randomscenarios.ClickSevenpm(),"sevenpm");
		  selectCheckBox(randomscenarios.ClickRecurrence(), "recurrence");
		  waitforElement(randomscenarios.ClickWeekly());
		  clickObj(randomscenarios.ClickWeekly(),"weekly");
		  
		  clickObj(randomscenarios.Date(),"date");
		  waitforElement(randomscenarios.ClickRecurrencesave());
		  clickObj(randomscenarios.ClickRecurrencesave(), "recurrence save");
	}
   /*public void BlockinganeventinCalendarwithweeklyreccurance() throws Exception {
      waitforElement(randomscenarios.EnterHome());
      clickObj(randomscenarios.EnterHome(), "home");
      waitforElement(randomscenarios.popup());
      clickObj(randomscenarios.popup(), "popup");
      waitforElement(randomscenarios.ClickCurrentDate());
	  clickObj(randomscenarios.ClickCurrentDate(), "currentdate");
	  clickObj(randomscenarios.ClickFourpm(), "fourpm");
	  waitforElement(randomscenarios.ClickSubjectcombo());
	  clickObj(randomscenarios.ClickSubjectcombo(), "subjectcombo");
	  Set<String> windowHandles = driver.getWindowHandles();
	  String currentHandle = driver.getWindowHandle();
	  windowHandles.remove(currentHandle);
	  String newHandle = windowHandles.iterator().next();
	  driver.switchTo().window(newHandle);
	  clickObj(randomscenarios.Selectother(),"other");
	  driver.switchTo().window(currentHandle);
	  waitforElement(randomscenarios.Endtimedropdown());
	  clickObj(randomscenarios.Endtimedropdown(),"endtime");
	  clickObj(randomscenarios.ClickSevenpm(),"sevenpm");
	  clickObj(randomscenarios.ClickRecurrence(),"recurrence");
	  waitforElement(randomscenarios.ClickWeekly());
	  clickObj(randomscenarios.ClickWeekly(),"weekly");
	  waitforElement(randomscenarios.RecurrenceEndDate());
	  clickObj(randomscenarios.RecurrenceEndDate(),"recurrenceenddate");
	  clickObj(randomscenarios.Date(),"date");
	  waitforElement(randomscenarios.ClickRecurrencesave());
	  clickObj(randomscenarios.ClickRecurrencesave(), "recurrence save");
}*/
   
/*
 * @AfterMethod public void teardown() throws IOException { //
 * takescreenshot(driver); driver.close(); }
 */
}


