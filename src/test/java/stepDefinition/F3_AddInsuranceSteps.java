package stepDefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverInstance.drivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class F3_AddInsuranceSteps extends drivers {


	@Given("User should be in login Page")
	public void userShouldBeInLoginPage() throws InterruptedException {

		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Email Address']"));
		username.sendKeys("shivashankaran.kanniyappan@expleogroup.com");
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("Shiva@1919");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(5000);
	}

	// ============ADD NEW INSURANCE DETAILS=================================== //

	@When("User Clicks the New Insurance Tab")
	public void user_clicks_the_new_insurance_tab() {
		driver.findElement(By.xpath("//a[normalize-space()='New Insurance']")).click();
	}

	@When("User enters the {string}, {string}, {string}, {string}")
	public void userEntersThe(String Name, String Email, String Address, String Date) {
		driver.findElement(By.id("Name")).sendKeys(Name);
		driver.findElement(By.id("email")).sendKeys(Email);
		driver.findElement(By.id("Address")).sendKeys(Address);
		driver.findElement(By.id("DateOfBirth")).sendKeys(Date);
	}
	@When("User Select the {string} and {string}")
	public void userSelectTheAnd(String Gender, String PolicyType) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='Gender']")).click();
		Thread.sleep(4000);
		WebElement policyType = driver.findElement(By.xpath("//select[@name='policyType']"));
		Select select = new Select(policyType);
		select.selectByIndex(2);
	}

	@When("User select the {string} and {string}")
	public void userSelectTheSAandPremium(String SumInsured, String Premium) {
		WebElement selectSumAssured = driver.findElement(By.name("SumInsured"));
		Select select = new Select(selectSumAssured);
		select.selectByIndex(3);
		driver.findElement(By.id("Premium")).sendKeys(Premium);
	}

	@When("User click the Submit button")
	public void user_click_the_submit_button() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Submit']"))).click();
	}

	@When("Page should show Insurance policy created successfully")
	public void page_should_show_insurance_policy_created_successfully() throws InterruptedException, AWTException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//p[normalize-space()='Insurance policy created successfully.'])[1]"));
		System.out.println("Insurance Created Successfully");
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_MINUS); robot.keyRelease(KeyEvent.VK_MINUS); 
        robot.keyPress(KeyEvent.VK_MINUS); robot.keyRelease(KeyEvent.VK_MINUS); 
        robot.keyPress(KeyEvent.VK_MINUS); robot.keyRelease(KeyEvent.VK_MINUS); 
        robot.keyPress(KeyEvent.VK_MINUS); robot.keyRelease(KeyEvent.VK_MINUS); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement logout = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Logout']")));
        
		Actions act = new Actions(driver);
		act.click(logout).build().perform();
		System.out.println("Login Successful");
	}


}
