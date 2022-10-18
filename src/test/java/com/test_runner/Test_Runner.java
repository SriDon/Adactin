package com.test_runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.My_Maven_Projects.All_Methods;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\SRIDHAR GUNASEKARAN\\eclipse-workspace\\My_Maven_Projects\\src\\test\\java\\com\\cucumber\\Adactin.cucumber", glue = "com.stepdefanition", plugin = {
		"com.cucumber.listener.ExtentCucumberFormatter:sri/hd.html" })
public class Test_Runner {
	public static WebDriver driver;

	@BeforeClass
	public static void start_up() {
		driver = All_Methods.open_Chrome();
	}

	@AfterClass
	public static void ending() {
		All_Methods.close_window();
	}

}
