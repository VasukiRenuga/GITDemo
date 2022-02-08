package com.training.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.basepage.BasePage;

public class ContactsPage extends BasePage{

	public ContactsPage(WebDriver driver) {
		super(driver);

	}
	@FindBy(xpath ="//a[@title='Contacts Tab']")
	WebElement contacts;
	
	@FindBy(xpath="//input[@title='New']")
	WebElement newcontacts;
	
	@FindBy(xpath="//input[@name='name_lastcon2']")
	WebElement contactlastname;
	
	@FindBy(xpath="//input[@name='con4']")
	WebElement contactaccountname;
	
	@FindBy(xpath="//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")
    WebElement savenewcontact;
			
	@FindBy(xpath ="//form[@name='filter_element']//a[2]")
	WebElement createnewview;
	
	@FindBy(xpath ="//input[@name='fname']")
	WebElement viewname;
	
	@FindBy(xpath ="//input[@name='devname']")
	WebElement viewuniquename;
	
	@FindBy(xpath ="//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")
	WebElement savecontacts;
	
	@FindBy(xpath ="//select[@title='Display Selection']")
	WebElement recentlycreated;
	
	@FindBy(xpath ="//tbody/tr[2]/th[1]/a[1]")
	WebElement recentcontactname;
	
	@FindBy(xpath ="//*[@id='editPage']/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[2]/div/div[2]")
	WebElement errormessage;
	
	@FindBy(xpath ="//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/input[2]")
	WebElement cancelbutton;
	
	@FindBy(xpath ="//input[@name='name_lastcon2']")
	WebElement lastname;
	
	@FindBy(xpath ="//input[@name='con4']")
	WebElement accountname;
	
	@FindBy(xpath ="//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/input[2]")
	WebElement saveandnewbutton;
	
	
	public WebElement EnterContacts() {
    	return contacts;
        }
	public WebElement NewContacts() {
    	return newcontacts;
        }
	public WebElement EnterContactslastname() {
    	return contactlastname;
        }
	public WebElement EnterContactsAccountname() {
    	return contactaccountname;
        }
	public WebElement SaveNewContacts() {
    	return savenewcontact;
        }

	public WebElement CreateNewviewLink() {
    	return createnewview;
        }
	public WebElement EnterViewname() {
    	return viewname;
        }
	public WebElement EnterViewUniquename() {
    	return viewuniquename;
        }
	public WebElement SaveContacts() {
    	return savecontacts;
        }
	public WebElement Recentlycreateddropdown() {
    	return recentlycreated;
        }
	public WebElement RecentContactName() {
    	return recentcontactname;
        }
	public WebElement Errormessage() {
    	return errormessage;
        }
	public WebElement ClickcancelButton() {
    	return cancelbutton;
        }
	public WebElement EntertheLastname() {
    	return lastname;
        }
	public WebElement EntertheAccountname() {
    	return accountname;
        }
	public WebElement ClickSaveAndNew() {
    	return saveandnewbutton;
        }

}
