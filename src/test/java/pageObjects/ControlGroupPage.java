package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ControlGroupPage {

    public ControlGroupPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='widget']/h1")
    WebElement header;

    @FindBy(css = "#horizontal-spinner")
    WebElement numCars;

    @FindBy(css = "div.ui-helper-clearfix>span>a.ui-spinner-down")
    WebElement down;

    @FindBy(css = "div.ui-helper-clearfix>span>a.ui-spinner-up")
    WebElement up;

    public void clickUp() {
        up.click();
    }

    public void clickdown() {
        down.click();
    }

    public String getNumCars () {
        return numCars.getAttribute("aria-valuenow");
    }

    public String headerText() {
        return header.getText();
    }
}
