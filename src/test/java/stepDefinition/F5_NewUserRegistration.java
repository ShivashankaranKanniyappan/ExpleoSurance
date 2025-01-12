package stepDefinition;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverInstance.drivers;
import io.cucumber.java.en.*;

public class F5_NewUserRegistration extends drivers {

	@Given("User Clicks the Register New Account")
	public void user_clicks_the_register_new_account() {
		WebElement Register = driver.findElement(By.xpath("//h4[normalize-space()='Register new account']"));
		Register.click();
	}
	@When("User Enters {string} {string} and {string}")
	public void user_enters_and(String Email, String Password, String ConfirmPassword) {
		driver.findElement(By.id("email")).sendKeys(Email);
		driver.findElement(By.id("password")).sendKeys(Password);
		driver.findElement(By.id("confirmPassword")).sendKeys(ConfirmPassword);
	}
	@When("User clicks the Register button")
	public void user_clicks_the_register_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}
	@Then("User should get the Success Message")
	public void user_should_get_the_success_message() throws InterruptedException {
		Thread.sleep(2000);
		WebElement success = driver.findElement(By.xpath("//h2[normalize-space()='Registration successful!']"));
		String text = success.getText();
		System.out.println(text);
		Thread.sleep(2000);
	}

	@Given("User enters the new registered {string} and {string}")
	public void userEntersTheNewRegisteredAnd(String Username, String Password) {
		driver.findElement(By.name("username")).sendKeys(Username);
		driver.findElement(By.name("Password")).sendKeys(Password);
	}
	@When("User clicks the submit button")
	public void userClicksTheSubmitButton() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(1000);
	}
	@Then("It should be logged in Successfully")
	public void itShouldBeLoggedInSuccessfully() {
		System.out.println("Logged in successfully");
	}
}


