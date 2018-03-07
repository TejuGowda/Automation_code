package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class ActiTIMELoginPage {

	@FindBy(id="username")
	private WebElement UNTB;
	
	@FindBy(name="pwd")
	private WebElement PWTB;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	@FindBy(xpath = "//span[contains(text(),'Username or Password is invalid.')]")
	private WebElement errMsg;
	
	@FindBy(xpath="//nobr[contains(text(),'actiTIME 2017.4')]")
	private WebElement version;
	
	public ActiTIMELoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setUsername(String username)
	{
		UNTB.sendKeys(username);
	}
	
	public void setPassword(String password)
	{
		PWTB.sendKeys(password);
	}
	
	public void clickOnLoginButton()
	{
		loginButton.click();
	}
	
	public void verifyErrorMessage()
	{
		boolean flag=false;
		try{
			flag = errMsg.isDisplayed();
		}
		catch(Exception e)
		{
			Reporter.log("element is not present");
		}
		
		Assert.assertTrue(flag);
	}
	
	public void verifyVersion(String expectedVersion)
	{
		
		Assert.assertEquals(version.getText(), expectedVersion);
	}
}
