import base.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class StepDefinitions {

    @Given("i navigate to url {string}")
    public void SP_user_navigate_to_url(String url) {
        BasePage.navigateToUrl(url);
    }

    @Then("i should be navigated to home page with title {string}")
    public void SP_user_should_be_navigated_to_home_page_with_title(String title) {
        Assertions.assertEquals(title,BasePage.driver.getTitle());
    }

    @When("i enter link in the browser and click enter")
    public void SP_user_enter_link_in_the_browser_and_click_enter() {

    }

    @Then("I should be navigate to Continue page with title {string}")
    public void SP_user_should_be_navigate_to_continue_page_with_title(String title) {
        //Assertions.assertEquals(title,BasePage.driver.getTitle());
    }
    @When("I click on continue button")
    public void SP_user_click_on_continue_button() throws InterruptedException {
        Thread.sleep(3000);
        BasePage.surveyPage.ContinueButtonOne.click();
    }
    @Then("I should be navigated to Cricket Survey with title {string}")
    public void SP_user_should_be_navigated_to_cricket_survey_with_title(String title) {
        Assertions.assertEquals(title,BasePage.driver.getTitle());
    }
    @When("I select Yes and click Continue page with title {string}")
    public void SP_user_select_yes_and_click_continue_page_with_title(String string) throws InterruptedException {
        Thread.sleep(3000);
        BasePage.surveyPage.YesRadio.click();
        Thread.sleep(3000);
        BasePage.surveyPage.ContinueButtonTwo.click();
    }
    @When("I enter What do you enjoy? enter as {string}")
    public void SP_user_enter_what_do_you_enjoy_enter_as(String comment) throws InterruptedException {
        Thread.sleep(3000);
      BasePage.surveyPage.enterComment(comment);
    }
    @When("I click Continue")
    public void SP_user_click_continue() throws InterruptedException {
        Thread.sleep(3000);
    BasePage.surveyPage.ContinueButton.click();
    }
    @Then("the response is submitted and message displays {string}")
    public void SP_user_the_response_is_submitted_and_message_displays(String string) {

    }
// from here SurveyPage No Scenario


}
