package Runner;

import io.cucumber.junit.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/Features",
        glue = {"Steps"},
        tags = "",
        plugin = {"pretty", "html:Reports/cucumber.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        publish = true)
public class Runner extends AbstractTestNGCucumberTests {
}
