package stepDefinations;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import java.util.List;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefination {

    @Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
    	
    	System.out.println("navigated to login url");
      
    }

    @Given("^validate the browser$")
    public void validate_the_browser() throws Throwable {
    	System.out.println("deciding browser to open");
    }

    @When("^Browser is triggerd$")
    public void browser_is_triggerd() throws Throwable {
    	System.out.println("Browser is triggered");
    }

    @Then("^check if browser is started$")
    public void check_if_browser_is_started() throws Throwable {
    	System.out.println("Browser is started");
    }

    @And("^cards displayed are\"([^\"]*)\"$")
    public void cards_displayed_aresomething(String strArg1) throws Throwable {
        
    }

    @And("^cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_something(String strArg1) throws Throwable {
        
    }


    @When("^user login into application with user name and password$")
    public void user_login_into_application_with_user_name_and_password() throws Throwable {
        System.out.println("Logged in success");
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	
    	System.out.println("validated home page");
    
    }
       

    
    @When("^user login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_and_password(String arg1, String arg2) throws Throwable {
        
    	System.out.println(arg1);
    	System.out.println(arg2);
    	
    }
    
  
    

    @When("^user sign up with following details$")
    public void user_sign_up_with_following_details(DataTable data) throws Throwable {
    List<List<String>> obj=data.raw();
    System.out.println(obj.get(0).get(0));
    System.out.println(obj.get(0).get(1));
    System.out.println(obj.get(0).get(2));
    System.out.println(obj.get(0).get(3));
    System.out.println(obj.get(0).get(4));
    }
    
    @When("^user login in to application with (.+) and (.+)$")
    public void user_login_in_to_application_with_and(String Username, String Password) throws Throwable {
     System.out.println(Username);
     System.out.println(Password);
    	
    	
    	
    	
    	
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}