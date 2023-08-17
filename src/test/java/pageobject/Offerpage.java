package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Offerpage {

	
		public WebDriver driver;
		
		private By search = By.xpath("//input[@type='search']");
		private By productname =By.cssSelector("tbody tr td:nth-child(1)");
		
		

		public Offerpage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver= driver;
		}

		public void searchitem(String shortName) {
			// TODO Auto-generated method stub
		   driver.findElement(search).sendKeys(shortName);
		}
		public String getsearchtext() {
			// TODO Auto-generated method stub
			return driver.findElement(search).getText();
		}
		

		public String getproductname() {
			// TODO Auto-generated method stub
			return driver.findElement(productname).getText();
		}

	}

