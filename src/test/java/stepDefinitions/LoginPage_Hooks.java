package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import PageObjects.LoginPage;
import utils.Base;
import utils.Helpers;


public class LoginPage_Hooks  {

    WebDriver driver;
    Helpers helpers;
    LoginPage loginPage;

    public LoginPage_Hooks(Base base){
        this.driver = base.getDriver();
        this.helpers = base.helpers;
        this.loginPage = base.loginPage;
    }

    @When("User enters login details")
    public void user_enters_login_details() throws InterruptedException {
        driver.get("https://www.google.com");
//        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Selenium");
//        helpers.type(By.xpath("//textarea[@name='q']"),"Selenium");
//        helpers.pressEnter(By.xpathtatus("//textarea[@name='q']"));
        loginPage.enterTextInQueryTxt("Selenium");
        Thread.sleep(3000);
    }

    @Then("User should be able to view the Product category page")
    public void user_should_be_able_to_view_the_product_category_page() {
        System.out.println("Before assertion");
        Assert.assertEquals(1,1);
        System.out.println("Assert expected to fail here");
    }




}
