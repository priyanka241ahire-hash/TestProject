package TestRunnerFile;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
                features = "classpath:features",
                glue = "com.vtiger.CucumberFramework.stepDefinitions", 
                plugin = { "pretty","html:target/cucumber-reports/cucumber-pretty", 
                           "json:target/cucumber-reports/CucumberTestReport.json",
                           "rerun:target/cucumber-reports/rerun.txt" },
                monochrome = true)

public class TestRunner {

}