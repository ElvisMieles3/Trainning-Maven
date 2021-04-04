package com.certification.training.stepDefinitions;

import com.certification.training.questions.The;
import com.certification.training.questions.TheButton;
import com.certification.training.tasks.OpenBrowser;
import com.certification.training.tasks.SearchProduct;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import  static net.serenitybdd.screenplay.GivenWhenThen.*;
import org.hamcrest.Matchers;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class SearchProductStepDefinitions {


    @When("^that Elvis search the product \"([^\"]*)\"$")
    public void thatElvisSearchTheProduct (String data) {

        theActorInTheSpotlight().attemptsTo(OpenBrowser.browser());

        theActorInTheSpotlight().attemptsTo(SearchProduct.withData(data));
    }

    @Then("^Elvis must see product (.*)$")
    public void elvisMustSeeProduct(String message) {
        theActorInTheSpotlight().should(seeThat(The.product(), Matchers.equalTo(message)));
    }

    @Then("^Elvis see the product in stock$")
    public void elvisSeeTheProductInStock() {
        theActorInTheSpotlight().should(seeThat(TheButton.isPresent(),Matchers.equalTo(true)));

    }
}
