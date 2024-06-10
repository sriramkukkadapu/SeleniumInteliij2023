package DriverTest;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenDriver {

    public static void main(String args[]){

        try {
            System.out.println("Current JVM version - " + System.getProperty("java.version"));
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.google.co.in");

            Dimension newDimension = new Dimension(800, 1200);
            driver.manage().window().setSize(newDimension);

            Thread.sleep(3000);
            driver.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
