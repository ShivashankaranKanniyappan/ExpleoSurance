package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import driverInstance.drivers;
import io.cucumber.java.en.*;

public class loginSteps extends drivers {
	
	@When("User Enter Username and Password")
	public void user_enter_username_and_password() throws InterruptedException {
	     
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Email Address']"));
		username.sendKeys("shivashankaran.kanniyappan@expleogroup.com");
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("Shiva@1919");
	}

	@When("User should click the LoginButton")
	public void user_should_click_the_login_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(3000); 
	}

	@Then("Login Should be successful")
	public void login_should_be_successful() {
	     System.out.println("Login Successful");
	}
}
