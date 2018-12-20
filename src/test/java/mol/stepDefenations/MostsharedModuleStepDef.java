package mol.stepDefenations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mol.commonLibrary.CommonMethods;
import mol.commonLibrary.GdprConsent;
import mol.commonLibrary.JSExecutor;
import mol.utilities.InitiateWebPageDriver;
import mol.pageObjects.MostSharedPageObj;

/**
 * @author jignesh
 */
public class MostsharedModuleStepDef extends InitiateWebPageDriver {
	CommonMethods method = new CommonMethods();
	JSExecutor js = new JSExecutor();
	MostSharedPageObj pageObj = new MostSharedPageObj(getDriver());
	String firstArticleUrl; 
	
	@Given("^I am on UK homepage$")
	public void i_am_on_UK_homepage() {
		method.verifyUrlContainsText("/home/index.html");
		GdprConsent.giveConsent();
		firstArticleUrl = pageObj.firstMsrArticleUrl();
	}

	@Then("^MostShared module is visible$")
	public void mostshared_module_is_visible() {
		pageObj.mostsharedmodule.isDisplayed();
		js.scrollIntoView(pageObj.mostsharedmodule);
	}

	@Then("^Title is displayed$")
	public void title_is_displayed() {
		pageObj.MostSharedTitlePresent();
	}

	@Then("^contains (\\d+) articles$")
	public void contains_5articles(int i) {
		System.out.println(i);
		pageObj.verifyTotalArticles(i);

	}

	@Then("^Images are visible for each article$")
	public void images_are_visible_for_each_article() {
		for (WebElement img : pageObj.imgsInMsr) {
			method.elementIsDisplayed(img);
		}

	}

	@Then("^Article titles are present for each article$")
	public void article_titles_are_present_for_each_article() {
		for (int i = 0; i < pageObj.linksinmsr.size(); i++) {
			pageObj.linksinmsr.get(i).isDisplayed();
		}
	}

	@When("^I click on first  article$")
	public void i_click_on_first_article() throws InterruptedException {
		CommonMethods.waitUntilElement(pageObj.firstMsrArticleLink, "clickable");
		pageObj.firstMsrArticleLink.click();
		Thread.sleep(2000);

	}

	@Then("^Verify the article url$")
	public void verify_the_article_url() {
		method.stringEquals(firstArticleUrl, getDriver().getCurrentUrl());

	}
	@Given("^I am on US homepage$")
	public void i_am_on_US_homepage() throws Throwable {
	    getDriver().findElement(By.linkText("U.S.")).click();
	    Thread.sleep(2000);
	    method.verifyUrlContainsText("/ushome/index.html");
		
	}

	@Then("^US MostShared module is visible$")
	public void us_MostShared_module_is_visible() throws Throwable {
		pageObj.mostsharedmodule.isDisplayed();
		js.scrollIntoView(pageObj.mostsharedmodule);
		firstArticleUrl = pageObj.firstMsrArticleUrl();
	}

	@Then("^The Title is displayed$")
	public void the_Title_is_displayed() throws Throwable {
		pageObj.MostSharedTitlePresent();
	}

	@Then("^It contains (\\d+) articles$")
	public void it_contains_articles(int i) throws Throwable {
		System.out.println(i);
		pageObj.verifyTotalArticles(i);
	}

	@Then("^The Images are visible for each article$")
	public void the_Images_are_visible_for_each_article() throws Throwable {
		for (WebElement img : pageObj.imgsInMsr) {
			method.elementIsDisplayed(img);
		}
	}

	@Then("^Article titles are present for each article in US MSR$")
	public void article_titles_are_present_for_each_article_in_US_MSR() throws Throwable {
		for (int i = 0; i < pageObj.linksinmsr.size(); i++) {
			pageObj.linksinmsr.get(i).isDisplayed();
		}
	}

	@When("^I click on first  article in MSR$")
	public void i_click_on_first_article_in_MSR() throws Throwable {
		CommonMethods.waitUntilElement(pageObj.firstMsrArticleLink, "clickable");
		pageObj.firstMsrArticleLink.click();
		Thread.sleep(2000);
	}

	@Then("^The article open and Verify the article url$")
	public void the_article_open_and_Verify_the_article_url() throws Throwable {
		method.stringEquals(firstArticleUrl, getDriver().getCurrentUrl());
	}

}
