/**
 * 
 */
package mol.commonLibrary;

import org.openqa.selenium.By;

import mol.utilities.InitiateWebPageDriver;

/**
 * @author jigneshkumarpatel
 *
 */
public class GdprConsent extends InitiateWebPageDriver{
	public static void giveConsent()  {

		try {
			getDriver().findElement(By.xpath("//button[text()='Got it']")).click();
			Thread.sleep(2000);
			System.out.println("CMP consent is given");
		} catch (Exception e) {
			System.out.println("CMP banner is ***NOT*** present");
		}
		try {
			getDriver().findElement(By.cssSelector("button.mol-ads-cmp--close")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("Confirmation message is ***NOT*** present");
		}
	}

}
