package stepDefination;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.Checkoutpage;
import pageobject.Landingpage;
import util.testcontextsetup;

public class Checkoutpagestepdefination {
public 	WebDriver driver;
public String landingpageproductName;
public String offerpageProductName;
public Checkoutpage checkoutpage;
testcontextsetup testcontextsetup;
	
//spring frameworl EJB
public  Checkoutpagestepdefination(testcontextsetup testcontextsetup) {
	
	this.testcontextsetup=testcontextsetup;
	this.checkoutpage = testcontextsetup.pageobjectmanager.getCheckoutpage();
}

@Then("verify user has ability to enter promo code and place the order")
public void verify_user_has_ability_to_enter_promo()
{

	Assert.assertTrue(checkoutpage.verifypromoButton());
	Assert.assertTrue(checkoutpage.verifyplaceOrder());
}
@Then("^user proceeds to checkout and validate the (.+) items in checkout page$")
public void user_proceeds_to_checkout(String name) throws InterruptedException
{
	
	checkoutpage.CheckoutItems();
	Thread.sleep(1000);
}



} 
