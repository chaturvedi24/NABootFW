package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import managers.AutomationContext;
import managers.DriverMgr;
import managers.ExcelHelper;
import pageObjects.OpenJSPage;

import java.util.ArrayList;
import java.util.HashMap;

import static managers.ExcelHelper.readInputExcel;

public class OpenjsDefs {

    AutomationContext context;

    OpenJSPage openJSPage = new OpenJSPage(DriverMgr.getDriver());

    public OpenjsDefs(AutomationContext context){
        this.context=context;
    }

    @And("^I read property (\\w+)$")
    public void read_prop(String key){
        context.getScenarioMgr().getScenario().log(key+":property value="+context.getConfigReader().getPropertyValue(key));
    }

    @And("^I set (\\w+) to \"(.*)\"$")
    public void set_values(String field, String valueKey) throws InterruptedException {
        openJSPage.setValue(field, context.getConfigReader().getPropertyValue(valueKey));
        Thread.sleep(5000);
    }


    @Given("I login with excel file")
    public void iLoginWithExcelFile() {
        ArrayList<HashMap<String, String>> validationData = ExcelHelper.readInputExcel();
        for(HashMap<String, String> eachRow: validationData) {
            context.getScenarioMgr().getScenario().log("Data:"+eachRow);
            openJSPage.setValue("email", eachRow.get("email"));
            openJSPage.setValue("password", eachRow.get("password"));
        }
    }
}
