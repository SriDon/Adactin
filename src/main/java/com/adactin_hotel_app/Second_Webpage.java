package com.adactin_hotel_app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import jdk.nashorn.internal.runtime.FindProperty;

public class Second_Webpage {
	public static WebDriver driver;
	@FindBy(xpath="(//select[@class='search_combobox'])[1]")
	WebElement b1;
	@FindBy(xpath="(//select[@class='search_combobox'])[2]")
	WebElement b2;
	@FindBy(id="room_type")
	WebElement b3;
	@FindBy(xpath="(//select[@class='search_combobox'])[4]")
	WebElement b4;
	@FindBy(xpath="//input[@name='datepick_in']")
	WebElement b5;
	@FindBy(xpath="//input[@name='datepick_out']")
	WebElement b6;
	@FindBy(xpath="(//select[@class='search_combobox'])[5]")
	WebElement b7;
	@FindBy(xpath="(//select[@class='search_combobox'])[6]")
	WebElement b8;
	@FindBy(id="Submit")
	WebElement b9;
	public Second_Webpage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2,this);
	}
	public WebElement getB1() {
		return b1;
	}
	public WebElement getB2() {
		return b2;
	}
	public WebElement getB3() {
		return b3;
	}
	public WebElement getB4() {
		return b4;
	}
	public WebElement getB5() {
		return b5;
	}
	public WebElement getB6() {
		return b6;
	}
	public WebElement getB7() {
		return b7;
	}
	public WebElement getB8() {
		return b8;
	}
	public WebElement getB9() {
		return b9;
	}

}
