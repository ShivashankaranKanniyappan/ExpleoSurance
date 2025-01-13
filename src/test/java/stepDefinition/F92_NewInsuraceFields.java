package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverInstance.drivers;
import io.cucumber.java.en.*;

public class F92_NewInsuraceFields extends drivers {

	@Given("User is in LoginPage")
	public void user_is_in_login_page() throws InterruptedException {
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Email Address']"));
		username.sendKeys("shivashankaran.kanniyappan@expleogroup.com");
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("Shiva@1919");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(5000);
	}

	@When("selecting New Insurance Tab")
	public void selecting_new_insurance_tab() {
		driver.findElement(By.xpath("//a[normalize-space()='New Insurance']")).click();
	}

	@When("User filled all the fields without Email")
	public void user_filled_all_the_fields_without_email() throws InterruptedException {		
		driver.findElement(By.id("Name")).sendKeys("shiva");
		driver.findElement(By.id("email")).sendKeys(" ");
		driver.findElement(By.id("Address")).sendKeys("Expleo");
		driver.findElement(By.id("DateOfBirth")).sendKeys("12/12/1992");

		driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
		Thread.sleep(4000);
		WebElement policy = driver.findElement(By.xpath("//select[@name='policyType']"));
		Select select = new Select(policy);
		select.selectByIndex(2);

		WebElement coverage = driver.findElement(By.xpath("//select[@name='coverage']"));
		Select select2 = new Select(coverage);
		select.selectByIndex(2);

		WebElement selectSumInsured = driver.findElement(By.name("SumInsured"));
		Select select3 = new Select(selectSumInsured);
		select3.selectByIndex(3);
		driver.findElement(By.id("Premium")).sendKeys("322");

	}

	@Then("It should show the error msg and then Logout")
	public void it_should_show_the_error_msg_and_then_logout() throws InterruptedException {
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Submit']"))).click();
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		String text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[normalize-space()='*Email is required']"))).getText();
		System.out.println(text);
		
		
		
		
	}

}
