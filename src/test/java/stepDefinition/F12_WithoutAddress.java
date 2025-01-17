package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverInstance.drivers;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class F12_WithoutAddress extends drivers {
	
	@When("User filled all the fields without Address")
	public void user_filled_all_the_fields_without_address() throws InterruptedException {
		driver.findElement(By.id("Name")).sendKeys("shiva");
		driver.findElement(By.id("email")).sendKeys("shiva@expleo ");
		driver.findElement(By.id("Address")).sendKeys(" ");
		driver.findElement(By.id("DateOfBirth")).sendKeys("12/12/1992");
		driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
		Thread.sleep(3000);
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

	@Then("It should show the error msg Address is Required")
	public void it_should_show_the_error_msg_address_is_required() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Submit']"))).click();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		String text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[normalize-space()='*Address is required']"))).getText();
		System.out.println(text);     
	}

}
