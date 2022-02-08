package com.training.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import com.training.basepage.BasePage;

public class LeadsPage extends BasePage{

	public LeadsPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath ="//a[@title='Leads Tab']")
	WebElement leads;
	
	@FindBy(xpath ="//select[@title='View:']")
	WebElement listhandledropdown;
	
	@FindBy(xpath ="//input[@title='Go!']")
	WebElement leadsgo;
	
	@FindBy(xpath ="//input[@title='New']")
	WebElement clicknew;
	
	@FindBy(xpath ="//input[@name='name_lastlea2']")
	WebElement lastname;
	
	@FindBy(xpath ="//input[@name='lea3']")
	WebElement companyname;
	
	@FindBy(xpath ="//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")
	WebElement saveleads;
	
	public WebElement EnterLeads() {
    	return leads;
        }
	public WebElement ListhandleDropdown() {
    	return listhandledropdown;
        }
	public WebElement ClickLeadsGo() {
    	return leadsgo;
        }
	public WebElement ClickNew() {
    	return clicknew;
        }
	public WebElement EnterLastName() {
    	return lastname;
        }
	public WebElement EnterCompanyName() {
    	return companyname;
        }
	public WebElement ClickSaveLeads() {
    	return saveleads;
        }



}
