package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.xml.XmlTest;

public class BaseTest {
  
   public WebDriver driver;
   
  @BeforeMethod
  @Parameters("browser")
  public void preCondition(String browser) {
	//  String browser = xmltest.getParameter("browser");
	  
	  System.out.println(browser);
	  if(browser.equalsIgnoreCase("GC"))
	  {
	  System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	  driver = new ChromeDriver();
	  }
	  else
	  {
	  System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	  driver = new FirefoxDriver();
	  }
	  driver.manage().window().maximize();
	  driver.get("https://demo.actitime.com/login.do");
	  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
  }

  @AfterMethod
  public void afterCondition() {
	  driver.close();
  }

}
