package Try;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class tryHere {
	@Test
	private void practice() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://192.168.99.141:3000/home");
		driver.manage().window().maximize();
		
		WebElement table = driver.findElement(By.xpath("//table[@class='mt-0 border-2 border-white w-max ']")); 
		String text = table.getText();
		System.out.println(text);

        // Get all rows in the table
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        int size = rows.size();
        System.out.println(size);
        
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0, 16000)");
        
        driver.findElement(By.xpath("//td[text()='test231@test.com']/following::td[2][@class='deleteButton']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        WebElement yesButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Yes']")));
        Actions act = new Actions(driver);
        act.doubleClick(yesButton).build().perform();
        
  
        }
	}


