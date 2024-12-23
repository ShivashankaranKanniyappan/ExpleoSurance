package baseClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	WebDriver driver = new ChromeDriver();

	public void launchBrowser(String Url) {
		driver.get(Url);
		driver.manage().window().maximize();
	}

	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public void sendKeys(By by, String text) {
		WebElement element = driver.findElement(by);
		element.clear();
		element.sendKeys(text);
	}

	public String getText(String xpath, String value) {
		WebElement element = driver.findElement(By.xpath(value));
		return element.getText();
	}

	public WebElement findElementByXPath(String xpath, int TIMEOUT) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
		return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
	}




}
