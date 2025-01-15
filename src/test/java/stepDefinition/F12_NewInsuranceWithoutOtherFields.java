package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverInstance.drivers;
import io.cucumber.java.en.*;

public class F12_NewInsuranceWithoutOtherFields extends drivers {

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

	@When("User filled all the fields without DOB")
	public void user_filled_all_the_fields_without_dob() throws InterruptedException {
		driver.findElement(By.id("Name")).sendKeys("shiva");
		driver.findElement(By.id("email")).sendKeys("shiva@expleo ");
		driver.findElement(By.id("Address")).sendKeys("Expleo");
		driver.findElement(By.id("DateOfBirth")).sendKeys(" ");
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

	@Then("It should show the error msg DOB is Required")
	public void it_should_show_the_error_msg_dob_is_required() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Submit']"))).click();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		String text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[normalize-space()='*Date of Birth is required']"))).getText();
		System.out.println(text);
	       
	}

	@When("User filled all the fields without Gender")
	public void user_filled_all_the_fields_without_gender() throws InterruptedException {
		driver.findElement(By.id("Name")).sendKeys("shiva");
		driver.findElement(By.id("email")).sendKeys("shiva@expleo ");
		driver.findElement(By.id("Address")).sendKeys("Expleo");
		driver.findElement(By.id("DateOfBirth")).sendKeys("12/02/1993");
//		driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
//		Thread.sleep(3000);
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

	@Then("It should show the error msg Gender is Required")
	public void it_should_show_the_error_msg_gender_is_required() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Submit']"))).click();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		String text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[normalize-space()='*Gender is required']"))).getText();
		System.out.println(text);    
	}

	@When("User filled all the fields without PolicyType")
	public void user_filled_all_the_fields_without_policy_type() throws InterruptedException {
		driver.findElement(By.id("Name")).sendKeys("shiva");
		driver.findElement(By.id("email")).sendKeys("shiva@expleo ");
		driver.findElement(By.id("Address")).sendKeys("Expleo");
		driver.findElement(By.id("DateOfBirth")).sendKeys("12/12/1992");
		driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
		Thread.sleep(3000);
//		WebElement policy = driver.findElement(By.xpath("//select[@name='policyType']"));
//		Select select = new Select(policy);
//		select.selectByIndex(2);
//		WebElement coverage = driver.findElement(By.xpath("//select[@name='coverage']"));
//		Select select2 = new Select(coverage);
//		select.selectByIndex(2);
		WebElement selectSumInsured = driver.findElement(By.name("SumInsured"));
		Select select3 = new Select(selectSumInsured);
		select3.selectByIndex(3);
		driver.findElement(By.id("Premium")).sendKeys("322");	       
	}

	@Then("It should show the error msg Please select at least one Policy Type")
	public void it_should_show_the_error_msg_please_select_at_least_one_policy_type() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Submit']"))).click();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		String text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[normalize-space()='*Please select at least one Policy Type']"))).getText();
		System.out.println(text); 
	       
	}

	@When("User filled all the fields without SumInsured")
	public void user_filled_all_the_fields_without_sum_insured() throws InterruptedException {
		driver.findElement(By.id("Name")).sendKeys("shiva");
		driver.findElement(By.id("email")).sendKeys("shiva@expleo ");
		driver.findElement(By.id("Address")).sendKeys("Expleo");
		driver.findElement(By.id("DateOfBirth")).sendKeys("12/12/1992");
		driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
		Thread.sleep(3000);
		WebElement policy = driver.findElement(By.xpath("//select[@name='policyType']"));
		Select select = new Select(policy);
		select.selectByIndex(2);
		WebElement coverage = driver.findElement(By.xpath("//select[@name='coverage']"));
		Select select2 = new Select(coverage);
		select.selectByIndex(2);
//		WebElement selectSumInsured = driver.findElement(By.name("SumInsured"));
//		Select select3 = new Select(selectSumInsured);
//		select3.selectByIndex(3);
		driver.findElement(By.id("Premium")).sendKeys("322"); 
	}

	@Then("It should show the error msg Please select Sum Insured")
	public void it_should_show_the_error_msg_please_select_sum_insured() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Submit']"))).click();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		String text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[normalize-space()='*Please select Sum Insured']"))).getText();
		System.out.println(text);   
	}

	@When("User filled all the fields without Premium")
	public void user_filled_all_the_fields_without_premium() throws InterruptedException {
		driver.findElement(By.id("Name")).sendKeys("shiva");
		driver.findElement(By.id("email")).sendKeys("shiva@expleo.com");
		driver.findElement(By.id("Address")).sendKeys("Expleo");
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
		driver.findElement(By.id("Premium")).sendKeys(" ");
	}

	@Then("It should show the error msg Please select Premium")
	public void it_should_show_the_error_msg_please_select_premium() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Submit']"))).click();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		String text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[normalize-space()='*Premium is required']"))).getText();
		System.out.println(text);         
	}
}
