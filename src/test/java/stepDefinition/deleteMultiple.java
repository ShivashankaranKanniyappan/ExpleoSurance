package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import driverInstance.drivers;
import io.cucumber.java.en.*;

public class deleteMultiple extends drivers{

	@Given("User should be in login page")
	public void userShouldBeInLoginPage() throws InterruptedException {
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Email Address']"));
		username.sendKeys("shivashankaran.kanniyappan@expleogroup.com");
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("Shiva@1919");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(2000);    
	}

	@When("User delete the selected policy details")
	public void userDeleteTheSelectedPolicyDetails() {
		WebElement table = driver.findElement(By.xpath("//div[@class='insuranceTable']"));
		List<WebElement> headers = table.findElements(By.tagName("th"));
		for (WebElement header : headers) 
		{
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
			
			if(text.equals("677cde82fd02909d90256d62"))
			{
				WebElement delete = secondRow.get(7).findElement(By.tagName("button"));
				delete.click();
			}
		}

	}
	@When("The policy should be deleted")
	public void thePolicyShouldBeDeleted() {
			

	}
	@Then("Validate Dashboard page")
	public void validateDashboardPage() {


	}

}
