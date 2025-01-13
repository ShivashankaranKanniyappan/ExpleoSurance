package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverInstance.drivers;
import io.cucumber.java.en.*;

public class F91_NewInsuranceFielsWithoutName extends drivers {
	
	@Given("User should be in login Page for field validating")
	public void user_should_be_in_login_page_for_field_validating() throws InterruptedException {
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Email Address']"));
		username.sendKeys("shivashankaran.kanniyappan@expleogroup.com");
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("Shiva@1919");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(5000);
	}

	@When("User Clicks the NewInsurance Tab")
	public void user_clicks_the_new_insurance_tab() throws InterruptedException {
		driver.findElement(By.xpath("//a[normalize-space()='New Insurance']")).click();
		Thread.sleep(2000);
	}
	
	@When("User enters all the Fields Without Name")
	public void user_enters_all_the_fields_without_name() throws InterruptedException {
		driver.findElement(By.id("Name")).sendKeys("");
		driver.findElement(By.id("email")).sendKeys("Shiva@expleo.com");
		driver.findElement(By.id("Address")).sendKeys("Chennai");
		driver.findElement(By.id("DateOfBirth")).sendKeys("12/02/1993");
		driver.findElement(By.xpath("//input[@name='Gender']")).click();
		Thread.sleep(4000);
		WebElement policyType = driver.findElement(By.xpath("//select[@name='policyType']"));
		Select select = new Select(policyType);
		select.selectByIndex(2);
		
		WebElement selectSumAssured = driver.findElement(By.name("SumInsured"));
		Select select2 = new Select(selectSumAssured);
		select2.selectByIndex(3);
		driver.findElement(By.id("Premium")).sendKeys("233");
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Submit']"))).click();
	}

	@Then("User click the Submit button and it should show Error")
	public void user_click_the_submit_button_and_it_should_show_error() throws InterruptedException {
		Thread.sleep(4000);
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		String text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[normalize-space()='*Name is required']"))).getText();
		System.out.println(text);
		
	}

}
