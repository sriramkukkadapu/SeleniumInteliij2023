package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Helpers{

    public WebDriver driver;
    WebDriverWait wait;

    public Helpers(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void click(By locator){
        waitForVisible(locator);
        driver.findElement(locator).click();
    }

    public void type(By locator, String input){
        waitForVisible(locator);
        driver.findElement(locator).sendKeys(input);
    }

    public void pressEnter(By locator){
        waitForVisible(locator);
        driver.findElement(locator).sendKeys(Keys.ENTER);
    }

    public void waitForVisible(By locator){
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

}
