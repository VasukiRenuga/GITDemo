package com.training.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.basepage.BasePage;

public class Opportunitypage extends BasePage {
	
	
		
	public Opportunitypage(WebDriver driver) {
		super (driver);
	}

    @FindBy(xpath ="//a[@title='Opportunities Tab']")
	WebElement opportunities;
    
    @FindBy(xpath ="/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[2]/form/div/span/span[1]/select")
	WebElement viewopportunities;
    
    @FindBy(id ="tryLexDialogX")
    WebElement popup;
    
    @FindBy(xpath ="//input[@title='New']")
    WebElement newbutton;
    
    @FindBy(xpath ="/html/body/div[1]/div[2]/table/tbody/tr/td[2]/form/div/div[2]/div[3]/table/tbody/tr[3]/td[2]/div/input")
    WebElement opportunityname;
    
    @FindBy(xpath ="//input[@name='opp4']")
    WebElement accountname;
    
    @FindBy(xpath ="//img[@title='Account Name Lookup (New Window)']")
    WebElement lookup;
  
    @FindBy(xpath ="/html/body/form/div/div[2]/input[1]")
    WebElement namelookup;
    
    @FindBy(xpath ="//*[@id='theForm']/div/div[2]/input[2]")
    WebElement go;
    
    @FindBy(xpath ="//body[1]/form[1]/div[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/th[1]/a[1]")
    WebElement pickaccountname;
    
    @FindBy(xpath ="//input[@name='opp9']")
    WebElement closedate;
   
    @FindBy(xpath ="//tbody/tr/td/div/div[2]/div[1]/a[1]")
    WebElement todaydate;
    
    @FindBy(xpath ="//select[@name='opp11']")
    WebElement stage;
    
    @FindBy(xpath ="//input[@name='opp12']")
    WebElement probability;

    @FindBy(xpath ="//select[@name='opp6']")
    WebElement lead;
    
    @FindBy(xpath ="//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")
    WebElement saveopportunity;
    
    @FindBy(xpath ="//tbody/tr/td/div/div/div/ul/li[1]/a[1]")
    WebElement opportunitypipeline;
    
    @FindBy(xpath ="//tbody//li[2]//a[1]")
    WebElement stuckopportunitylink;
    
    @FindBy(xpath ="//select[@name='quarter_q']")
    WebElement interval;
    
    @FindBy(xpath ="//select[@name='open']")
    WebElement include;
    
    @FindBy(xpath ="//input[@title='Run Report']")
    WebElement runreport;
    
    
    public WebElement enterintoOpportunities() {
		return opportunities;
	}
    public WebElement ClickViewOpportunities() {
		return viewopportunities;
	}
    public WebElement ClickViewPopup() {
		return popup;
	}
    public WebElement ClickNewButton() {
		return newbutton;
	}
    public WebElement EnterOpportunityname() {
		return opportunityname;
	}
    public WebElement EnterAccountname() {
		return accountname;
	}
    public WebElement ClickLookup() {
		return lookup;
	}
    public WebElement EnterNameinLookup() {
		return namelookup;
	}
    public WebElement ClickGo() {
		return go;
	}
    public WebElement PickaccountName() {
		return pickaccountname;
	}
    public WebElement GiveClosedate() {
		return closedate;
	}
    public WebElement Selecttodaydate() {
		return todaydate;
	}
    public WebElement Stagedropdown() {
		return stage;
	}
    public WebElement EnterProbability() {
		return probability;
	}
    public WebElement LeadsourceDropdown() {
		return lead;
	}
    public WebElement Saveopportunity() {
	return saveopportunity;
    }
    public WebElement ClickOpportunitypipeline() {
    	return opportunitypipeline;
        }
    public WebElement ClickStuckOpportunitylink() {
    	return stuckopportunitylink;
        }
    public WebElement Intervaldropdown() {
    	return interval;
        }
    public WebElement Includedropdown() {
    	return include;
        }
    public WebElement ClickRunReport() {
    	return runreport;
        }
   

    


    
    
    
    
    
    
    

}
