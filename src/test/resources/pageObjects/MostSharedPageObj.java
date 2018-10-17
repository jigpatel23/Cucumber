/**
 * 
 */
package pageObjects;


import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * @author jignesh
 *
 *         elements for Most Shared module
 */
public class MostSharedPageObj {

	public MostSharedPageObj(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[text()='Most Shared Right Now']")
	public WebElement mostsharedtitle;

	@FindBy(how = How.XPATH, using = "//*[@data-track-module='am-most_shared_articles^most_shared_articles']")
	public WebElement mostsharedmodule;

	@FindBy(css = ".listHolder-3b2tc>a")
	public List<WebElement> linksinmsr;

	public boolean isMostSharedModuleDisplayed() {
		return mostsharedmodule.isDisplayed();
	}

	public boolean MostSharedTitlePresent() {
		return mostsharedtitle.getText().toUpperCase().equals("MOST SHARED RIGHT NOW");
	}
	public boolean verifyTotalArticles(int i){
		return linksinmsr.size() == i;
	}

}
