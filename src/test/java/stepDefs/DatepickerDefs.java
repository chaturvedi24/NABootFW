package stepDefs;

import io.cucumber.java.en.When;
import managers.DriverMgr;
import org.openqa.selenium.WebDriver;
import pageObjects.DatepickerPage;

public class DatepickerDefs {


    @When("I validate date selection")
    public void date_selection(){
        WebDriver driver = DriverMgr.getDriver();
        DatepickerPage datepickerPage = new DatepickerPage(driver);
        System.out.println("inside date selection");
        datepickerPage.clickDatePick();
        datepickerPage.getAllDates("15");
    }
}
