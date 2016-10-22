package modules;

import org.openqa.selenium.WebDriver;

import helpers.Log;
import pageobjects.LehmanCollegeHomePage;

public class PartnershipsAction {
	public static void Execute(WebDriver driver) throws Exception{
		LehmanCollegeHomePage.partnerships.click();
		Log.info("Click action is perfromed on Partnerships link");
		}

}
