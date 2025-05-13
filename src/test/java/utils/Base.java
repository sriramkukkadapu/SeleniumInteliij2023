package utils;

import PageObjects.HomePage;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObjects.LoginPage;

import java.util.HashMap;

public class Base  {
    public WebDriver driver;
    public Helpers helpers;
    public HomePage homePage;
    public LoginPage loginPage;

    private HashMap<String, Object> data;
    private Scenario scenario;

    public Base() {
//        openApp();
        data = new HashMap<String,Object>();
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

    public void put(String key, Object value){
        data.put(key,value);
    }

    public Object get(String key){
        return data.get(key);
    }

}
