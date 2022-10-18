package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Adactin_Hotel_Properties {
	public static Properties p;
	
	public Adactin_Hotel_Properties() throws IOException {
		File f =new File("C:\\Users\\SRIDHAR GUNASEKARAN\\eclipse-workspace\\My_Maven_Projects\\src\\main\\java\\com\\properties\\Hotel.properties");
		FileInputStream file=new FileInputStream(f);
	    p = new Properties();
	    p.load(file);
	}
	
	public String url() {
		String url = p.getProperty("url");
		return url;
	}
	public String name() {
		String name = p.getProperty("name");
		return name;
	}
	public String password() {
		String password = p.getProperty("password");
		return password;
	}
	public String location() {
		String location_B1 = p.getProperty("location_B1");
		return location_B1;
	}
	public String hotel() {
		String hotel_B2 = p.getProperty("hotel_B2");
		return hotel_B2;
	}
	public int room() {
		String room_B3 = p.getProperty("room_B3");
		int parseInt = Integer.parseInt(room_B3);
		return  parseInt;
	}
	public String members() {
		String members_B4 = p.getProperty("members_B4");
		return members_B4;
	}
	public String checkin() {
		String checkin_B5 = p.getProperty("checkin_B5");
		return checkin_B5;
	}
	public String checkout() {
		String ckeckout_B6 = p.getProperty("checkout_B6");
		return ckeckout_B6;
	}
	public String adult() {
		String adult_B7 = p.getProperty("adult_B7");
		return adult_B7;
	}
	public String child() {
		String child_B8 = p.getProperty("child_B8");
		return child_B8;
	}
	public String firstname() {
		String firstname_B10 = p.getProperty("firstname_B10");
		return firstname_B10;
	}
	public String lastname() {
		String lastname_B11 = p.getProperty("lastname_B11");
		return lastname_B11;
	}
	public String address() {
		String address_B12 = p.getProperty("address_B12");
		return address_B12;
	}
	public String cardnum() {
		String cardnum_B13 = p.getProperty("cardnum_B13");
		return cardnum_B13;
	}
	
	public String cvv() {
		String cvv17 = p.getProperty("cvv_B17");
		return cvv17;
	}
	
	
	
	
	
	
	
	
	
	
	

}
