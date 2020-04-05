import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions (features = "/home/oem/workspace/repositories/apitest_java/src/test/java/features", glue = "stepsDefinition")
public class Runner {

}
