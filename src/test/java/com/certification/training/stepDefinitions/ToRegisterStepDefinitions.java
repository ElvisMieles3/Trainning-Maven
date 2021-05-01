package com.certification.training.stepDefinitions;

import com.certification.training.model.DataRegister;
import com.certification.training.questions.TheMessage;
import com.certification.training.questions.TheUser;
import com.certification.training.tasks.OpenBrowser;
import com.certification.training.tasks.ToRegister;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import java.util.List;

public class ToRegisterStepDefinitions {


    @Given("^Elvis open the web$")
    public void elvisOpenTheWeb( ) {
        OnStage.theActorInTheSpotlight().attemptsTo(OpenBrowser.browser());
    }

    @When("^the Elvis record the data$")
    public void theElvisRecordTheData(List<DataRegister> dataRegisters) {

        OnStage.theActorInTheSpotlight().attemptsTo(ToRegister.withData(dataRegisters.get(0)));
    }

    @Then("^he sees the menssage \"([^\"]*)\"$")
    public void heSeesTheMenssage(String message) {

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheMessage.is(), Matchers.equalTo(message)));
    }

    @Then("^he sees the user name \"([^\"]*)\"$")
    public void heSeesTheUserName(String userName) {
      OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheUser.nameIs(), Matchers.equalTo(userName)));
    }

}
