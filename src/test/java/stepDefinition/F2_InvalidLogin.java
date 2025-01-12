package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverInstance.drivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class F2_InvalidLogin extends drivers {

	@Given("User Enters invalid {string} and invalid {string}")
	public void user_enters_invalid_and_invalid(String username, String password) {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("Password")).sendKeys(password);
	}

	@When("User Click the login button")
	public void user_click_the_login_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(1000);
	}

	@Then("Error message will be displayed")
	public void error_message_will_be_displayed() {
		WebElement error = driver.findElement(By.xpath("//p[contains(text(), \"Invalid username or password\")]"));
		String text = error.getText();
		System.out.println(text);   
	}
	
	@Given("User Enters Empty {string} and {string}")
	public void user_enters_empty_and(String username, String password) {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("Password")).sendKeys(password);
	}

	@When("User Clicks the login button")
	public void user_clicks_the_login_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(1000);
	}

	@Then("Error message will be displayed as Username and password are required")
	public void error_message_will_be_displayed_as_username_and_password_are_required() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement error = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Username and password are required']")));
		String text = error.getText();
		System.out.println(text);
	}
}
