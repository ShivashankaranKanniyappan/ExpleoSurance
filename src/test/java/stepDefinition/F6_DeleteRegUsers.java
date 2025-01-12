package stepDefinition;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverInstance.drivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class F6_DeleteRegUsers extends drivers {
	
	@Given("User should be in expleoHome page")
	public void user_should_be_in_expleo_home_page() throws InterruptedException {
		System.out.println("Entered Home Page");
		Thread.sleep(2000);
	}

	@When("User select the UserDetails and delete")
	public void userSelectTheUserDetailsAndDelete() throws InterruptedException {
		
		WebElement table = driver.findElement(By.xpath("//table[@class='mt-0 border-2 border-white w-max ']")); 
		String text = table.getText();
		System.out.println(text);

        // Get all rows in the table
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        int size = rows.size();
        System.out.println(size);
        
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0, 16000)");
        
        driver.findElement(By.xpath("//td[text()='test211@test.com']/following::td[2][@class='deleteButton']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        WebElement yesButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Yes']")));
  

        Actions act = new Actions(driver);
        act.doubleClick(yesButton).build().perform();
        Thread.sleep(3000);
	}
	
	@Then("It Should be Redirected to HomePage Again")
	public void itShouldBeRedirectedToHomePageAgain() {
	    System.out.println("Users Deleted Successfully");
	}

}
