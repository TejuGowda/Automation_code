package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class GoogleMaps1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		/*WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("maps");
		WebElement element = driver.findElement(By.id("lst-ib"));
		element.sendKeys(Keys.ENTER);
		driver.findElement(By.linkText("Google Maps")).click();
		driver.findElement(By.id("searchboxinput")).sendKeys("Ann Arbor");
	    WebElement place = driver.findElement(By.id("searchboxinput"));
	    place.sendKeys(Keys.ENTER);
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//div[@class='section-hero-header white-foreground']/button")).click();
*/
	    /*irefoxProfile profile = new FirefoxProfile();
	    
	    profile.setPreference("browser.download.folderList", 2); 
	    profile.setPreference("browser.download.dir","E:/Teju/");
	    //profile.setPreference("browser.helperApps.neverAsk.saveToDisk" , "
"); 
	    profile.setPreference("browser.helperApps.neverAsk.saveToDisk" , "[A-Za-z0-9]*");
	    
	    
	    FirefoxOptions options = new FirefoxOptions();
	    options.setProfile(profile);
	    
	    WebDriver driver = new FirefoxDriver(options);
	    driver.get("http://www.seleniumhq.org/download/");
	    
	    driver.findElement(By.xpath("//td[text()='Java']/../td[4]/a")).click();*/
	    
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=13.0_1");
		driver.findElement(By.id("filestyle-0")).sendKeys("E:\\abc.txt");
	}
}
