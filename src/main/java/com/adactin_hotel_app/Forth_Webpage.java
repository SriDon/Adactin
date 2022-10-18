package com.adactin_hotel_app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forth_Webpage {
	public static WebDriver driver;
	@FindBy(id="first_name")
    WebElement b10;
	@FindBy(id="last_name")
	WebElement b11;
	@FindBy(id="address")
	WebElement b12;
	@FindBy(id="cc_num")
	WebElement b13;
	@FindBy(id="cc_type")
	WebElement b14;
	@FindBy(id="cc_exp_month")
	WebElement b15;
	@FindBy(id="cc_exp_year")
	WebElement b16;
	@FindBy(id="cc_cvv")
	WebElement b17;
	@FindBy(id="book_now")
	WebElement b18;
	@FindBy(id="my_itinerary")
	WebElement b19;
	public Forth_Webpage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2,this);
	}
	public WebElement getB10() {
		return b10;
	}
	public WebElement getB11() {
		return b11;
	}
	public WebElement getB12() {
		return b12;
	}
	public WebElement getB13() {
		return b13;
	}
	public WebElement getB14() {
		return b14;
	}
	public WebElement getB15() {
		return b15;
	}
	public WebElement getB16() {
		return b16;
	}
	public WebElement getB17() {
		return b17;
	}
	public WebElement getB18() {
		return b18;
	}
	public WebElement getB19() {
		return b19;
	}
}
