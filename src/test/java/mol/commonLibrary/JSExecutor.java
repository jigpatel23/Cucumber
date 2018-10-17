package mol.commonLibrary;

import mol.utilities.InitiateWebPageDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
/**
 * @author jignesh
 *
 */
public class JSExecutor extends InitiateWebPageDriver {
    JavascriptExecutor jse = (JavascriptExecutor)getDriver();

    public void scrollIntoView(WebElement element){
        jse.executeScript("arguments[0].scrollIntoView(true);", element);
    }
}
