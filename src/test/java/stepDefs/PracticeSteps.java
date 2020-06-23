package stepDefs;

import io.cucumber.java.en.When;

public class PracticeSteps {

    @When("^I read parameter \"(.*)\"$")
    public void i_read_param(String param) {
        System.out.println("param is:"+param);
    }

    @When("^I login with \"(.*)\" id and \"(.*)\" password$")
    public void multiparams(String userid, String pass) {
        System.out.println("user id is:"+userid);
        System.out.println("password is:"+pass);
    }

    @When("^I signup with user name \"(.*)\" and email \"([^\"]*)\"$")
    public void multiparams2(String name, String email) {
        System.out.println("name is:"+name);
        System.out.println("email is:"+email);
    }

    @When("^I login with (\\w+) id and (\\w+) password$")
    public void wordparams(String id, String password) {
        System.out.println("id is:"+id);
        System.out.println("password is:"+password);
    }

    @When("^I pass integer (\\d+)$")
    public void intparam(int param) {
        System.out.println("int param is:"+param);
    }

    @When("^I pass double value (\\d+.\\d+)$")
    public void doubleparam(double param) {
        System.out.println("double param is:"+param);
    }

    @When("^I select (Fast|Faster|Medium|Slow|Slower) from the speed drop down$")
    public void limitparams(String param) {
        System.out.println("limited param is:"+param);
    }


}
