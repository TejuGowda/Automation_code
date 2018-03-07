package scripts;

import org.testng.annotations.Test;

import pom.ActiTIMELoginPage;

public class Test_InvalidLogin extends BaseTest {

	@Test
	public void testInvalidLogin()
	{
		ActiTIMELoginPage lp = new ActiTIMELoginPage(driver);
		lp.setUsername("sdsd");
		lp.setPassword("sdff");
		lp.clickOnLoginButton();
		lp.verifyErrorMessage();
	}
}
