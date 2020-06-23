package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DatepickerPage {

    public DatepickerPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "datepicker")
    WebElement datepick;

    @FindBy(xpath = "//td[@data-handler='selectDay']/a")
    List<WebElement> allDates;

    public void clickDatePick() {
        datepick.click();
    }

    public void getAllDates(String date) {
        for (WebElement eachDate: allDates) {
            if(eachDate.getText().equals(date)) {
                eachDate.click();
                break;
            }
        }
    }
}
