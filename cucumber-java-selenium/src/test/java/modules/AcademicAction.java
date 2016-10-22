package modules;

import org.openqa.selenium.WebDriver;

import helpers.Log;
import pageobjects.LehmanCollegeHomePage;

public class AcademicAction {
	public static void Execute(WebDriver driver) throws Exception{
	LehmanCollegeHomePage.academics.click();
	Log.info("Click action is perfromed on Academics link");
	}
}
