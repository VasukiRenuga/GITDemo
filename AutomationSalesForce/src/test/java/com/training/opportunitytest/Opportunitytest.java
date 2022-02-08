package com.training.opportunitytest;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.training.basepage.BaseTest;
import com.training.page.AccountPage;
import com.training.page.HomePage;
import com.training.page.LoginPage;
import com.training.page.Opportunitypage;
import com.training.utilities.CommonUtilities;

public class Opportunitytest extends BaseTest{
	WebDriver driver;
	LoginPage login;
	HomePage home;
	AccountPage account;
	Opportunitypage opportunity;
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
		String Username = common.getApplicationProperty("Uname");
		enterText(login.enterintoUsername(), Username, "Username");
		String Password = common.getApplicationProperty("pwd");
		enterText(login.enterIntoPassword(), Password, "Passwordtext");
		clickObj(login.LoginButton(), "Login");
		Thread.sleep(10000);
		clickObj(opportunity.enterintoOpportunities(),"opportunities");
		clickObj(opportunity.ClickViewPopup(),"popup");
		

}
   @Test(description = "Opportunities dropdown 15")
	
	public void Opportunitydropdown() throws Exception {
	    clickObj(opportunity.ClickViewOpportunities(),"viewopportunities");
        //Get all options
		Select dropdown = new Select(opportunity.ClickViewOpportunities());
		List<WebElement> options = dropdown.getOptions();
		
	    //Get the length
	    System.out.println(options.size());
        System.out.println(opportunity.ClickViewOpportunities().getText());
	    // Loop to print one by one
	    //for (int j = 0; j < options.size(); j++) {
	      //  System.out.println(options.get(j).getText());

	    //}
	    
	    System.out.println("opportunitiesdropdown is completed");
	}
    @Test(description = "Create New opportunity 16")

    public void CreateNewopportunity() throws Exception {
       clickObj(opportunity.ClickNewButton(),"new");
	   opportunity.EnterOpportunityname().sendKeys("ABCD");
	   clickObj(opportunity.ClickLookup(),"lookup");
	   Thread.sleep(10000);
	   String oldWindow = driver.getWindowHandle();
	   //Switching driver control to new window.
	   Set<String> getAllWindows = driver.getWindowHandles();
	   String[] getWindow = getAllWindows.toArray(new String[getAllWindows.size()]);
	   driver.switchTo().window(getWindow[1]);
	   Thread.sleep(3000);
	   //switch to first frame
	   driver.switchTo().frame("searchFrame");
	   opportunity.EnterNameinLookup().sendKeys("Vasuki");
	   clickObj(opportunity.ClickGo(),"go");
	   //Switching to Lookup Window
	   driver.switchTo().defaultContent();
	   //Switching to Insideframe(result)
	   driver.switchTo().frame("resultsFrame");
	   Thread.sleep(5000);
       clickObj(opportunity.PickaccountName(),"pickaccountname");
	   driver.switchTo().window(getWindow[0]);
	   Thread.sleep(2000);
	   clickObj(opportunity.GiveClosedate(),"closedate");
	   clickObj(opportunity.Selecttodaydate(),"todatdate");
	   Actions action = new Actions(driver);
	   action.sendKeys(Keys.ESCAPE).build().perform();
	   Thread.sleep(2000);
	   clickObj(opportunity.Stagedropdown(),"stage");
	   Select dropdown = new Select(opportunity.Stagedropdown());
	   dropdown.selectByValue("Qualification");
	   Thread.sleep(2000);
	   opportunity.EnterProbability().clear();
	   opportunity.EnterProbability().sendKeys("80");
	   Thread.sleep(2000);
	   Select dropdown1 = new Select(opportunity.LeadsourceDropdown());
	   dropdown1.selectByValue("Other");
	   clickObj(opportunity.Saveopportunity(),"saveopportunity");
}	

   @Test(description = "Opportunity pipeline 17")

   public void Opportunitypipeline() throws Exception {
       clickObj(opportunity.ClickOpportunitypipeline(),"opportunitypipeline");
       System.out.println("Report page with the opportunities that are pipelined will be displayed");
       System.out.println("TestOpportunityPipeline is completed");

}
   @Test(description = "Stuck Opportunities Report 18")

   public void StuckOpportunitiesReport() throws Exception {
	   waitforElement(opportunity.ClickStuckOpportunitylink());
       clickObj(opportunity.ClickStuckOpportunitylink(),"stuckopportunitylink");
       System.out.println("Report page with the opportunities that are stuck will be displayed");
       System.out.println("TestStuckOpportunitiesReport is completed");
}
   @Test(description = "Quarterly Summary Report 19")

   public void QuarterlySummaryReport() throws Exception {
      clickObj(opportunity.Intervaldropdown(),"interval");
      SelectByValue(opportunity.Intervaldropdown(), "curnext1");
      Thread.sleep(2000);
      clickObj(opportunity.Includedropdown(),"include");
      selectByIndex(opportunity.Includedropdown(), 2);
      Thread.sleep(2000);
      clickObj(opportunity.ClickRunReport(),"runreport");
      System.out.println("Report page with the opportunities that satisfies the search criteria will be displayed");
      System.out.println("TestQuarterlySummaryReport is completed");
}


}







