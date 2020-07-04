package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import managers.AutomationContext;
import managers.DriverMgr;
import managers.ScenarioMgr;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
       // String baseUrl = "https://jqueryui.com/";
        driver.manage().window().maximize();
        driver.get(context.getConfigReader().getPropertyValue("baseURL"));
        context.getScenarioMgr().setScenario(scenario);
        System.out.println("inside @Before Hook");
    }

    @After
    public void tearDown(Scenario scenario) {
        scenario.log(" getID: "+scenario.getId());
        scenario.log("getName:"+scenario.getName());
        scenario.log("getLine:"+scenario.getLine());
        scenario.log("getSourceTagNames:"+scenario.getSourceTagNames());
        scenario.log("getUri:"+scenario.getUri());
        scenario.log("getStatus:"+scenario.getStatus());
        scenario.log("isFailed:"+scenario.isFailed());
        byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/jpeg", "");
        driver.quit();
        System.out.println("inside @After Hook");
    }

}
