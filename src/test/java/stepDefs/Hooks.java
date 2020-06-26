package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import managers.DriverMgr;
import org.openqa.selenium.WebDriver;

public class Hooks {

    WebDriver driver;

    @Before
    public void setUp(){
        driver = DriverMgr.getDriver();
        String baseUrl = "https://jqueryui.com/";
        driver.manage().window().maximize();
        driver.get(baseUrl);
        System.out.println("inside @Before Hook");
    }

    @After
    public void tearDown() {
        driver.quit();
        System.out.println("inside @After Hook");
    }

}
