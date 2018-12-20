/**
 * 
 */
package mol.commonLibrary;

import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import mol.utilities.SysProp;

/**
 * @author jigneshkumarpatel
 *
 */
public class OpenNewTab extends mol.utilities.InitiateWebPageDriver {

	public static void newtab(WebElement element) {
		String newTab;
		if (SysProp.isMac()) {
			newTab = Keys.chord(Keys.COMMAND, Keys.RETURN);
		} else {
			newTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
		}
		CommonMethods.waitUntilElement(element, "clickable");
		element.sendKeys(newTab);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
	}

	public static String parentWindowHandle() {
		return getDriver().getWindowHandle();
	}

	public static ArrayList<String> childWindowHandles() {
		return new ArrayList<String>(getDriver().getWindowHandles());
	}

}
