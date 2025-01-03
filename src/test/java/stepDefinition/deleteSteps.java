package stepDefinition;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import driverInstance.drivers;
import io.cucumber.java.en.*;

public class deleteSteps extends drivers {

	@Given("User should be logged in successfully")
	public void user_should_be_logged_in_successfully() throws InterruptedException {

		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Email Address']"));
		username.sendKeys("shivashankaran.kanniyappan@expleogroup.com");
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("Shiva@1919");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(2000);
	}

	@When("User clicks the delete button")
	public void user_clicks_the_delete_button() {
		WebElement table = driver.findElement(By.xpath("//div[@class='insuranceTable']"));
		List<WebElement> headers = table.findElements(By.tagName("th"));
		for (WebElement header : headers) {
			String text = header.getText();
			System.out.println("Headers: "+text); 
		}

		List<WebElement> AllRows = table.findElements(By.cssSelector("tbody tr"));
		int size = AllRows.size();
		System.out.println("Total Number of Rows: "+ size);

		for (WebElement row : AllRows) {
			WebElement columns = row.findElement(By.tagName("td"));
			String text = columns.getText();
			System.out.println("All rows first column: "+text);
		}

		for (int i = 0; i < size; i++) {
			List<WebElement> secondRow = AllRows.get(i).findElements(By.tagName("td"));
			WebElement policyID = secondRow.get(1);
			String text = policyID.getText();
			System.out.println(text);
			if(text.equals("66f4fe46f47156891e9beccd"))
			{
				WebElement delete = secondRow.get(7).findElement(By.tagName("button"));
				delete.click();
			}
		}
	}

	@And("User clicks the Yes or No")
	public void user_clicks_the_yes_or_no() {
		WebElement confirm = driver.findElement(By.xpath("//button[normalize-space()='Yes']"));
		confirm.click();
	}

	@Then("Insurance entry should be deleted in the dashboard page")
	public void insurance_entry_should_be_deleted_in_the_dashboard_page() {
		System.out.println("Policy Deleted");
	}
}
