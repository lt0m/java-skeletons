package io.github.lt0m.skeletons.project.features;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import cucumber.api.PendingException;

public class SearchSteps extends SpringBootTestApplicationBase {

    @When("^I search for information code \"([^\"]*)\"$")
    public void iSearchForCode(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I receive empty instructions list$")
    public void iReceiveEmptyInstructionsList() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
