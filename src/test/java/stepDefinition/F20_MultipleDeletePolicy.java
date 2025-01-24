package stepDefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverInstance.drivers;
import io.cucumber.java.en.*;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class F20_MultipleDeletePolicy extends drivers {

	@When("User Clicks the delete button using common name")
	public void userClicksTheDeleteButtonUsingCommonName() throws InterruptedException {
		WebElement table = driver.findElement(By.className("insuranceTable"));
		List<WebElement> headers = table.findElements(By.tagName("th"));
		for (WebElement header : headers) {
			String text = header.getText();
			System.out.println("Headers: " + text);
		}

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 16000)"); 

		List<WebElement> AccountName = driver.findElements(By.xpath("//td[text()='EXPLEOTester']"));
		for (WebElement name : AccountName) {
			String text = name.getText();
			System.out.println(text);
		}

		while (true) {
		    List<WebElement> delete_btn = new WebDriverWait(driver, Duration.ofSeconds(50))
		            .until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//td[text()='EXPLEOTester']/following::td[5][@class='deleteButton']")));

		    WebElement delete = delete_btn.get(0); // Always pick the first delete button
		    Actions act = new Actions(driver);
		    act.click(delete).build().perform();
		    
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		    WebElement ClickYes = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Yes']")));
		    ClickYes.click();
		    
		    Thread.sleep(2000); // Optional: Replace this with a more dynamic wait if needed
		    System.out.println("Policy Deleted Successfully");
		    
		    List<WebElement> row = driver.findElements(By.xpath("//td[text()='EXPLEOTester']"));
		    if (row.isEmpty()) { // Check if the list is empty
		        System.out.println("No Policy found for EXPLEOTester");
		    } else {
		        System.out.println("Found " + row.size() + " policy(s) for EXPLEOTester");
		        driver.quit();
		    }
		}
	}
	@Then("Page should be logged out")
	public void pageShouldBeLoggedOut() throws AWTException, InterruptedException {

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_MINUS); robot.keyRelease(KeyEvent.VK_MINUS); 
		robot.keyPress(KeyEvent.VK_MINUS); robot.keyRelease(KeyEvent.VK_MINUS); 
		robot.keyPress(KeyEvent.VK_MINUS); robot.keyRelease(KeyEvent.VK_MINUS); 
		robot.keyPress(KeyEvent.VK_MINUS); robot.keyRelease(KeyEvent.VK_MINUS); 
		robot.keyRelease(KeyEvent.VK_CONTROL);

		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement logout = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Logout']")));

		Actions act = new Actions(driver);
		act.click(logout).build().perform();
		System.out.println("LogOut Successful");
	}

}
