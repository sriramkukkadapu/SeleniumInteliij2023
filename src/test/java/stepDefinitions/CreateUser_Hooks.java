package stepDefinitions;

import PageObjects.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.Base;
import utils.Context;
import utils.Helpers;



public class CreateUser_Hooks {

    WebDriver driver;
    Helpers helpers;
    User user;
    Base base;

//    LoginPage loginPage;

    public CreateUser_Hooks(Base base){
        this.driver = base.getDriver();
        this.helpers = base.helpers;
        this.base = base;
//        this.loginPage = base.loginPage;
    }

    @Given("User is getting created")
    public void user_is_getting_created() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User is getting created");
    }

    @When("Create a new user with {string}, {string}, {string}")
    public void create_a_new_user_with(String firstname, String emailid, String phoneno) {
        // Write code here that turns the phrase above into concrete actions
        user = new User();
        user.setFirstName(firstname);
        user.setEmailId(emailid);
        user.setPhoneNo(phoneno);
        base.put(emailid,user);
    }

//    @Then("Print user to console")
//    public void print_user_to_console() {
//        // Write code here that turns the phrase above into concrete actions
//        System.out.println(user.toString());
//    }

    @Then("Print user with email id {string} to console")
    public void print_user_with_email_id_to_console(String emailid) {
        System.out.println(base.get(emailid).toString());
    }




}
