package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import managers.AutomationContext;
import managers.DriverMgr;
import managers.ScenarioMgr;
import org.openqa.selenium.WebDriver;

public class Hooks {

    WebDriver driver;
    AutomationContext context;

    public Hooks(AutomationContext context) {
        this.context = context;
    }

    @Before
    public void setUp(Scenario scenario){
        DriverMgr.initDriver();
        driver = DriverMgr.getDriver();
        String baseUrl = "https://jqueryui.com/";
        driver.manage().window().maximize();
        driver.get(baseUrl);
        context.getScenarioMgr().setScenario(scenario);
        System.out.println("inside @Before Hook");
    }

    @After
    public void tearDown(Scenario scenario) {
        driver.quit();
        System.out.println("inside @After Hook");
    }

}
