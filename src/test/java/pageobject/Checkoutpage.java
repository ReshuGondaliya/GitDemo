package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Checkoutpage {
	public WebDriver driver;
	

	public Checkoutpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver= driver;
	}
	
	By cartBag = By.cssSelector("img[alt='Cart']");
	By checkoutButton=By.cssSelector("div[class='cart-preview active'] button[type='button']");
	By promoButton =By.cssSelector(".promoBtn");
	By placeOrder = By.xpath("(//button[normalize-space()='Place Order'])[1]");
	
	public void CheckoutItems()
	{
		driver.findElement(cartBag).click();
		driver.findElement(checkoutButton).click();
	}
	
	public Boolean verifypromoButton()
	{
		return driver.findElement(promoButton).isDisplayed();
	}

	public Boolean verifyplaceOrder()
	{
		return driver.findElement(placeOrder).isDisplayed();
	}

}

