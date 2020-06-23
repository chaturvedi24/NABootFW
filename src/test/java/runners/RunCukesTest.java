package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) // Instructs junit to run this class as a Cucumber test runner
@CucumberOptions(
        dryRun = false, // executes the features and validates whether features exist without failing
        features = "classpath:features", //location of the features file folder
        glue = {"stepDefs"}, //location of the step definition classes
        //tags = "@multiparams or @doublequoteparams or @doublequoteparam1 or @wordparam", //to run multiple tags
        tags = "@practice",
        plugin = {"pretty","html:target/cucumber.html", "json:target/cucumber.json"}
)
public class RunCukesTest {
}
