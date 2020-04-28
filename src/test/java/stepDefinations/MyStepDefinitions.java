package stepDefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import pageObjects.HomePage;

import java.sql.Driver;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Cucumber.Automation.Base;

@RunWith(Cucumber.class)
public class MyStepDefinitions {
	public WebDriver driver;
	HomePage h;


	@Given("^User is on Greencart landing page$")
	public void user_is_on_greencart_landing_page() throws Throwable {
        driver=Base.getDriver();
		
	}

	@When("^User search for \"([^\"]*)\" vegetable$")
	public void user_search_for_something_vegetable(String strArg1) throws Throwable {
		
		h=new HomePage(driver);
       h.getSearch().sendKeys(strArg1);
		Thread.sleep(3000);
	}

	@Then("^\"([^\"]*)\" results are displayed$")
	public void something_results_are_displayed(String strArg1) throws Throwable {

		Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(strArg1));

	}
	@Then("^Verify selected \"([^\"]*)\" iteams are displayed in check out page$")
    public void verify_selected_something_iteams_are_displayed_in_check_out_page(String strArg1) throws Throwable {
	 Assert.assertTrue(driver.findElement(By.cssSelector("p.product-name")).getText().contains(strArg1));
    }

	    @And("^Added items to cart$")
	    public void added_items_to_cart() throws Throwable {
	        driver.findElement(By.cssSelector("a.increment")).click();
	        driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
	    }

	    @And("^User proceeded to checkout page for purchge$")
	    public void user_proceeded_to_checkout_page_for_purchge() throws Throwable {
	        driver.findElement(By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]")).click();
	        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
	    }

}
