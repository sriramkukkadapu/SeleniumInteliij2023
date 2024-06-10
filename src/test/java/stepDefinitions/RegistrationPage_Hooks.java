package stepDefinitions;

import org.openqa.selenium.WebDriver;
import utils.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationPage_Hooks { //extends Base

    WebDriver driver;

    public RegistrationPage_Hooks(Base base){
        this.driver = base.getDriver();
    }

    @When("User clicks sign up button")
    public void user_clicks_sign_up_button() {
        driver.get("https://www.linkedin.com");
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
    }
    @Then("User should be able to view the Registration page")
    public void user_should_be_able_to_view_the_registration_page() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
    }

}
