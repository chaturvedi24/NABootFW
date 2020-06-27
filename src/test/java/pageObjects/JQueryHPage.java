package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JQueryHPage {
    WebDriver jQDriver;

    public JQueryHPage(WebDriver driver) {
        jQDriver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='Controlgroup']")
    WebElement controlGroup;

    @FindBy(xpath = "//a[text()='Datepicker']")
    WebElement datepicker;

    @FindBy(className = "demo-frame")
    WebElement frame;

    @FindBy(xpath = "//a[text()='Checkboxradio']")
    WebElement checkboxradio;

    public void clickCheckboxRadio() {
        checkboxradio.click();
    }

    public void clickCtrlGroup () {
        controlGroup.click();
    }

    public void clickDatePicker () {
        datepicker.click();
    }

    public void switchFrame() {
        jQDriver.switchTo().frame(frame);
    }
}
