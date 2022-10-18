package com.My_Maven_Projects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.pom_objects.Adactin_Hotel_Objects;
import com.properties.Hotel_Details;

public class Runner extends All_Methods {
	public static WebDriver driver = open_Chrome();
	public static Adactin_Hotel_Objects ADH = new Adactin_Hotel_Objects(driver);

	public static void main(String[] args) throws IOException {
		String url = Hotel_Details.Details().hotel().url();
		launch_url(url);
//FIRST PAGE
		String name = Hotel_Details.Details().hotel().name();
		pass_Keys(ADH.Hotel_Object_Class1().getName(), name);
		String password = Hotel_Details.Details().hotel().password();
		pass_Keys(ADH.Hotel_Object_Class1().getPassword(), password);
		press(ADH.Hotel_Object_Class1().getClick());
//SECOND PAGE   
		String location = Hotel_Details.Details().hotel().location();
		select(ADH.Hotel_Object_Class2().getB1(), location);
		String hotel = Hotel_Details.Details().hotel().hotel();
		select(ADH.Hotel_Object_Class2().getB2(), hotel);
		int room = Hotel_Details.Details().hotel().room();
		select1(ADH.Hotel_Object_Class2().getB3(), room);
		String members = Hotel_Details.Details().hotel().members();
		select(ADH.Hotel_Object_Class2().getB4(), members);
		String checkin = Hotel_Details.Details().hotel().checkin();
		pass_Keys(ADH.Hotel_Object_Class2().getB5(), checkin);
		String checkout = Hotel_Details.Details().hotel().checkout();
		pass_Keys(ADH.Hotel_Object_Class2().getB6(), checkout);
		String adult = Hotel_Details.Details().hotel().adult();
		select(ADH.Hotel_Object_Class2().getB7(), adult);
		String child = Hotel_Details.Details().hotel().child();
		select(ADH.Hotel_Object_Class2().getB8(), child);
		press(ADH.Hotel_Object_Class2().getB9());
		// THIRD PAGE
		press(ADH.Hotel_Object_Class3().getR());
		press(ADH.Hotel_Object_Class3().getC1());
//FOURTH PAGE
		String firstname = Hotel_Details.Details().hotel().firstname();
		pass_Keys(ADH.Hotel_Object_Class4().getB10(), firstname);
		String lastname = Hotel_Details.Details().hotel().lastname();
		pass_Keys(ADH.Hotel_Object_Class4().getB11(), lastname);
		String address = Hotel_Details.Details().hotel().address();
		pass_Keys(ADH.Hotel_Object_Class4().getB12(), address);
		String cardnum = Hotel_Details.Details().hotel().cardnum();
		pass_Keys(ADH.Hotel_Object_Class4().getB13(), cardnum);
		select1(ADH.Hotel_Object_Class4().getB14(), 1);
		select1(ADH.Hotel_Object_Class4().getB15(), 4);
		select(ADH.Hotel_Object_Class4().getB16(), "2022");
		String cvv = Hotel_Details.Details().hotel().cvv();
		pass_Keys(ADH.Hotel_Object_Class4().getB17(), cvv);
		press(ADH.Hotel_Object_Class4().getB18());
	}
}