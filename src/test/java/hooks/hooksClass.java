package hooks;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;

import driverInstance.drivers;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class hooksClass extends drivers {
	
	@Before
	public void browserLaunch(Scenario scenario) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1080");
		driver = new ChromeDriver(options);
	    driver.manage().window().maximize();
	    
	    

	    // Determine the URL based on the scenario's tags
	    if (scenario.getSourceTagNames().contains("@deleteUser")) {
	        driver.get("http://192.168.99.141:3000/home");
	    } else {
	        driver.get("http://192.168.99.141:3000/");
	    }
	}
	
	@After
	public void quitBrowser() {
		 driver.quit();
	}

}
