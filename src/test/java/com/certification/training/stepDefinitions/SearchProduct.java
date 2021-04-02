package com.certification.training.stepDefinitions;

import com.certification.training.questions.SearchProduct;
import com.certification.training.tasks.OpenBrowser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class SearchProduct {

    @Managed
    private WebDriver myBrowser;

    @Before
    public void setUpOnStage() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Elvis");
    }

    @Given("^que Elvis esta en el portal$")
    public void queElvisEstaEnElPortal() {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenBrowser.browser());
    }

    @When("^el ingresa el nombre del producto a buscar \"([^\"]*)\"$")
    public void elIngresaElNombreDelProductoABuscar(String data) {
       OnStage.theActorInTheSpotlight().attemptsTo(com.certification.training.tasks.SearchProduct.withData(data));
    }

    @Then("^Elvis debe ver el producto (.*)$")
    public void elvisDebeVerElProductoFadedShortSleeveTShirts(String message) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(com.certification.training.questions.SearchProduct.message(), org.hamcrest.Matchers.is(message)));

    }
}
