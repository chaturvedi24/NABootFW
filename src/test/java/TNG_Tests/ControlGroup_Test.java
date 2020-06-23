package TNG_Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.ControlGroupPage;
import pageObjects.JQueryHPage;

public class ControlGroup_Test {

    WebDriver driver;
    String baseUrl;
    JQueryHPage jQueryHPage;
    ControlGroupPage controlGroupPage;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver","C:\\IJProjs\\NAAutoBoot\\chromedriver.exe");
        baseUrl = "https://jqueryui.com/";
        driver = new ChromeDriver();
        jQueryHPage = new JQueryHPage(driver);
        controlGroupPage = new ControlGroupPage(driver);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void clickControlGroup() {
        jQueryHPage.clickCtrlGroup();
        jQueryHPage.switchFrame();
        Assert.assertEquals(controlGroupPage.headerText(), "Controlgroup");
    }

}
