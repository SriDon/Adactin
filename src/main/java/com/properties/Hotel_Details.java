package com.properties;

import java.io.IOException;

public class Hotel_Details {
	
	private Hotel_Details () {
		
	}
	
	public static Hotel_Details Details() {
		Hotel_Details HD=new  Hotel_Details ();
		 return HD;
	}
	
	
	public  Adactin_Hotel_Properties hotel () throws IOException {
		Adactin_Hotel_Properties AHP= new Adactin_Hotel_Properties();
		return AHP;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
