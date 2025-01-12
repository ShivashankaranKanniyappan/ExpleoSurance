package stepDefinition;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverInstance.drivers;
import io.cucumber.java.en.*;

public class F7_forgotPassword extends drivers {

	@Given("User should be in the given URL")
	public void user_should_be_in_the_given_url() {
	    @Nullable
		String title = driver.getTitle();
	    System.out.println(title);
	}

	@When("User clicks the Forgot Password")
	public void user_clicks_the_forgot_password() {
		WebElement forgot = driver.findElement(By.xpath("//h4[normalize-space()='Forgot password ?']"));
	    forgot.click();
	}

	@When("User enters the {string} {string} and {string}")
	public void user_enters_the_and(String Email, String NewPassword, String ConfirmPassword) {
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(Email);
		driver.findElement(By.xpath("//input[@placeholder='Enter your new password']")).sendKeys(NewPassword);
		driver.findElement(By.xpath("//input[@placeholder='Confirm your new password']")).sendKeys(ConfirmPassword);
	}

	@When("User clicks the Reset Password button")
	public void userClicksTheResetPasswordButton() throws InterruptedException {
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        WebElement yesButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Yes']")));
        
        Actions act = new Actions(driver);
        act.doubleClick(yesButton).build().perform();
        Thread.sleep(3000);
	}

	@Then("User should be redirected to Login page")
	public void user_should_be_redirected_to_login_page() {
		@Nullable
		String title = driver.getTitle();
		System.out.println(title);
	}

	
}
