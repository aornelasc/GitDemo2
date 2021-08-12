package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefinition
{
	@Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable 
	{
		System.out.println("User is on NetBanking landing page");
       
    }

	@When("^User logins into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_logins_into_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable 
	{
       
		System.out.println("User logins into application with "+ strArg1 +" and " +strArg2);
    }


    @Then("^Home page is populate$")
    public void home_page_is_populate() throws Throwable
    {
    	System.out.println("Home page is populate");
        
    }

    @And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_something(String strArg1) throws Throwable
    {
       if (strArg1 == "true")
       {
		 System.out.println("Cards are displayed");
       } 
       else 
       {
    	   System.out.println("Cards are not displayed");
       }
    }
    
   
}
