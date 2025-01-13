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

public class F5_DeleteSelectedPolicy extends drivers {


	@Given("User should be in Login Page")
	public void userShouldBeInLoginPage() throws InterruptedException {
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Email Address']"));
		username.sendKeys("shivashankaran.kanniyappan@expleogroup.com");
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("Shiva@1919");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(2000);
	}

	@When("User Select the account using AccountName for delete")
	public void user_select_the_account_using_account_name_for_delete() throws InterruptedException {

		// Table Header 
		WebElement table = driver.findElement(By.xpath("//div[@class='insuranceTable']"));
		List<WebElement> headers = table.findElements(By.tagName("th"));
		for (WebElement header : headers) 
		{
			String text = header.getText();
			System.out.println("Headers: "+text); 
		}

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 6000)");

		WebElement delete_btn = driver.findElement(By.xpath("//tbody/tr[1]/td[8]/button")); //(//button[text()='Delete Policy'])[1]
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", delete_btn);
		Thread.sleep(3000);

		Actions act = new Actions(driver);
		act.doubleClick(delete_btn).build().perform();
		Thread.sleep(3000);

	}

	@And("User clicks the delete button one by one")
	public void user_clicks_the_delete_button_one_by_one() throws InterruptedException {


	}

	@Then("Account should be deleted")
	public void account_should_be_deleted() {
		System.out.println("Policy Deleted");
	}


}
