package programs;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.internal.TouchAction;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Test {
	public static AppiumDriver androidDriver;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		//AppiumDriverLocalService service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().usingDriverExecutable(new File("C:\\Program Files\\nodejs\\node.exe")).withAppiumJS(new File("r")).withLogFile(new File("./AppiumServerlog.txt")));
		//service.start();
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion","6.0.1");
		capabilities.setCapability("deviceName", "27d0e054");
		//capabilities.setCapability("appPackage", "com.android.chrome");
		//capabilities.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		capabilities.setCapability("browserName", "chrome");
		androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		androidDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		androidDriver.get("http://www.youvisit.com/tour/stonybrook");
		System.out.println(androidDriver);
		try {
			System.out.println("inside try block");
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(androidDriver);
		WebElement ele = androidDriver.findElement(By.xpath("//div[text()='Continue in browser']"));
		ele.click();
		androidDriver.findElement(By.xpath("//a[text()='start']")).click();
		androidDriver.findElement(By.xpath("//div[@title='I am a *']")).click();
		androidDriver.findElement(By.xpath("//div[text()='Prospective']")).click();
		androidDriver.findElement(By.xpath("//*[@item-value=\"hs_grad\"]")).click();
		androidDriver.findElement(By.xpath("//*[@id=\"registration-firstname\"]/div[1]/input")).sendKeys("Teju");
		androidDriver.findElement(By.xpath("//*[@id=\"registration-lastname\"]/div[1]/input")).sendKeys("J Gowda");
		androidDriver.findElement(By.xpath("//*[@id=\"registration-email\"]/div[1]/input")).sendKeys("example@gmail.com");
		androidDriver.findElement(By.xpath("//*[@id=\"registration-enrollyear\"]/div[1]/select")).sendKeys("2009");
	
		androidDriver.findElement(By.xpath("//*[@id=\"registration-gender\"]/div[1]/select")).click();
		androidDriver.findElement(By.xpath("//*[contains(text(), 'Male')]")).click();
		androidDriver.findElement(By.xpath("//*[@title='Date of Birth *']/input")).click();;
		Thread.sleep(1000);
		
		//androidDriver.findElement(By.xpath("//android.widget.Button[text()='Cancel']")).isDisplayed();
		
		/*androidDriver.findElement(By.className("android.widget.Image")).click();
		Thread.sleep(500);
		androidDriver.findElement(By.id("android:id/button1")).click();
		WebElement inputField = androidDriver.findElement(By.xpath("//input[@type='date']"));
		JavascriptExecutor exec = (JavascriptExecutor)androidDriver;
		exec.executeScript("arguments[0].setAttribute('value', '06/02/2018')", inputField);
		//System.out.println(androidDriver.currentActivity());
		 * 
		*/
		
	io.appium.java_client.TouchAction f=new io.appium.java_client.TouchAction(androidDriver);
		f.press(816, 1560).release().perform();
				
				
	  	
	}
}
