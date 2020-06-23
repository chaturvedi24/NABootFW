package TNG_Tests;

import managers.DriverMgr;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.DatepickerPage;
import pageObjects.JQueryHPage;

public class DatePickerBonigarcia_Test {

    WebDriver driver;
    String baseUrl;
    JQueryHPage jQueryHPage;
    DatepickerPage datepickerPage;

    @BeforeClass
    public void setup() {
        //System.setProperty("webdriver.chrome.driver","C:\\IJProjs\\NAAutoBoot\\chromedriver.exe");
        baseUrl = "https://jqueryui.com/";
       // WebDriverManager.firefoxdriver().setup();
       // driver = new FirefoxDriver();
        driver = DriverMgr.getDriver();
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
