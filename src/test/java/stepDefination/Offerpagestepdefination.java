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
import pageobject.Offerpage;
import pageobject.Pageobjectmanager;
import util.testcontextsetup;

public class Offerpagestepdefination {
	
public String offerpageProductName;	
public testcontextsetup testcontextsetup;
public Pageobjectmanager pageobjectmanager;
	

	public  Offerpagestepdefination(testcontextsetup testcontextsetup) {
		
		this.testcontextsetup=testcontextsetup;
	}



@Then("^user searched for (.+) shortName in offers page$")
	public void user_searched_for_shortname_in_offers_page(String shortName) throws InterruptedException {
	
	switchtoofferpage(); 
	Offerpage offerpage = testcontextsetup.pageobjectmanager.Offerpage();
//	Offerpage offerpage =new Offerpage(testcontextsetup.driver);
	System.out.println(shortName);
	offerpage.searchitem(shortName);

	System.out.println("hello");
	Thread.sleep(2000);
	offerpageProductName = offerpage.getproductname();
	System.out.println(offerpageProductName);
	
	
	}

public void switchtoofferpage() {
	

	
	Landingpage landingpage = testcontextsetup.pageobjectmanager.getlandinpage();

	landingpage.selecttopdealspage();
	testcontextsetup.genericutils.switchwindowtochild();
	
	
	}
@And("validate productName in offers page  matches  with landing page")
    public void validate_productname_in_offers_page(){
//	String ln = testcontextsetup.landingpageproductName.split("-")[0].trim();
//	System.out.println(ln);
	Assert.assertEquals(offerpageProductName, testcontextsetup.landingpageproductName );
//	Assert.assertEquals(offerpageProductName, ln );
}

} 
