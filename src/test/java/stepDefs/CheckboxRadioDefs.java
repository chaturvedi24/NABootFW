package stepDefs;

import io.cucumber.java.en.And;
import managers.AutomationContext;
import managers.DriverMgr;
import org.junit.jupiter.api.Assertions;
import pageObjects.CheckBoxRadioPage;

public class CheckboxRadioDefs {

    AutomationContext context;

    public CheckboxRadioDefs(AutomationContext context) {
        this.context = context;
    }

    CheckBoxRadioPage checkBoxRadioPage = new CheckBoxRadioPage(DriverMgr.getDriver());

    @And("^I validate number of (\\w+) is (\\d+)$")
    public void validate_radios_number(String type, int radios) {
        Assertions.assertEquals(radios,checkBoxRadioPage.elementSize(type));
        System.out.println("completed number of elements validation");
    }

    @And("^I select \"(.*)\" radio button$")
    public void select_radio(String city) throws Throwable {
        Assertions.assertTrue(checkBoxRadioPage.selectRadio(city));
        System.out.println("completed selecting radio");
    }

    @And("^I only select \"(.*)\" radio button$")
    public void selection_only(String city) throws Throwable {
        checkBoxRadioPage.selectRadioOnly(city);
        context.setContextMap("buttonselected", city);
        System.out.println("button selected:"+city);
        context.getScenarioMgr().getScenario().log("button selected:"+city);
    }

    @And("^I validate radiocheckbox selection$")
    public void validateSelection() throws Throwable {
        Assertions.assertFalse(checkBoxRadioPage.validateSelection(context.getContextMap("buttonselected")));
        System.out.println("validated button selection:"+context.getContextMap("buttonselected"));
        context.getScenarioMgr().getScenario().log("validated button selection:"+context.getContextMap("buttonselected"));
    }

}
