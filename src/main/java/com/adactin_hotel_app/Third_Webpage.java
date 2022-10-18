package com.adactin_hotel_app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Third_Webpage {
	public static WebDriver driver;
	@FindBy(id="radiobutton_0")
	WebElement r;
	@FindBy(id="continue")
	WebElement c1;
	public Third_Webpage(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver2,this);
	}
	public WebElement getR() {
		return r;
	}
	public WebElement getC1() {
		return c1;
	}
}
