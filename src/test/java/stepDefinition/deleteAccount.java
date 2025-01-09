package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import driverInstance.drivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class deleteAccount extends drivers {
	
	@Given("User enter the ExpleosuraceHome page")
	public void user_enter_the_expleosurace_home_page() {
		 driver.get("http://192.168.99.141:3000/home");
	}

	@When("User clicks the delete button for the selected Users")
	public void user_clicks_the_delete_button_for_the_selected_users() {
		WebElement table = driver.findElement(By.xpath("//div[@class='tableHead']"));
		List<WebElement> headers = table.findElements(By.tagName("th"));
		for (WebElement header : headers) 
		{
			String text = header.getText();
			System.out.println("Headers: "+text); 
		}
	}

	@Then("User should be deleted in the Dashboard")
	public void user_should_be_deleted_in_the_dashboard() {
	    
	}
	


}
