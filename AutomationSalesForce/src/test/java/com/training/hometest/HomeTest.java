package com.training.hometest;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.training.basepage.BasePage;
import com.training.basepage.BaseTest;
import com.training.page.HomePage;
import com.training.page.LoginPage;
import com.training.utilities.CommonUtilities;

public class HomeTest extends BaseTest{
	
	
	WebDriver driver;
	LoginPage login;
	HomePage home;
	static Actions action;
	static  WebDriverWait wait;
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
		String Username = common.getApplicationProperty("Uname");
		enterText(login.enterintoUsername(), Username, "Username");
		String Password = common.getApplicationProperty("pwd");
		enterText(login.enterIntoPassword(), Password, "Passwordtext");
		clickObj(login.LoginButton(), "Login");
		clickObj(home.enterintoUsermenu(),"usermenu");
				
	}
	
   @Test(description = "Select user menu dropdown 5")
	
   public void Selectusermenu() throws Exception {
	System.out.println("DropDown with My profile, my settings, developerconsole,logout is displayed");
			}

    @Test(description = "Select my profile edit 6")

     public void selectmyprofile() throws Exception {
     clickObj(home.enterintomyprofile(),"myprofile");
	Thread.sleep(10000);
	clickObj(home.enterintoedit(),"edit");
	Thread.sleep(10000);
	switchFrame(driver, home.enterintoprofileiframe());
    Thread.sleep(10000);
    clickObj(home.enterintoabout(),"about");
	clearElement(home.ClearLastname());
	String Lastname = common.getApplicationProperty("Lastname");
    enterText(home.EnterLastname(), Lastname, "lastname");
	clickObj(home.MyProfileSave(),"saveall");
	System.out.println("Saved all");
	Thread.sleep(10000);
	clickObj(home.enterintopost(),"post");
	switchFrame(driver, home.enterintopostiframe());
	Thread.sleep(2000);
	String posttext = common.getApplicationProperty("postbodytext");
	enterText(home.enterintopostText(),posttext, " postbodytext");
	switchdefaultFrame(driver);
	Thread.sleep(2000);
	clickObj(home.ClickPostShare(),"share");
	clickObj(home.Clickonfile(),"file");
	Thread.sleep(2000);
	clickObj(home.Uploadingfile(),"uploadfile");
	//clickObj(home.Choosefile(),"choosefile");
	String ChooseFile = common.getApplicationProperty("File");
	enterText(home.Choosefile(), ChooseFile, "ChooseFile");
	System.out.println("choosefile option is selected");
	clickObj(home.ClickFileShare(),"share");
				}
  @Test(description = "Select my profile post and file 6")

  public void selectmyprofilepost() throws Exception {
	;
	clickObj(home.enterintomyprofile(),"myprofile");
	Thread.sleep(10000);
	clickObj(home.enterintopost(),"post");
	switchFrame(driver, home.enterintopostiframe());
	Thread.sleep(2000);
	String posttext = common.getApplicationProperty("postbodytext");
	enterText(home.enterintopostText(),posttext, " postbodytext");
	switchdefaultFrame(driver);
	Thread.sleep(2000);
	clickObj(home.ClickPostShare(),"share");
	clickObj(home.Clickonfile(),"file");
	Thread.sleep(3000);
	clickObj(home.Uploadingfile(),"uploadfile");
    String ChooseFile = common.getApplicationProperty("File");
	enterText(home.Choosefile(), ChooseFile, "ChooseFile");
	System.out.println("choosefile option is selected");
	clickObj(home.ClickFileShare(),"share");

}

  @Test(description = "Select my profile photoupload 6")

  public void uploadingphoto() throws Exception {
	  clickObj(home.enterintomyprofile(),"myprofile");
		Thread.sleep(10000);
		mouseOver(driver, home.MouseoverModerator());
		Thread.sleep(10000);
		clickObj(home.ClickAddPhotolink(),"addphoto");
		Thread.sleep(5000);
		//driver.switchTo().frame("uploadPhotoContentId");
		switchFrame(driver, home.uploadPhotoContentIdiframe());
	    Thread.sleep(5000);
	    home.Choosephotofile().sendKeys("C:\\Users\\vasuk\\OneDrive\\Desktop\\download.jpg");
	    waitforElement(home.Savephotofile());
	    clickObj(home.Savephotofile(), "save");
	    clickObj(home.Savephoto(), "save");
	    
  }



@Test(description = "Select My settings personal loginhistory 7")
public void loginhistory() throws Exception{
	clickObj(home.enterintomysettings(),"mysettings");
	Thread.sleep(1000);
	clickObj(home.enterintopersonal(),"personal");
	clickObj(home.enterintologinhistory(),"loginhistory");
	
}

@Test(description = "Select Display and layout 7")

public void displayandlayout() throws Exception{
	String Username = common.getApplicationProperty("Uname");
	enterText(login.enterintoUsername(), Username, "Username");
	String Password = common.getApplicationProperty("pwd");
	enterText(login.enterIntoPassword(), Password, "Passwordtext");
	clickObj(login.LoginButton(), "Login");
	String actualTitle = driver.getTitle();
	driver.manage().window().maximize();
	clickObj(home.enterintoUsermenu(),"usermenu");
	clickObj(home.enterintomysettings(),"mysettings");
	Thread.sleep(1000);
	clickObj(home.enterintodisplayandlayout(),"displayandlayout");
	clickObj(home.enterintocustomizemytab(),"customize");
	clickObj(home.enterintocustomapp(),"customapp");
	Thread.sleep(3000);
	Select dropdownoptions = new Select(home.enterintocustomapp());
	dropdownoptions.selectByValue("02u5f000001DPl0");
	Thread.sleep(3000);
	Select tabs = new Select(home.availabletabs());
	tabs.selectByVisibleText("Reports");
	clickObj(home.clickadd(), "add");
	clickObj(home.clicksave(), "save");
}
@Test(description = "Select Email 7")

