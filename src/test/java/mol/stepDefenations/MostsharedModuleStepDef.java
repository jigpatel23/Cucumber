package mol.stepDefenations;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mol.commonLibrary.CommonMethods;
import mol.commonLibrary.JSExecutor;
import mol.utilities.InitiateWebPageDriver;
import pageObjects.MostSharedPageObj;

/**
 * @author jignesh
 */
public class MostsharedModuleStepDef extends InitiateWebPageDriver {
    CommonMethods method = new CommonMethods();
    JSExecutor js = new JSExecutor();
    MostSharedPageObj pageObj = new MostSharedPageObj(getDriver());

    @Given("^I am on UK homepage$")
    public void i_am_on_UK_homepage() {
        method.verifyUrlContainsText("/home/index.html");

    }

    @Then("^MostShared module is visible$")
    public void mostshared_module_is_visible() {
        pageObj.mostsharedmodule.isDisplayed();
        js.scrollIntoView(pageObj.mostsharedmodule);
    }

    @Then("^Title is displayed$")
    public void title_is_displayed()  {
       pageObj.MostSharedTitlePresent();
    }

    @Then("^contains (\\d+) articles$")
    public void contains_videos(int i) {
        System.out.println(i);
        pageObj.verifyTotalArticles(i);

    }

    @Then("^Images are visible for each article$")
    public void images_are_visible_for_each_article() {
      //To Do

    }

    @Then("^Article titles are present for each article$")
    public void article_titles_are_present_for_each_article() {
        for (int i=0; i<pageObj.linksinmsr.size(); i++){
            pageObj.linksinmsr.get(i).isDisplayed();
        }
    }

    @When("^I click on each  article$")
    public void i_click_on_each_article() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^The article should open$")
    public void the_article_should_open() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^Verify the article url$")
    public void verify_the_article_url() {
        // Write code here that turns the phrase above into concrete actions

    }
}
