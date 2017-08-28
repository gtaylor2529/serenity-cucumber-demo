package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.serenity.NavigationSteps;

public class NavigationStepDefs {

    @Steps
    NavigationSteps navigationStepsUser;

    @Given("^I am on the Valtech home page$")
    public void iAmOnTheValtechHomePage() throws Throwable {
       navigationStepsUser.isOnTheHomePage();
    }

    @Then("^the (.*) section is displayed$")
    public void theSectionIsDisplayed(String section) throws Throwable {
        navigationStepsUser.shouldSeeTheSection(section);
    }

    @When("^I navigate to the (.*) page$")
    public void iNavigateToThePageNamePage(String pageName) throws Throwable {
        navigationStepsUser.goesToThePage(pageName);
    }
}
