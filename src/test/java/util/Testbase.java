package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testbase {
	
	public 	WebDriver driver;
	
	public WebDriver WebDriverManager() throws IOException
	{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resorces\\global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url=prop.getProperty("QAUrl");
		String browser_properties = prop.getProperty("browser");
		String browser_maven =System.getProperty("browser");
		
		String browser = browser_maven!=null? browser_maven :  browser_properties;
		
		if(driver==null)
		{
			if(browser.equalsIgnoreCase("chrome"))
			{
				
		System.setProperty("Webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resorces\\local.lnk");
	    driver = new ChromeDriver();
			}
			if(browser.equalsIgnoreCase("firefox"))
			{
				System.setProperty("Webdriver.gecko.driver", "C:\\Users\\Public\\Desktop\\Firefox.lnk");
			    driver = new FirefoxDriver();
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	   driver.get(url);
		}
	   return driver;
	   
	}

}
