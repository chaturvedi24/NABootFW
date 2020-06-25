package stepDefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class PracticeSteps {

    @When("^I read parameter \"(.*)\"$")
    public void i_read_param(String param) {
        System.out.println("param is:" + param);
    }

    @When("^I login with \"(.*)\" id and \"(.*)\" password$")
    public void multiparams(String userid, String pass) {
        System.out.println("user id is:" + userid);
        System.out.println("password is:" + pass);
    }

    @When("^I signup with user name \"(.*)\" and email \"([^\"]*)\"$")
    public void multiparams2(String name, String email) {
        System.out.println("name is:" + name);
        System.out.println("email is:" + email);
    }

    @When("^I login with (\\w+) id and (\\w+) password$")
    public void wordparams(String id, String password) {
        System.out.println("id is:" + id);
        System.out.println("password is:" + password);
    }

    @When("^I pass integer (\\d+)$")
    public void intparam(int param) {
        System.out.println("int param is:" + param);
    }

    @When("^I pass double value (\\d+.\\d+)$")
    public void doubleparam(double param) {
        System.out.println("double param is:" + param);
    }

    @When("^I select (Fast|Faster|Medium|Slow|Slower) from the speed drop down$")
    public void limitparams(String param) {
        System.out.println("limited param is:" + param);
    }

    @When("^I fill (\\w+) form$")
    public void read_map(String formType, Map<String, String> params) {
        System.out.println("\r\nForm type:" + formType);
        for (Map.Entry<String, String> param : params.entrySet()) {
            System.out.println("key:" + param.getKey());
            System.out.println("value:" + param.getValue());
        }
    }

    @When("^I fill all forms$")
    public void fill_all_forms(DataTable param) {
        List<Map<String, String>> list = param.asMaps(String.class, String.class);
        for (Map<String, String> eachMap : list) {
            System.out.println("\r\n");
            for (Map.Entry<String, String> entry : eachMap.entrySet()) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        }
    }

    @When("^I fill all forms on (\\w+)$")
    public void fill_all_forms(String browser, DataTable param) {
        List<Map<String, String>> list = param.asMaps(String.class, String.class);
        System.out.println("Browser:"+browser);
        for (Map<String, String> eachMap : list) {
            System.out.println("\r\n");
            for (Map.Entry<String, String> entry : eachMap.entrySet()) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        }
    }

}















