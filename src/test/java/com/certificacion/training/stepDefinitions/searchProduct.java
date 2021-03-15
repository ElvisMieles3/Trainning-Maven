package com.certificacion.training.stepDefinitions;

import com.certificacion.training.tasks.openBrowser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import com.certificacion.training.model.product;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class searchProduct {

    @Managed
    private WebDriver myBrowser;

    @Before
    public void setUpOnStage() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Elvis");
    }

    @Given("^que Elvis esta en el portal$")
    public void queElvisEstaEnElPortal() {
        OnStage.theActorInTheSpotlight().wasAbleTo(openBrowser.browser());
    }

    @When("^el ingresa el nombre del producto a buscar \"([^\"]*)\"$")
    public void elIngresaElNombreDelProductoABuscar(String data) {
       OnStage.theActorInTheSpotlight().attemptsTo(com.certificacion.training.tasks.searchProduct.withData(data));
    }

    @Then("^Elvis debe ver el producto (.*)$")
    public void elvisDebeVerElProductoFadedShortSleeveTShirts(String message) {
        theActorInTheSpotlight().should(seeThat(com.certificacion.training.questions.searchProduct.message(), org.hamcrest.Matchers.is(message)));

    }
}
