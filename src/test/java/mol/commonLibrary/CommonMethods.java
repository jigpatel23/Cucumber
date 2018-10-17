package mol.commonLibrary;

import mol.utilities.InitiateWebPageDriver;
import org.openqa.selenium.WebElement;

/**
 * @author jignesh
 *
 */

public class CommonMethods extends InitiateWebPageDriver {
    public boolean verifyUrlContainsText(String expected){
       return getDriver().getCurrentUrl().contains(expected);
    }




}
