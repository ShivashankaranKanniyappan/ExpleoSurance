package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import driverInstance.drivers;
import io.cucumber.java.en.*;

public class F19_QuoteGeneration extends drivers {

	@When("User enter the quote generation page")
    public void userEnterTheQuoteGenerationPage() throws InterruptedException {
        driver.findElement(By.xpath("//a[normalize-space()='Quate Generation']")).click(); 
        Thread.sleep(2000);
    }

    @When("User enters {string}, {string} and {string}")
    public void userEntersAnd(String PolicyType, String CoverageAmount, String CustomerAge) {
        WebElement policyType = driver.findElement(By.xpath("//select[@name='policyType']")); // Updated XPath
        Select select = new Select(policyType);
        select.selectByVisibleText(PolicyType); // Fixed method name
        driver.findElement(By.xpath("//input[@name='coverageAmount']")).clear();
        driver.findElement(By.xpath("//input[@name='coverageAmount']")).sendKeys(CoverageAmount);
        driver.findElement(By.xpath("//input[@name='customerAge']")).clear();
        driver.findElement(By.xpath("//input[@name='customerAge']")).sendKeys(CustomerAge);
    }

    @When("User click Generate Quote")
    public void userClickGenerateQuote() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("it should show the quoted amount")
    public void itShouldShowTheQuotedAmount() {
        WebElement quote = driver.findElement(By.xpath("//h3[starts-with(text(), 'Generated')]"));
        String text = quote.getText();
        System.out.println("Generated Quote: " + text); // Added a descriptive log
    }
}
