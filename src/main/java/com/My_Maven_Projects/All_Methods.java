package com.My_Maven_Projects;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class All_Methods {

	public static WebDriver driver;

	public static WebDriver open_Chrome() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SRIDHAR GUNASEKARAN\\eclipse-workspace\\My_Maven_Projects\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

	public static void close_window() {
		driver.close();
	}

	public static void launch_url(String URL) {
		driver.get(URL);
	}

	public static void pass_Keys(WebElement element, String details) {
		// element.clear();
		element.sendKeys(details);
	}

	public static void press(WebElement button) {
		button.click();
	}

	public static void select(WebElement dropdown, String i) {
		Select s = new Select(dropdown);
		s.selectByValue(i);
	}

	public static void select1(WebElement dropdown, int selected) {
		Select s = new Select(dropdown);
		s.selectByIndex(selected);
	}

	public static void Alert_One(WebElement press, String type) {
		press.click();
		Alert a = driver.switchTo().alert();
		if (type.equalsIgnoreCase("accept")) {
			a.accept();
		} else if (type.equalsIgnoreCase("dismiss")) {
			a.dismiss();
		}
	}

	public static void Alert_Keys(WebElement pass, String keys) {
		pass.click();
		Alert a = driver.switchTo().alert();
		a.sendKeys(keys);
		Alert a1 = driver.switchTo().alert();
		a1.accept();
	}

	public static void TS(String S) throws IOException {
		TakesScreenshot s = (TakesScreenshot) driver;
		File screenshot = s.getScreenshotAs(OutputType.FILE);
		File Destination = new File(S);
		FileUtils.copyFile(screenshot, Destination);
// PATH - "C:\\Users\\SRIDHAR\\GUNASEKARAN\\eclipse-workspace\\My_Maven_Projects\\Screenshot//anyname.PNG"

	}

}
