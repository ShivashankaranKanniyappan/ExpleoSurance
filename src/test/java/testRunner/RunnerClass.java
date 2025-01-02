package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions(
				features = "src\\test\\resources\\loginScenario.feature", 
								glue = {"stepDefinition", "hooks"},
//				snippets = SnippetType.CAMELCASE, 
				plugin = {"pretty", "html:target/reports.html"},
				dryRun = false
				)

public class RunnerClass  //extends AbstractTestNGCucumberTests // 
{

	
}
