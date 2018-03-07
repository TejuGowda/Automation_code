package scripts;

import org.testng.annotations.Test;

import pom.ActiTIMEEnterTimeTrack;
import pom.ActiTIMELoginPage;

public class Test_ValidLogin extends BaseTest {

	@Test
	public void testvalidLogin()
	{
		ActiTIMELoginPage lp = new ActiTIMELoginPage(driver);
		lp.setUsername("admin");
		lp.setPassword("manager");
		lp.clickOnLoginButton();
		ActiTIMEEnterTimeTrack ep = new ActiTIMEEnterTimeTrack(driver);
		ep.verifylogoutLink();
	}
}
