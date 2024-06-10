package PageObjects;

import org.openqa.selenium.By;
import utils.Base;
import utils.Helpers;

public class LoginPage {
//    WebDriver driver;
    Helpers helpers;
    public LoginPage(Base base) {
//        this.driver = base.driver;
        this.helpers = base.helpers;
    }

    By menu = By.xpath("//menu");

    By queryTxt = By.xpath("//textarea[@name='q']");

    public void enterTextInQueryTxt(String text){
        helpers.type(queryTxt,text);
    }

}
