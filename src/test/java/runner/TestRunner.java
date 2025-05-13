package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/ShareTestdata.feature", // LoggedInUser.feature
        glue = {
                "stepDefinitions",
//                "utils.Hooks",
                "utils"
        },
        plugin = {"pretty", "json:target/jsonReports/report.json", "html:target/localHTMLReports/report.html"},
        dryRun = false
)

public class TestRunner {

}
