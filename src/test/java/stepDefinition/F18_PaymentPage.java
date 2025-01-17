package stepDefinition;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import driverInstance.drivers;
import io.cucumber.java.en.*;

public class F18_PaymentPage extends drivers {

	@When("User enter the policy amount and calculate premium")
	public void user_enter_the_policy_amount_and_calculate_premium() {
		driver.findElement(By.xpath("//a[text()='Payment Page']")).click();
		WebElement Amount = driver.findElement(By.xpath("//input[@placeholder='Policy Amount']"));
		Amount.sendKeys("50000");
		driver.findElement(By.xpath("//button[text()='Calculate Premium']")).click();	    
	}

	@When("User get the premium amount and print")
	public void user_get_the_premium_amount_and_print() {
		WebElement premium = driver.findElement(By.xpath("//p[starts-with(text(), 'Premium')]"));
		String text = premium.getText();
		System.out.println(text);
	}

	@Then("User click proceed to pay")
	public void user_click_proceed_to_pay() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Proceed to Pay']")).click();
		Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        System.out.println("Alert text: " + alert.getText()); // Print alert text if needed
        alert.accept(); // Accept the alert
        
        System.out.println("Alert accepted successfully.");

	}
}
