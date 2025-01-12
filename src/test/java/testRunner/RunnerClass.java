package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
		features = "src/test/resources",
		glue = {"stepDefinition", "hooks"}, 
		snippets = SnippetType.CAMELCASE, 
		plugin = {"pretty", "json:target/cucumber.json", 
							"html:target/htmlreport.html"},
		tags = "@All_Scenarios",
		dryRun = false,
		monochrome = true

		)
public class RunnerClass extends AbstractTestNGCucumberTests 
{


}
