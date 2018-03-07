package scripts;

import org.testng.annotations.Test;

import pom.ActiTIMELoginPage;

public class Test_verifyVersion extends BaseTest {

	@Test
	public void testVerifyVersion()
	{
		ActiTIMELoginPage lp = new ActiTIMELoginPage(driver);
		lp.verifyVersion("actiTIME 2017.8");
	}
}
