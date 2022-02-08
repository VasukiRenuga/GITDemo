package com.training.page;

import java.beans.Visibility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.training.basepage.BasePage;



public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "/html/body/div/div[1]/table/tbody/tr/td[3]/div/div[3]/div/div/div[1]/div[1]")
	WebElement usermenu;
	
	@FindBy(xpath = "//a[@title='My Profile']")
	WebElement myprofile;
	
	@FindBy(xpath = "//*[@title='Edit Profile'][@alt='Edit Profile']")
	WebElement edit;
	
	@FindBy(id="contactInfoContentId")
	WebElement profileiframe;
	
	@FindBy(xpath = "//ul[@role='tablist']//li[1]//a[1]")
	WebElement about;
	
	@FindBy(xpath = "//input[@name='lastName']")
	WebElement lastname;
	
	@FindBy(xpath = "//input[@value='Save All']")
	WebElement saveall;

	@FindBy(xpath = "//li[@label='TextPost']//span[1]")
	WebElement post;
	
	@FindBy(xpath = "//iframe[@title='Rich Text Editor, publisherRichTextEditor']")
	WebElement postiframe;
	
	@FindBy(xpath = "/html/body")
	WebElement posttext;
	
	@FindBy(xpath = "//input[@title='Share']")
	WebElement share;
	
	@FindBy(xpath = "//li[@label='ContentPost']//span[1]")
	WebElement file;
	
	@FindBy(xpath = "//a[@title='Upload a file from your computer']")
	WebElement uploadfile;
	
	@FindBy(xpath = "//input[@name='chatterFile']")
	WebElement choosefile;
	
	@FindBy(xpath = "//input[@title='Share']")
	WebElement fileshare;
	
	@FindBy(id="displayBadge")
	WebElement moderator;
	
	@FindBy(xpath="//a[@id='uploadLink']")
	WebElement AddPhotolink;
	
	@FindBy(xpath="//iframe[@id='uploadPhotoContentId']")
	WebElement uploadPhotoContentId;
	
	@FindBy(id="j_id0:uploadFileForm:uploadInputFile")
	WebElement choosephotofile;
	
	@FindBy(id="j_id0:j_id7:save")
	WebElement savephoto;
	
	@FindBy(id="j_id0:uploadFileForm:uploadBtn")
	WebElement savephotofile;
	
	@FindBy(xpath="//a[@id='deletePhoto']")
	WebElement deletephoto;

    @FindBy(xpath="//a[@title='My Settings']")
	WebElement mysettings;
	
	@FindBy(xpath="//a[@href=\"javascript:HTMLTreeNode.prototype.toggleHTMLTree('PersonalInfo');\"]")
	WebElement personal;
	
	@FindBy(xpath="//tbody//div//div//div//div[8]//a[1]//span[1]")
	WebElement loginhistory;
	
	@FindBy(xpath="//tbody//tr//a[@href=\"javascript:HTMLTreeNode.prototype.toggleHTMLTree('DisplayAndLayout');\"]//span[2]")
	WebElement displayandlayout;

	@FindBy(xpath="//div[3]//div[1]//div[1]//a[1]//span[1]")
	WebElement customize;
	
	@FindBy(xpath="//*[@id=\'p4\']")
	WebElement customapp;
	
	@FindBy(xpath="//select[@name='duel_select_0']")
	WebElement availabletabs;
	
	@FindBy(xpath="//img[@title='Add']")
	WebElement add;
	
	@FindBy(xpath="//input[@title='Save']")
	WebElement save;
	
	@FindBy(xpath="//tbody//tr//a[@href=\"javascript:HTMLTreeNode.prototype.toggleHTMLTree('EmailSetup');\"]//span[2]")
	WebElement email;
	
	@FindBy(xpath="//tbody//div//div//div[4]//div[1]//div[1]//a[1]//span[1]")
	WebElement myemail;
	
	@FindBy(xpath="//input[@name='sender_name']")
	WebElement myemailname;

	@FindBy(xpath="//input[@name='sender_email']")
	WebElement myemailid;
	
	@FindBy(xpath="//tbody/tr[7]/td[2]/div[1]/input[1]")
	WebElement radiobutton;
	
	@FindBy(xpath="//input[@title='Save']")
	WebElement emailsave;
	
	@FindBy(xpath="//*[@id=\"CalendarAndReminders_font\"]")
	WebElement calendarandreminders;
	
	@FindBy(xpath="//div[6]//div[1]//div[2]//a[1]//span[1]")
	WebElement reminders;
	
	@FindBy(xpath="//input[@title='Open a Test Reminder']")
	WebElement taskreminder;
	
	@FindBy(xpath="//a[@title='Developer Console (New Window)']")
	WebElement developerconsole;
	
	@FindBy(xpath="//a[@title='Logout']")
	WebElement logout;


	public WebElement enterintoUsermenu() {
		return usermenu;
		}
	public WebElement enterintomyprofile() {
		return  myprofile;
}
	public WebElement enterintoedit() {
	    return  edit;
}
	public WebElement enterintoprofileiframe() {
		return  profileiframe;
}
   public WebElement enterintoabout() {
	    return  about;
	}
   public WebElement ClearLastname() {
	    return  lastname;
	}
   public WebElement EnterLastname() {
	    return  lastname;
	}
   public WebElement MyProfileSave() {
		return  saveall;
	}
   public WebElement enterintopost() {
		return  post;
   }
		public WebElement enterintopostiframe() {
			return  postiframe;
			
	}
        public WebElement enterintopostText() {
		    return posttext ;
		}
		public WebElement ClickPostShare() {
		    return share ;
		}
		public WebElement Clickonfile() {
		    return file ;
		}
		public WebElement Uploadingfile() {
		    return uploadfile ;
		}
		public WebElement Choosefile() {
		    return choosefile ;
		}
		public WebElement ClickFileShare() {
		    return fileshare ;
		}
		public WebElement MouseoverModerator() {
		    return moderator;
		    	
		    	}
		 public WebElement ClickAddPhotolink() {
		    	return AddPhotolink;
		    }
		 public WebElement uploadPhotoContentIdiframe() {
		    	return 	uploadPhotoContentId;
		    }
		 public WebElement Choosephotofile() {
			    return choosephotofile ;
		    }
		 public WebElement Savephotofile() {
			    return savephotofile ;
		    }
		 
		 public WebElement Savephoto() {
			    return savephoto ;
		    }
		 public WebElement Deletephoto() {
			    return deletephoto ;
		    }

		    	
		public WebElement enterintomysettings() {
		return  mysettings;
	}
	public WebElement enterintopersonal() {
		return  personal;
	}
	public WebElement enterintologinhistory() {
		return  loginhistory;
	}
	public WebElement enterintodisplayandlayout() {
		return  displayandlayout;
	}
	public WebElement enterintocustomizemytab() {
		return  customize;
	}
	public WebElement enterintocustomapp() {
		return  customapp;
		
	}
	public WebElement availabletabs() {
		return  availabletabs;
	}
	public WebElement clickadd() {
		return  add;
	}
	
	public WebElement clicksave() {
		return  save;
	}
	public WebElement enterintoemail() {
		return  email;
	}
	public WebElement enterintomyemailsettings() {
		return  myemail;
	}
	public WebElement enteremailname() {
	return  myemailname;
	}
	public WebElement enteremailid() {
		return  myemailid;
	}
	public WebElement Radiobutton() {
		return  radiobutton;
	}
	public WebElement clickemailsave() {
		return  emailsave;
	}
	public WebElement enterintoCalendarandReminders() {
		return calendarandreminders;
	}
	public WebElement enterintoActivityReminders() {
		return reminders;
	}
	public WebElement ClickopenaTestReminder() {
		return taskreminder;
	}
	public WebElement enterintoDeveloperConsole() {
		return developerconsole;
	}
	public WebElement enterintologout() {
		return  logout;
	}

}

	
	

