package com.My_Maven_Projects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class alert extends All_Methods {
	public static void main(String[] args) throws IOException {
		open_Chrome();
		launch_url("https://www.leafground.com/alert.xhtml;jsessionid=node0131txp28c60sx1smk9rvlmvsqu29572.node0");
		WebElement B1 = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]"));
		Alert_One(B1, "accept");
		WebElement B2 = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]"));
		Alert_One(B2, "dismiss");
		WebElement B3 = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]"));
		Alert_Keys(B3, "DONE");
		TS("C:\\Users\\SRIDHAR GUNASEKARAN\\eclipse-workspace\\My_Maven_Projects\\Screenshot//ALERT.PNG");

	}
}
