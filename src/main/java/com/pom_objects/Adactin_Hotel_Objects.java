package com.pom_objects;

import org.openqa.selenium.WebDriver;

import com.adactin_hotel_app.First_Webpage;
import com.adactin_hotel_app.Forth_Webpage;
import com.adactin_hotel_app.Second_Webpage;
import com.adactin_hotel_app.Third_Webpage;

public class Adactin_Hotel_Objects{
	public  WebDriver driver;
   private First_Webpage p1;
   private  Second_Webpage p2;
   private  Third_Webpage p3;
   private  Forth_Webpage p4;
   

	public Adactin_Hotel_Objects(WebDriver driver2) {
	this.driver=driver2;
}
	public  First_Webpage Hotel_Object_Class1 () {
		  p1=new First_Webpage(driver);
		return p1;
	}
	public  Second_Webpage Hotel_Object_Class2 () {
		 p2=new Second_Webpage(driver);
		return p2;
	}
	public  Third_Webpage Hotel_Object_Class3 () {
		 p3=new Third_Webpage(driver);
		return p3;
	}
	public  Forth_Webpage Hotel_Object_Class4 () {
		 p4=new Forth_Webpage(driver);
		return p4;
	}
	
	
	
	
	
	
}

