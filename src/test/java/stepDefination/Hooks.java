package stepDefination;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import util.testcontextsetup;

public class Hooks {

	testcontextsetup Testcontextsetup;
	public Hooks(testcontextsetup Testcontextsetup)
	{
		this.Testcontextsetup =Testcontextsetup;
	}
	
	@After
	public void Afterscenario() throws IOException
	{
	Testcontextsetup.testbase.WebDriverManager().quit();
	}
	
	@AfterStep
	public void AddScreenshot(Scenario scernario) throws IOException
	{
		WebDriver driver =Testcontextsetup.testbase.WebDriverManager();
		
		if(scernario.isFailed())
		{
			File sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
			scernario.attach(fileContent, "image/png", "image");
		}
	}
}
