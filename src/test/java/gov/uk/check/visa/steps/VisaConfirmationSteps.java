package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class VisaConfirmationSteps {

        @Given("I am on homepage")
        public void iAmOnHomepage() {

        }

        @When("I click on accept cookies")
        public void iClickOnAcceptCookies() {
                new StartPage().acceptAllCookies();

        }

        @And("I click on start button")
        public void iClickOnStartButton() {
                new StartPage().clickOnStartButton();
        }

        @When("I select nationality {string}")
        public void iSelectNationality(String nationality) {
                new SelectNationalityPage().selectNationality(nationality);
        }

        @And("I click on continue button")
        public void iClickOnContinueButton() {
                new SelectNationalityPage().clickNextStepButton();
        }

        @And("I select reason {string}")
        public void iSelectReason(String reason) {
                new ReasonForTravelPage().selectReasonForVisit(reason);
        }

        @Then("You will not need a visa to come to the UK message is displayed")
        public void youWillNotNeedAVisaToComeToTheUKMessageIsDisplayed() {
                Assert.assertEquals(new ResultPage().getResultMessageTourism(),
                        "You will not need a visa to come to the UK", "Unable to verify message");
        }

        @And("I select intend to stay for {string}")
        public void iSelectIntendToStayForLongerThanMonths(String moreOrLess) {
                new DurationOfStayPage().selectLengthOfStay(moreOrLess);
        }

        @Then("You need a visa to work in health and care message is displayed")
        public void youNeedAVisaToWorkInHealthAndCareMessageIsDisplayed() {
                Assert.assertEquals(new ResultPage().getResultMessageHealthcare(),"You need a visa to work in health and care","Error in visa message");
        }

        @And("I select have planning to work for {string}")
        public void iSelectHavePlanningToWorkFor(String job) {
                new WorkTypePage().selectJobType(job);
        }
}

