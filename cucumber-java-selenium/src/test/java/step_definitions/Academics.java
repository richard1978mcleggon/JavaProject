package step_definitions;
//package modules;

import static org.testng.AssertJUnit.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import modules.AcademicAction;
import modules.PartnershipsAction;
import pageobjects.AcademicsPage;
import pageobjects.LehmanCollegeHomePage;
import pageobjects.PartnershipsPage;


public class Academics {
public WebDriver driver;
    
    public Academics()
    {
    	driver = Hooks.driver;
    }
    
    @When("^I navigate to lehman college website$")
    public void navigate_to_website() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.get("http://www.lehman.cuny.edu/");
    }
    
    @And("^I navigate to academics page$")
    public void navigate_to_academics_page() throws Throwable {
    	PageFactory.initElements(driver, LehmanCollegeHomePage.class);
		PageFactory.initElements(driver, AcademicsPage.class);

		AcademicAction.Execute(driver);
    }
    
    @And("^I navigate to partnerships page$")
    public void navigate_to_partnerships_page() throws Throwable {
    	PageFactory.initElements(driver, LehmanCollegeHomePage.class);
		PageFactory.initElements(driver, PartnershipsPage.class);

		PartnershipsAction.Execute(driver);
    }
    
    @And("^I validate page title \"([^\"]*)\" and URL \"([^\"]*)\"$")
    public void verify_title_url(String title, String url) throws Throwable {
    	 assertEquals(title,driver.getTitle());
         assertEquals(url,driver.getCurrentUrl());
    }
}
