package com.training.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.training.basepage.BasePage;

public class AccountPage extends BasePage {

	public AccountPage(WebDriver driver) {
		super(driver);
		
	} 

	@FindBy(xpath = "//a[@title='Accounts Tab']")
	WebElement account;
	
	@FindBy(xpath = "/html/body/div[2]/div[1]/div/a")
	WebElement closepop;
	
	@FindBy(xpath ="//tbody/tr/td/div/div[1]/div[1]/div[1]/div[1]")
	WebElement createnew;
	
	@FindBy(xpath ="//tbody/tr/td/div/div/div/div/div[2]/a[3]")
	WebElement newaccount ;
	
	@FindBy(xpath ="//input[@name='acc2']")
	WebElement accountname ;
	
	@FindBy(xpath ="//select[@name='acc6']")
	WebElement typedropdown ;
	
	@FindBy(xpath ="//*[@id=\'editPage\']/div[1]/table/tbody/tr/td[2]/input[3]")
	WebElement deleteaccount ;

	@FindBy(xpath ="//select[@name='00N5f000006iJHc']")
	WebElement customerpriority ;
	
	@FindBy(xpath ="//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")
	WebElement saveaccount ;
	
	@FindBy(xpath ="//form[@name='filter_element']//a[2]")
	WebElement createnewview ;
	
	@FindBy(xpath ="//input[@name='fname']")
	WebElement viewname;
	
	@FindBy(xpath ="//input[@name='devname']")
	WebElement uniquename;
	
	@FindBy(xpath ="//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")
	WebElement saveview;
	
	@FindBy(xpath ="//select[@title='View:']")
	WebElement viewdropdown;
	
	@FindBy(xpath ="//tbody/tr[1]/td[2]/div[2]/form[1]/div[1]/span[1]/span[2]/a[1]")
	WebElement edit;
	
	@FindBy(xpath ="//input[@name='fname']")
	WebElement editviewname;
	
	@FindBy(xpath ="//select[@title='Search By 1']")
	WebElement filterfield;

	@FindBy(xpath ="//select[@title='Operator 1']")
	WebElement operator;

	@FindBy(xpath ="//input[@title='Value 1']")
	WebElement value;
	
	@FindBy(xpath ="//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")
	WebElement saveedit;
	
	@FindBy(xpath ="//li[4]//span[1]//a[1]")
	WebElement merge;
	
	@FindBy(xpath ="//input[@name='srch']")
	WebElement find;
	
	@FindBy(xpath ="//tbody/tr/td/form[@name='stageForm']/div/div/div/input[2]")
	WebElement findaccount;
	
	@FindBy(xpath ="//input[@title='Select row 0']")
	WebElement radiobutton1;

	@FindBy(xpath ="//input[@title='Select row 1']")
	WebElement radiobutton2;

	@FindBy(xpath ="//input[@title='Select row 2']")
	WebElement radiobutton3;
	
	@FindBy(xpath="//tbody/tr/td/form[@name='stageForm']/div/div/div[1]/div[1]/input[1]")
	WebElement next;
	
	@FindBy(xpath="//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[5]/div[1]/input[2]")
	WebElement mergeaccount;
	
	@FindBy(xpath ="//tbody/tr/td/div/div/div/ul/li[2]/a[1]")
	WebElement lastactivity;
	
	@FindBy(xpath ="//img[@id='ext-gen148']")
	WebElement datefield;
	
	@FindBy(xpath ="//body/div[15]/div[1]/div[3]")
	WebElement createddate;

	@FindBy(xpath ="//tbody//div[3]//img[1]")
	WebElement calenderstartdate;
	
	@FindBy(xpath ="//button[normalize-space()='Today']")
	WebElement todaystartdate;
	
	
	@FindBy(xpath ="//div[4]//img[1]")
	WebElement calendarenddate;
	
	@FindBy(xpath ="//body[1]/div[17]/ul[1]/li[1]/div[1]/table[1]/tbody[1]/tr[3]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/em[1]/button[1]")
	WebElement todayenddate;
	
	@FindBy(xpath ="//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/em[1]/button[1]")
	WebElement savecreatedate;
	
	@FindBy(xpath ="//input[@name='reportName']")
	WebElement reportname;

	@FindBy(xpath ="//input[@name='reportDevName']")
	WebElement reportuniquename;

	@FindBy(xpath ="//button[normalize-space()='Save and Run Report']")
	WebElement saveandrun;

    public WebElement enterintoAccount() {
		return account;
	}
	public WebElement clickclosepop() {
		return closepop;
	}
	public WebElement CreatenewAccount() {
		return createnew;
	}
	public WebElement ClickAccount() {
		return newaccount;
	}
	public WebElement enterAccountName() {
		return accountname;
	}
	public WebElement enterintoTypeDropdown() {
		return typedropdown;
	}
	public WebElement deleteAccountName() {
		return deleteaccount;
	}
	public WebElement enterintoCustomerPriority() {
		return customerpriority;
	}
	public WebElement ClickAccountSave() {
		return saveaccount;
	}
	public WebElement enterintocreateNewView() {
		return createnewview;
	}

	public WebElement enterViewName() {
		return viewname;
	}
	public WebElement enterUniqueName() {
		return uniquename;
	}
	public WebElement SaveCreatenewview() {
		return saveview;
	}
	public WebElement ClickViewDropdown() {
		return viewdropdown;
	}
	public WebElement ClickEdit() {
		return edit;
	}
	public WebElement EnterEditviewname() {
		return editviewname;
	}

	public WebElement SelectFilterField() {
		return filterfield;
	}
	public WebElement SelectOperator() {
		return operator;
	}

	public WebElement Selectvalue() {
		return value;
	}
	public WebElement SaveEditview() {
		return saveedit;
	}
	public WebElement ClickMergeaccount() {
		return merge;
	}
	
	public WebElement Enternameoftheaccount() {
		return find;
	}
	public WebElement ClickFindAccount() {
		return findaccount;
	}
	public WebElement ClickRadiobutton1() {
		return radiobutton1;
	}
	public WebElement ClickRadiobutton2() {
		return radiobutton2;
	}
	public WebElement ClickRadiobutton3() {
		return radiobutton3;
	}
	public WebElement ClickNext() {
		return  next;
	}
	public WebElement ClickMerge() {
		return  mergeaccount;
	}
	public WebElement Accountwithlastactivity() {
		return  lastactivity;
	}
	public WebElement Datefielddropdown() {
		return  datefield;
	}
	public WebElement ClickCreateDate() {
		return  createddate;
		}
		public WebElement CalendarStartdate() {
		return  calenderstartdate;
	}
	public WebElement TodayStartdate() {
		return  todaystartdate;
	}
			
		public WebElement CalendarEnddate() {
			return  calendarenddate;
		}
		public WebElement TodayEnddate() {
			return  todayenddate;
		}

	
	public WebElement SaveCreatedate() {
		return  savecreatedate;
	}
	public WebElement EnterreportName() {
		return  reportname;
	}
	public WebElement EnterReportUniqueName() {
		return  reportuniquename;
	}
	public WebElement ClicksaveandRun() {
		return  saveandrun;
	}
















	
}



