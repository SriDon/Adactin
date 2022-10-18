package com.stepdefanition;

import com.My_Maven_Projects.All_Methods;
import com.pom_objects.Adactin_Hotel_Objects;
import com.properties.Hotel_Details;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefanition extends All_Methods {
	Adactin_Hotel_Objects ADH = new Adactin_Hotel_Objects(driver);

	@Given("^user must launch the url$")
	public void user_must_launch_the_url() throws Throwable {
		String url = Hotel_Details.Details().hotel().url();
		launch_url(url);
	}

	@When("^user enter the \"([^\"]*)\" in the username field$")
	public void user_enter_the_in_the_username_field(String username) throws Throwable {
		pass_Keys(ADH.Hotel_Object_Class1().getName(), username);

	}

	@When("^user enter the \"([^\"]*)\" in the password field$")
	public void user_enter_the_in_the_password_field(String pass) throws Throwable {
		pass_Keys(ADH.Hotel_Object_Class1().getPassword(), pass);

	}

	@Then("^user click the enter button And it navigate to the search hotel page$")
	public void user_click_the_enter_button_And_it_navigate_to_the_search_hotel_page() throws Throwable {
		press(ADH.Hotel_Object_Class1().getClick());

	}

	@When("^user select the location in the location field$")
	public void user_select_the_location_in_the_location_field() throws Throwable {
		String location = Hotel_Details.Details().hotel().location();
		select(ADH.Hotel_Object_Class2().getB1(), location);

	}

	@When("^user select the hotels in the hotels field$")
	public void user_select_the_hotels_in_the_hotels_field() throws Throwable {
		String hotel = Hotel_Details.Details().hotel().hotel();
		select(ADH.Hotel_Object_Class2().getB2(), hotel);

	}

	@When("^user select the room type in the room type field$")
	public void user_select_the_room_type_in_the_room_type_field() throws Throwable {
		int room = Hotel_Details.Details().hotel().room();
		select1(ADH.Hotel_Object_Class2().getB3(), room);

	}

	@When("^user select the number of rooms in the number of rooms field$")
	public void user_select_the_number_of_rooms_in_the_number_of_rooms_field() throws Throwable {
		String members = Hotel_Details.Details().hotel().members();
		select(ADH.Hotel_Object_Class2().getB4(), members);

	}

	@When("^user select the check in date in the check in date field$")
	public void user_select_the_check_in_date_in_the_check_in_date_field() throws Throwable {
		String checkin = Hotel_Details.Details().hotel().checkin();
		pass_Keys(ADH.Hotel_Object_Class2().getB5(), checkin);

	}

	@When("^user select the check out date in the check out date field$")
	public void user_select_the_check_out_date_in_the_check_out_date_field() throws Throwable {
		String checkout = Hotel_Details.Details().hotel().checkout();
		pass_Keys(ADH.Hotel_Object_Class2().getB6(), checkout);

	}

	@When("^user select the adults per room in the adults per room field$")
	public void user_select_the_adults_per_room_in_the_adults_per_room_field() throws Throwable {
		String adult = Hotel_Details.Details().hotel().adult();
		select(ADH.Hotel_Object_Class2().getB7(), adult);

	}

	@When("^user select the children per room in the children per room field$")
	public void user_select_the_children_per_room_in_the_children_per_room_field() throws Throwable {
		String child = Hotel_Details.Details().hotel().child();
		select(ADH.Hotel_Object_Class2().getB8(), child);

	}

	@Then("^user click the search button And it navigate to the hotel selecting page$")
	public void user_click_the_search_button_And_it_navigate_to_the_hotel_selecting_page() throws Throwable {
		press(ADH.Hotel_Object_Class2().getB9());

	}

	@When("^user click the radio button in the radio button field$")
	public void user_click_the_radio_button_in_the_radio_button_field() throws Throwable {
		press(ADH.Hotel_Object_Class3().getR());

	}

	@Then("^user click the continue button And it navigate to the hotel booking page$")
	public void user_click_the_continue_button_And_it_navigate_to_the_hotel_booking_page() throws Throwable {
		press(ADH.Hotel_Object_Class3().getC1());

	}

	@When("^user enter first name in the first name field$")
	public void user_enter_first_name_in_the_first_name_field() throws Throwable {
		String firstname = Hotel_Details.Details().hotel().firstname();
		pass_Keys(ADH.Hotel_Object_Class4().getB10(), firstname);

	}

	@When("^user enter last name in the last name field$")
	public void user_enter_last_name_in_the_last_name_field() throws Throwable {
		String lastname = Hotel_Details.Details().hotel().lastname();
		pass_Keys(ADH.Hotel_Object_Class4().getB11(), lastname);

	}

	@When("^user enter billing address in the billing address field$")
	public void user_enter_billing_address_in_the_billing_address_field() throws Throwable {
		String address = Hotel_Details.Details().hotel().address();
		pass_Keys(ADH.Hotel_Object_Class4().getB12(), address);

	}

	@When("^user enter credit card no in the credit card no  field$")
	public void user_enter_credit_card_no_in_the_credit_card_no_field() throws Throwable {
		String cardnum = Hotel_Details.Details().hotel().cardnum();
		pass_Keys(ADH.Hotel_Object_Class4().getB13(), cardnum);

	}

	@When("^user select credit card type in the credit card type field$")
	public void user_select_credit_card_type_in_the_credit_card_type_field() throws Throwable {
		select1(ADH.Hotel_Object_Class4().getB14(), 1);

	}

	@When("^user select expiry month in the expiry month field$")
	public void user_select_expiry_month_in_the_expiry_month_field() throws Throwable {
		select1(ADH.Hotel_Object_Class4().getB15(), 4);

	}

	@When("^user select expiry year in the expiry year field$")
	public void user_select_expiry_year_in_the_expiry_year_field() throws Throwable {
		select(ADH.Hotel_Object_Class4().getB16(), "2022");

	}

	@When("^user enter cvv no in the cvv no  field$")
	public void user_enter_cvv_no_in_the_cvv_no_field() throws Throwable {
		String cvv = Hotel_Details.Details().hotel().cvv();
		pass_Keys(ADH.Hotel_Object_Class4().getB17(), cvv);

	}

	@Then("^click the book now button And it navigate to the booking confirmation page$")
	public void click_the_book_now_button_And_it_navigate_to_the_booking_confirmation_page() throws Throwable {
		press(ADH.Hotel_Object_Class4().getB18());

	}

}