package util;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class Genericutils {
	public 	WebDriver driver;
	
	public Genericutils(WebDriver driver){
		
		this.driver= driver;
	}
	
	public void switchwindowtochild()
	{
		Set<String> s1= driver.getWindowHandles();
		Iterator<String> i1=s1.iterator();
		String parentWindow =i1.next();
		String childWindow = i1.next();
	    driver.switchTo().window(childWindow);
	}

}
