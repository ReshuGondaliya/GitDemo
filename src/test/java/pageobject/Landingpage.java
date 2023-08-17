package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Landingpage {
	public WebDriver driver;
	
	By search = By.xpath("//input[@type='search']");
	By productname =By.cssSelector("h4.product-name");
	By todeals =By.linkText("Top Deals");
	By increment = By.cssSelector("a.increment");
	By addtocart =By.cssSelector(".product-action button");
	
	

	public Landingpage(WebDriver driver) {
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
	
	public void incrementQuantity(int quantity) {
		int i = quantity-1;
				while(i>0)
				{
			
					driver.findElement(increment).click();
					i--;
				}
	}
	public void addtoCart()
	{
		driver.findElement(addtocart).click();;
	}
	

	public String getproductname() {
		// TODO Auto-generated method stub
		return driver.findElement(productname).getText();
	}
	public void selecttopdealspage() {
		// TODO Auto-generated method stub
		 driver.findElement(todeals).click();
	}
	
	

	public String getTitlelandingpage() {
		// TODO Auto-generated method stub
		return driver.getTitle();
	}

}
