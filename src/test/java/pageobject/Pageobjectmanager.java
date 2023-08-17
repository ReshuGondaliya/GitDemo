package pageobject;

import org.openqa.selenium.WebDriver;

public class Pageobjectmanager {
	public Landingpage landingpage;
	public  Offerpage  offerpage;
	public WebDriver driver;
	public Checkoutpage checkoutpage;
	
	public Pageobjectmanager(WebDriver driver) 
	{
		this.driver= driver;
	}
	public Landingpage getlandinpage() {
		 landingpage = new Landingpage(driver);
		 return  landingpage;
	}
	public Offerpage Offerpage()
	{
		offerpage = new Offerpage(driver);
		 return offerpage;
	}
	public Checkoutpage getCheckoutpage()
	{
	checkoutpage = new Checkoutpage(driver);
		 return checkoutpage;
	}
	

}
