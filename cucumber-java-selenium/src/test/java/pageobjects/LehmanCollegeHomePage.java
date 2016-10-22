package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LehmanCollegeHomePage extends BaseClass{
	public LehmanCollegeHomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(how=How.LINK_TEXT, using="ACADEMICS")
	public static WebElement academics;
	
	@FindBy(how=How.LINK_TEXT, using="PARTNERSHIPS")
	public static WebElement partnerships;

}
