package baseClass_Shiva;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverInstance.drivers;

public class BaseClass extends drivers {

	public void launchBrowser(String URL)
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
	}

	public void quitBrowser()
	{
		if (driver != null) {
			driver.quit();
		}
	}

	public void closeBrowser()
	{
		driver.close();
	}

	public void clickElement(WebElement element) 
	{
		element.click();
	}

	public void getTitle()
	{
		String title = driver.getTitle();
		System.out.println("User is on Login Page: "+title);
	}


	public WebElement findElementID(String ID)
	{
		WebElement elementID = driver.findElement(By.id(ID));
		elementID.click();
		return elementID;
	}

	public WebElement findElementName(String Name)
	{
		WebElement elementName = driver.findElement(By.name(Name));
		elementName.click();
		return elementName;
	}

	public WebElement findElementXpath(String xpath)
	{
		WebElement elementXpath = driver.findElement(By.xpath(xpath));
		elementXpath.click();
		return elementXpath;
	}

	public WebElement findElementLinkedText(String xpath)
	{
		WebElement elementLinkedText = driver.findElement(By.xpath(xpath));
		elementLinkedText.click();
		return elementLinkedText;
	}

	public void sendKeys(WebElement element, String keys)
	{
		element.sendKeys(keys);
	}



	// ********FRAMES*********************//
	public void frameByElement(WebElement frameElement) {
		driver.switchTo().frame(frameElement);
	}

	// Switch to a frame by index
	public void frameByIndex(int index) {
		driver.switchTo().frame(index);
	}

	// Switch to a frame by name or ID
	public void switchToFrameByNameOrID(String nameOrID) {
		driver.switchTo().frame(nameOrID);
	}

	// Switch back to the default content
	public void switchToDefaultContent() {
		driver.switchTo().defaultContent();
	}

	// Switch to a frame by its parent or ancestor hierarchy
	public void switchToParentFrame() {
		driver.switchTo().parentFrame();
	}

	// Get all frames on the page
	public List<WebElement> getAllFrames() {
		return driver.findElements(By.tagName("iframe"));
	}

	// Switch to the first frame on the page
	public void switchToFirstFrame() {
		List<WebElement> frames = getAllFrames();
		if (!frames.isEmpty()) {
			driver.switchTo().frame(frames.get(0));
		}
	}

	// Switch to the last frame on the page
	public void switchToLastFrame() {
		List<WebElement> frames = getAllFrames();
		if (!frames.isEmpty()) {
			driver.switchTo().frame(frames.get(frames.size() - 1));
		}
	}

	// Count the total number of frames on the page
	public int getFrameCount() {
		return getAllFrames().size();
	}

	// Check if the current page contains frames
	public boolean hasFrames() {
		return getFrameCount() > 0;
	}

	//*************SELECT*****************//
	// Select an option from a dropdown by visible text
	public void selectByVisibleText(WebElement dropDownElement, String visibleText) {
		Select select = new Select(dropDownElement);
		select.selectByVisibleText(visibleText);
	}

	// Select an option from a dropdown by index
	public void selectByIndex(WebElement dropDownElement, int index) {
		Select select = new Select(dropDownElement);
		select.selectByIndex(index);
	}

	public void selectByValue(WebElement dropDownElement, String value) {
		Select select = new Select(dropDownElement);
		select.selectByValue(value);
	}

	public List<WebElement> getOptions(WebElement dropdown) {
		Select select = new Select(dropdown);
		return select.getOptions();
	}

	// Get the first selected option from a dropdown
	public WebElement getFirstSelectedOption(WebElement dropdown) {
		Select select = new Select(dropdown);
		return select.getFirstSelectedOption();
	}

	// Get all selected options (for multi-select dropdowns)
	public List<WebElement> getAllSelectedOptions(WebElement dropdown) {
		Select select = new Select(dropdown);
		return select.getAllSelectedOptions();
	}

	// Check if a dropdown allows multiple selections
	public boolean isMultiSelect(WebElement dropdown) {
		Select select = new Select(dropdown);
		return select.isMultiple();
	}

	// Deselect an option by visible text (for multi-select dropdowns)
	public void deselectByVisibleText(WebElement dropdown, String visibleText) {
		Select select = new Select(dropdown);
		select.deselectByVisibleText(visibleText);
	}

	// Deselect an option by index (for multi-select dropdowns)
	public void deselectByIndex(WebElement dropdown, int index) {
		Select select = new Select(dropdown);
		select.deselectByIndex(index);
	}

	// Deselect an option by value (for multi-select dropdowns)
	public void deselectByValue(WebElement dropdown, String value) {
		Select select = new Select(dropdown);
		select.deselectByValue(value);
	}

	// Deselect all options (for multi-select dropdowns)
	public void deselectAll(WebElement dropdown) {
		Select select = new Select(dropdown);
		select.deselectAll();
	}

	//***********ACTIONS******************//
	// Perform a hover action on an element
	public void moveToElement(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
	}

	// Perform a right-click (context click) on an element
	public void rightClickAction(WebElement element) {
		Actions actions = new Actions(driver);
		actions.contextClick(element).build().perform();
	}

	// Perform a double-click on an element
	public void doubleClickAction(WebElement element) {
		Actions actions = new Actions(driver);
		actions.doubleClick(element).build().perform();
	}

	// Drag and drop an element to a target element
	public void dragAndDrop(WebElement source, WebElement dest) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, dest).build().perform();
	}

	// Drag and drop an element to an offset position
	public void dragAndDropByOffset(WebElement source, int xOffset, int yOffset) {
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(source, xOffset, yOffset).perform();
	}

	// Click and hold an element, then release
	public void clickAndHoldAction(WebElement element) {
		Actions actions = new Actions(driver);
		actions.clickAndHold(element).perform();
	}

	// Release a clicked element
	public void releaseElement(WebElement element) {
		Actions actions = new Actions(driver);
		actions.release(element).perform();
	}

	// Send keys to an element using Actions
	public void sendKeysWithActions(WebElement element, String keys) {
		Actions actions = new Actions(driver);
		actions.sendKeys(element, keys).perform();
	}

	// Perform a key-down action
	public void keyDownAction(WebElement element, String key) {
		Actions actions = new Actions(driver);
		actions.keyDown(element, key).perform();
	}

	// Perform a key-up action
	public void keyUpAction(WebElement element, String key) {
		Actions actions = new Actions(driver);
		actions.keyUp(element, key).perform();
	}

	// Perform a scroll to an element
	public void scrollToElement(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}

	//************NAVIGATE********************//

	// Navigate to a specific URL
	public void navigateTo(String url) {
		driver.navigate().to(url);
	}

	// Navigate back to the previous page
	public void navigateBack() {
		driver.navigate().back();
	}

	// Navigate forward to the next page
	public void navigateForward() {
		driver.navigate().forward();
	}

	// Refresh the current page
	public void refreshPage() {
		driver.navigate().refresh();
	}

	// Get the current page URL
	public String getCurrentUrl() {
		@Nullable
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		return currentUrl;
	}

	// Get the current page title
	public String getPageTitle() {
		return driver.getTitle();
	}


	// Wait for a specified number of seconds (thread sleep for demo purposes)
	public void sleep(int seconds) throws InterruptedException {
		Thread.sleep(3000);
	}

	//*******************WINDOW HANDLING*****************/

	// Get the current window handle
	public String getCurrentWindowHandle() {
		return driver.getWindowHandle();
	}

	// Get all open window handles
	public Set<String> getAllWindowHandles() {
		return driver.getWindowHandles();
	}

	// Switch to a window by handle
	public void switchToWindowByHandle(String windowHandle) {
		driver.switchTo().window(windowHandle);
	}

	// Switch to the last opened window
	public void switchToLastWindow() {
		Set<String> allWindows = getAllWindowHandles();
		String lastWindow = allWindows.stream().reduce((first, second) -> second).orElse(null);
		if (lastWindow != null) {
			driver.switchTo().window(lastWindow);
		}
	}

	// Switch to a window by title
	public void switchToWindowByTitle(String title) {
		Set<String> allWindows = getAllWindowHandles();
		for (String window : allWindows) {
			driver.switchTo().window(window);
			if (driver.getTitle().equals(title)) {
				return;
			}
		}
		System.out.println("No window found with title: " + title);
	}

	// Switch to a window containing a specific URL
	public void switchToWindowByUrl(String partialUrl) {
		Set<String> allWindows = getAllWindowHandles();
		for (String window : allWindows) {
			driver.switchTo().window(window);
			if (driver.getCurrentUrl().contains(partialUrl)) {
				return;
			}
		}
		System.out.println("No window found with URL containing: " + partialUrl);
	}

	// Close a specific window by handle
	public void closeWindowByHandle(String windowHandle) {
		driver.switchTo().window(windowHandle);
		driver.close();
	}

	// Close all windows except the original window
	public void closeAllOtherWindows(String originalWindowHandle) {
		Set<String> allWindows = getAllWindowHandles();
		for (String window : allWindows) {
			if (!window.equals(originalWindowHandle)) {
				driver.switchTo().window(window);
				driver.close();
			}
		}
		driver.switchTo().window(originalWindowHandle);
	}

	// Check if multiple windows are open
	public boolean areMultipleWindowsOpen() {
		return getAllWindowHandles().size() > 1;
	}

	//*******************ROBOT***********************//

	// Simulate pressing a key
	public void robotPressKey(int keyCode) throws AWTException{
		robot = new Robot();
		robot.keyPress(keyCode);
		robot.keyRelease(keyCode);
	}

	// Simulate releasing a key
	public void robotReleaseKey(int keyCode) {
		robot.keyRelease(keyCode);
	}

	// Simulate mouse movement to specific screen coordinates
	public void moveMouse(int x, int y) {
		robot.mouseMove(x, y);
	}

	// Simulate a left mouse click
	public void leftClick() {
		robot.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);
	}

	// Simulate a right mouse click
	public void rightClick() {
		robot.mousePress(KeyEvent.BUTTON3_DOWN_MASK);
		robot.mouseRelease(KeyEvent.BUTTON3_DOWN_MASK);
	}

	// Simulate scrolling the mouse wheel
	public void scrollMouse(int scrollAmount) {
		robot.mouseWheel(scrollAmount);
	}

	//******************WAITS*******************//

	public void implicitWait(long seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}

	public WebElement waitForElementVisibility(By locator, long seconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	// Explicit wait: Wait until an element is clickable
	public WebElement waitForElementToBeClickable(By locator, long seconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	// Explicit wait: Wait until an element is present
	public WebElement waitForElementPresence(By locator, long seconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	// Wait for page title to contain a specific text
	public boolean waitForTitleToContain(String partialTitle, long seconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		return wait.until(ExpectedConditions.titleContains(partialTitle));
	}

	// Wait for the URL to contain specific text
	public boolean waitForUrlToContain(String partialUrl, long seconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		return wait.until(ExpectedConditions.urlContains(partialUrl));
	}

}
