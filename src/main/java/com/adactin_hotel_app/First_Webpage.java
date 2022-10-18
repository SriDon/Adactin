package com.adactin_hotel_app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class First_Webpage {
	public WebDriver driver;
	@FindBy(xpath="//*[@id='username']")
	WebElement name;
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	@FindBy(xpath="//input[@type='Submit']")
	WebElement click;
	
	public First_Webpage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2,this); 
	}
	public WebElement getName() {
		return name;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getClick() {
		return click;
	}
}
