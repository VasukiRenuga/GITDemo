package com.training.basepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	    protected WebDriver driver;
		public BasePage(WebDriver driver) {
		 this.driver =driver;
		 PageFactory.initElements(driver, this);
		}
		
		}

	


