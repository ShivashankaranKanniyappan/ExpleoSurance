package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClass_Shiva.BaseClass;
import driverInstance.drivers;
import io.cucumber.java.en.*;

public class F18_PaymentPage extends BaseClass {

	@When("selecting Payment Page")
	public void selecting_payment_page() {
		getTitle();
		findElementXpath("//a[normalize-space()='Payment Page']");
	}

	@When("user enter the policy amount and calculate and press proceed payment")
	public void user_enter_the_policy_amount_and_calculate_and_press_proceed_payment() throws InterruptedException {
		findElementXpath("//input[@placeholder='Policy Amount']").sendKeys("250000");
		findElementXpath("//button[normalize-space()='Calculate Premium']").click();
		sleep(1000);
	}

	@When("press the proceed to pay")
	public void press_the_proceed_to_pay() throws InterruptedException {
		findElementXpath("//button[normalize-space()='Calculate Premium']").click();
		sleep(1000);
	}

	@When("It should show the premium amount")
	public void it_should_show_the_premium_amount() {
		String text = findElementXpath("//p[contains(text(), 'Premium:')]").getText();
		System.out.println(text);
	}

	@Then("User press proceed to pay")
	public void user_press_proceed_to_pay() throws InterruptedException {
		
		driver.findElement(By.xpath("//button[text()='Proceed to Pay']")).click();
		Thread.sleep(4000);		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent()).accept();
		System.out.println("Alert handled and Payment Done");
	}
}
