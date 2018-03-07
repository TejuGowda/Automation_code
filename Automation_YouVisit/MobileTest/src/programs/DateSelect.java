package programs;


import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DateSelect {

	public static void main(String[] args) throws InterruptedException 
	{
		
		//selecting the date 
		Format formatter = new SimpleDateFormat("dd"); 
	    String date = formatter.format(new Date());
	    int num = Integer.parseInt(date)+1;
	    System.out.println(num);
	    
	    System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='hp-widget__depart']")).click();
	    Thread.sleep(1000);
	    String xpath = "(//div[@class='dateFilter hasDatepicker']//a[text()='"+num+"'])[1]";
	    System.out.println(xpath);
	    
	    driver.findElement(By.xpath(xpath)).click();
	  
    }
}


