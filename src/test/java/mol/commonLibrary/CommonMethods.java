package mol.commonLibrary;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import mol.utilities.InitiateWebPageDriver;

/**
 * @author jignesh
 *
 */

public class CommonMethods extends InitiateWebPageDriver {

	public boolean verifyUrlContainsText(String expected) {
		return getDriver().getCurrentUrl().contains(expected);
	}

	public boolean elementIsDisplayed(WebElement element) {
		return element.isDisplayed();
	}

	public boolean stringEquals(String expected, String actual) {
		return actual.equals(expected);
	}

	public boolean elementIsClickable(WebElement element) {
		return element.isEnabled();
	}

	public static void waitUntilElement( WebElement element, String status) {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		if (status.equalsIgnoreCase("clickable")) {
			wait.until(ExpectedConditions.elementToBeClickable(element));
		} else if (status.equalsIgnoreCase("visible")) {
			wait.until(ExpectedConditions.visibilityOf(element));
		}

	}

	public static void WaitUntilPageLoaded() throws InterruptedException {
		// wait until page loaded
		for (int j = 0; j < 25; j++) {
			Thread.sleep(1000);
			if (((JavascriptExecutor) getDriver()).executeScript("return document.readyState").toString()
					.equals("complete")) {
				break;
			}
		}
	}

}
