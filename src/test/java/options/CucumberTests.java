package options;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {
				"pretty",
				"junit:target/junit/cucumber.xml",
				"html:buildReports/pretty/cucumber-pretty"
		},
		glue = {"stepdefs"},
		tags = {"@VerifyIcon"},
		features = {"src/test/features"})

public class CucumberTests {

}


