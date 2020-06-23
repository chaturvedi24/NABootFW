package TNG_Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.ControlGroupPage;
import pageObjects.DatepickerPage;
import pageObjects.JQueryHPage;

public class DatePicker_Test {

    WebDriver driver;
    String baseUrl;
    JQueryHPage jQueryHPage;
    DatepickerPage datepickerPage;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver","C:\\IJProjs\\NAAutoBoot\\chromedriver.exe");
        baseUrl = "https://jqueryui.com/";
        driver = new ChromeDriver();
        jQueryHPage = new JQueryHPage(driver);
        datepickerPage = new DatepickerPage(driver);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void selectDateTest() throws InterruptedException {
        jQueryHPage.clickDatePicker();
        jQueryHPage.switchFrame();
        datepickerPage.clickDatePick();
//        System.setProperty("date","5");
       // datepickerPage.getAllDates("4");
        datepickerPage.getAllDates(System.getProperty("date"));
        Thread.sleep(5000);
    }

}
