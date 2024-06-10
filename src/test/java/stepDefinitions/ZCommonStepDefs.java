package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.Base;


public class ZCommonStepDefs {

    WebDriver driver;

    public ZCommonStepDefs(Base base) {
        this.driver = base.getDriver();
    }

    @Given("User navigates to login page")
    public void user_navigates_to_login_page() {
        Assert.assertEquals(1, 1);
        driver.get("https://www.facebook2.com");
//        Assert.assertEquals(1,0);
    }



}


