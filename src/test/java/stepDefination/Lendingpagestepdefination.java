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
import pageobject.Landingpage;
import util.testcontextsetup;

public class Lendingpagestepdefination {
public 	WebDriver driver;
public String landingpageproductName;
public String offerpageProductName;
testcontextsetup testcontextsetup;
Landingpage landingpage;
	
//spring frameworl EJB
public  Lendingpagestepdefination(testcontextsetup testcontextsetup) 
{
	
	this.testcontextsetup=testcontextsetup;
	this.landingpage = testcontextsetup.pageobjectmanager.getlandinpage();
}
@Given("User is on greenCart Landing page")
	public void user_is_on_greencart_landing_page() 
{

	Assert.assertTrue(landingpage.getTitlelandingpage().contains("GreenKart"));

	}

@When("^user search with shortName (.+) and extracted actual name of product$")
	public void user_search_with_shortname_and_extracted_actual_name_of_product(String shortName) throws InterruptedException {
	
	
	landingpage.searchitem(shortName); 
	Thread.sleep(2000);
	testcontextsetup.landingpageproductName =landingpage.getproductname().split("-")[0].trim();

	System.out.println(testcontextsetup.landingpageproductName + "is extracted from home page");
	
	}
@When("Added {string} items of the selected product to cart")
public void Added_items_product(String quantity)
{
	landingpage.incrementQuantity(Integer.parseInt(quantity)); 
	landingpage.addtoCart();

}


} 
