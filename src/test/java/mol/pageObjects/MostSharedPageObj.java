/**
 * 
 */
package mol.pageObjects;

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

	@FindBy(how = How.XPATH, using = "//*[text()='Most Shared Right Now']")
	public WebElement mostsharedtitle;

	@FindBy(how = How.XPATH, using = "//*[@data-track-module='am-most_shared_articles^most_shared_articles']")
	public WebElement mostsharedmodule;

	@FindBy(how = How.CSS, using = ".listHolder-3b2tc>a")
	public List<WebElement> linksinmsr;
	
	@FindBy(how = How.XPATH, using = "//*[@data-track-module='am-most_shared_articles^most_shared_articles']/div/div[2]/a/div[1]")
	public List<WebElement> imgsInMsr;

	@FindBy(how = How.XPATH, using = "//*[@data-track-module='am-most_shared_articles^most_shared_articles']/div/div[2]/a[1]")
	public WebElement firstMsrArticleLink;

	public boolean isMostSharedModuleDisplayed() {
		return mostsharedmodule.isDisplayed();
	}

	public boolean MostSharedTitlePresent() {
		return mostsharedtitle.getText().toUpperCase().equals("MOST SHARED RIGHT NOW");
	}

	public boolean verifyTotalArticles(int i) {
		return linksinmsr.size() == i;
	}
	
	public String firstMsrArticleUrl() {
		return firstMsrArticleLink.getAttribute("href");
	}

}
