package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.Base;
import utils.Helpers;


public class UpdateUser_Hooks {

    WebDriver driver;
    Helpers helpers;
    User user;
    Base base;
//    LoginPage loginPage;

    public UpdateUser_Hooks(Base base){
        this.driver = base.getDriver();
        this.helpers = base.helpers;
        this.base = base;
//        this.loginPage = base.loginPage;
    }


    @When("Update phone no {string} of a user phone with {string}")
    public void update_phone_no_of_a_user_phone_with(String phoneno, String emailid) {
        User user = (User) base.get(emailid);
        user.setPhoneNo(phoneno);
        System.out.println("Updated phone no");
    }

}
