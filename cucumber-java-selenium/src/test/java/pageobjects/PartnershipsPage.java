package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PartnershipsPage extends BaseClass{
	public PartnershipsPage(WebDriver driver){
		super(driver);
	}  
	
	@FindBy(how=How.ID, using="email")
	public static WebElement email;

}
