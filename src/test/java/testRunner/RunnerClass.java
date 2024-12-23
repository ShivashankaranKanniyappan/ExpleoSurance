package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
				features = "src\\test\\resources\\addNewInsurace.feature", 
				glue = "stepDefinition",
				snippets = SnippetType.CAMELCASE, 
				plugin = {"pretty", "html:target/reports.html"},
				dryRun = false
				
				)
public class RunnerClass extends AbstractTestNGCucumberTests{

}
