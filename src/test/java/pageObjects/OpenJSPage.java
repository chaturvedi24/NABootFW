package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenJSPage {

    public OpenJSPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "email")
    WebElement email;

    @FindBy(name = "password")
    WebElement password;

    public void setValue(String field, String value) {
        if (field.equals("email")) {
            email.clear();
            email.sendKeys(value);
        } else {
            password.clear();
            password.sendKeys(value);
        }
    }
}
