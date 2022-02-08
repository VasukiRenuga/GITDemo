package com.training.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.basepage.BasePage;

public class RandomScenariosPage extends BasePage{

	public RandomScenariosPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//li[@id='home_Tab']//a[contains(text(),'Home')]")
	WebElement home;
	
	@FindBy(xpath="//*[@id=\"tryLexDialogX\"]")
	WebElement popup;
	
	@FindBy(xpath="//tbody//tr//td//div//div//div//div//span//h1//a")
	WebElement namelink;
	
	@FindBy(xpath="//tbody/tr/td/div/div/div/div/span/a[1]")
	WebElement currentdate;
	
	@FindBy(xpath="//div[29]//a[1]")
	WebElement eightpmlink;
	
	@FindBy(xpath="//img[@title='Subject Combo (New Window)']")
	WebElement subjectcombo;
	
	@FindBy(xpath="//li[5]//a[1]")
	WebElement other;
	
	@FindBy(xpath="//input[@name='EndDateTime_time']")
	WebElement endtime;
	
	@FindBy(xpath="//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")
	WebElement save;
	
	@FindBy(xpath="//body//div//div[43]")
	WebElement ninepm;
	
	@FindBy(xpath="//div[21]//a[1]")
	WebElement fourpm;
	
	@FindBy(xpath="//body//div//div[39]")
	WebElement sevenpm;
	
	@FindBy(xpath="//input[@name='IsRecurrence']")
	WebElement recurrence;
	
	@FindBy(xpath="//input[@value='ftw']")
	WebElement weekly;
	
	@FindBy(xpath="//input[@name='RecurrenceEndDateOnly']")
	WebElement recurrenceenddate;
	
	@FindBy(xpath="//td[normalize-space()='24']")
	WebElement date;
	
	@FindBy(xpath="//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")
	WebElement recurrencesave;
	
	@FindBy(xpath="//img[@title='All Tabs']")
	WebElement tab;
	
	@FindBy(xpath="//input[@title='Customize My Tabs']")
	WebElement customizemytab;
	
	@FindBy(xpath="//option[@value='Chatter']")
	WebElement chatter;
	
	@FindBy(xpath="//img[@title='Add']")
	WebElement addchatter;
	
	@FindBy(xpath="//img[@title='Remove']")
	WebElement removechatter;
	
	@FindBy(xpath="//input[@title='Save']")
	WebElement savetab;
	
	
	
	
	public WebElement EnterHome() {
    	return home;
        }
	public WebElement popup() {
    	return popup;
        }
	public WebElement ClickNameLink() {
    	return namelink;
        }
	public WebElement ClickCurrentDate() {
    	return currentdate;
        }
	public WebElement Selecteightpmlink() {
    	return eightpmlink;
        }
	public WebElement ClickSubjectcombo() {
    	return subjectcombo;
        }
	public WebElement Selectother() {
    	return other;
        }
	public WebElement Endtimedropdown() {
    	return endtime;
        }
	public WebElement EnterNinepm() {
    	return ninepm;
        }

	public WebElement Clicksave() {
    	return save;
        }
	
	public WebElement ClickFourpm() {
    	return fourpm;
        }

public WebElement ClickSevenpm() {
	return sevenpm;
    }
public WebElement ClickRecurrence() {
	return recurrence;
    }

public WebElement ClickWeekly() {
	return weekly;
    }

public WebElement RecurrenceEndDate() {
	return recurrenceenddate;
    }
public WebElement Date() {
	return date;
    }

public WebElement ClickRecurrencesave() {
	return recurrencesave;
    }
public WebElement EnterintoTab() {
	return tab;
    }
public WebElement Customizemytab() {
	return customizemytab;
    }
public WebElement SelectChatter() {
	return chatter;
    }
public WebElement AddChatter() {
	return addchatter;
    }
public WebElement RemoveChatter() {
	return removechatter;
    }
public WebElement SaveTab() {
	return savetab;
    }

}

