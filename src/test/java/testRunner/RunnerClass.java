package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features = "src/test/resources/feature5_registerNewUser.feature", 

// {"src\\test\\resources\\feature1_login.feature", 
					// 	"src\\test\\resources\\feature2_addInsurance.feature"}, 
				glue = {"stepDefinition", "hooks"}, 
				snippets = SnippetType.CAMELCASE, 
				plugin = {"pretty", "json:target\\cucumber.json", 
									"html:target\\htmlreport.html"},
				dryRun = false, 
				tags = "@AllScenarios"
				)
public class RunnerClass extends AbstractTestNGCucumberTests 
{


}
