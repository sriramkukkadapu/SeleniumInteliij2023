package utils;

import PageObjects.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObjects.LoginPage;

public class Base  {
    public WebDriver driver;
    public Helpers helpers;
    public HomePage homePage;
    public LoginPage loginPage;

    public Base() {
//        openApp();
    }

    public void openApp(){
        driver = new ChromeDriver();
        helpers = new Helpers(driver);
        homePage = new HomePage(driver);
        loginPage = new LoginPage(this);

        driver.get("https://www.google.com");
        //return driver;
    }

    public WebDriver getDriver(){
        return this.driver;
    }

    public void closeApp(){
        driver.quit();
    }
}
