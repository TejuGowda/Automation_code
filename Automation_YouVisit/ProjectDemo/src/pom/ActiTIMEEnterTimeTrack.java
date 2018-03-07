package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ActiTIMEEnterTimeTrack {

	@FindBy(id="logOutLink")
	private WebElement logoutLink;
	
	public ActiTIMEEnterTimeTrack(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnlogoutLink()
	{
		logoutLink.click();
	}
	public void verifylogoutLink()
	{
		boolean flag = false;
		try{
			flag = logoutLink.isDisplayed();
		}
		catch(Exception e)
		{
			
		}
		
		Assert.assertTrue(flag);
	}
}