public void selectemail() throws Exception{
	String Username = common.getApplicationProperty("Uname");
	enterText(login.enterintoUsername(), Username, "Username");
	String Password = common.getApplicationProperty("pwd");
	enterText(login.enterIntoPassword(), Password, "Passwordtext");
	clickObj(login.LoginButton(), "Login");
	String actualTitle = driver.getTitle();
	driver.manage().window().maximize();
	clickObj(home.enterintoUsermenu(),"usermenu");
	clickObj(home.enterintomysettings(),"mysettings");
	Thread.sleep(1000);
	clickObj(home.enterintoemail(),"email");
	Thread.sleep(3000);
	clickObj(home.enterintomyemailsettings(),"myemail");
	clickObj(home.enteremailname(),"emailname");
	home.enteremailname().clear();
	Thread.sleep(1000);
	String emailname = common.getApplicationProperty("emailname");
	enterText(home.enteremailname(), emailname, "name");
	Thread.sleep(1000);
	clickObj(home.enteremailid(),"emailid");
	home.enteremailid().clear();
	String emailid = common.getApplicationProperty("emailid");
	enterText(home.enteremailid(), emailid, "id");
	Radiobutton(home.Radiobutton(),"Radiobutton");
	Thread.sleep(1000);
	clickObj(home.clickemailsave(),"emailsave");
	String savedmessage = driver.findElement(By.xpath("//tbody/tr/td/form[@name='editPage']/div[1]")).getText();
	if (savedmessage.equals("Your settings have been successfully saved.")) {
		System.out.println("Saved message is been be displayed");
	} else {
		System.out.println("Saved message is not been be displayed");
	}

}
@Test(description = "Select CalendarAndReminders 7")

public void selecteCalendarAndReminders() throws Exception{
	String Username = common.getApplicationProperty("Uname");
	enterText(login.enterintoUsername(), Username, "Username");
	String Password = common.getApplicationProperty("pwd");
	enterText(login.enterIntoPassword(), Password, "Passwordtext");
	clickObj(login.LoginButton(), "Login");
	String actualTitle = driver.getTitle();
	driver.manage().window().maximize();
	clickObj(home.enterintoUsermenu(),"usermenu");
	clickObj(home.enterintomysettings(),"mysettings");
	 Thread.sleep(1000);
	clickObj(home.enterintoCalendarandReminders(),"CalendarAndReminders");
	clickObj(home.enterintoActivityReminders(),"reminders");
	Thread.sleep(1000);
	String oldWindow=driver.getWindowHandle();
	clickObj(home.ClickopenaTestReminder(),"taskreminder");
	Set<String> handles=driver.getWindowHandles();
	 for (String newWindow : handles) {
		driver.switchTo().window(newWindow);
	 }
		driver.close();
		driver.switchTo().window(oldWindow);
	}	
		
		/*
		 * String expectedUrl=driver.getCurrentUrl(); String actualUrl=
		 * "https://tekarch-6e-dev-ed.my.salesforce.com/ui/core/activity/ActivityReminderPage?at=1633577497747&test=1setup%2FSetup%3Fsetupid%3DCalendarAndReminders";
		 * if (actualUrl.equalsIgnoreCase(expectedUrl)) {
		 * System.out.println("My settings page is not launched"); } else {
		 * System.out.println("My settings page is launched"); }
		 */

	
			
		
	
		
	
@Test(description = "Select Developers console 8")

public void selecteDevelopersConsole() throws Exception{
	String Username = common.getApplicationProperty("Uname");
	enterText(login.enterintoUsername(), Username, "Username");
	String Password = common.getApplicationProperty("pwd");
	enterText(login.enterIntoPassword(), Password, "Passwordtext");
	clickObj(login.LoginButton(), "Login");
	String actualTitle = driver.getTitle();
	driver.manage().window().maximize();
	 String oldWindow=driver.getWindowHandle();
	clickObj(home.enterintoUsermenu(),"usermenu");
	clickObj(home.enterintoDeveloperConsole(),"developerconsole");
	 Set<String> handles=driver.getWindowHandles();
	 for (String newWindow : handles) {
 		driver.switchTo().window(newWindow);
	 }
 		driver.close();
 		driver.switchTo().window(oldWindow);
 	}

 
@Test(description = "Logout 9")

public void logout() throws Exception{

	String Username = common.getApplicationProperty("Uname");
	enterText(login.enterintoUsername(), Username, "Username");
	String Password = common.getApplicationProperty("pwd");
	enterText(login.enterIntoPassword(), Password, "Passwordtext");
	clickObj(login.LoginButton(), "Login");
	String actualTitle = driver.getTitle();
	driver.manage().window().maximize();
	clickObj(home.enterintoUsermenu(),"usermenu");
	clickObj(home.enterintologout(),"logout");
	
	
}
}



    


	




