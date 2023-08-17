package util;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageobject.Pageobjectmanager;

public class testcontextsetup {

	public 	WebDriver driver;
	public String landingpageproductName;
	public Pageobjectmanager pageobjectmanager;
	public Testbase testbase;
	public Genericutils genericutils;
	
	
	public testcontextsetup () throws IOException
	{
		testbase = new Testbase();
		pageobjectmanager = new Pageobjectmanager(testbase.WebDriverManager());
		genericutils = new  Genericutils(testbase.WebDriverManager());
		
	}
	
}
