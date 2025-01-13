package stepDefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverInstance.drivers;
import io.cucumber.java.en.*;

public class F9_LoginAndGetTitle extends drivers {
	
	@Given("User enter valid login and password")
	public void userEnterValidLoginAndPassword() {
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Email Address']"));
		username.sendKeys("shivashankaran.kanniyappan@expleogroup.com");
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("Shiva@1919");
	}
	@When("User clicks submit it should be redirected to Dashboard Page")
	public void userClicksSubmitItShouldBeRedirectedToDashboardPage() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(3000); 
	}
	@When("User should validate the Title and URL")
	public void userShouldValidateTheTitleAndURL() {
		WebElement title = driver.findElement(By.xpath("//p[@class='text-lg font-bold text-white']"));
		System.out.println("******TITLE IS********"+ " " + title.getText());
		
		@Nullable
		String currentUrl = driver.getCurrentUrl();
		System.out.println("******Current URL******" +currentUrl);

	}
	@Then("Logout the page")
	public void logoutThePage() throws AWTException, InterruptedException {
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
		Thread.sleep(5000);
		@Nullable
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		System.out.println("Logout Successful");
	}
}
