package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public String hamburgermenu = "//*[@id='menuToggle']/input";

    By menu = By.xpath("//menu");



}
