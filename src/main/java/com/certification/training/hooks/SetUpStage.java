package com.certification.training.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class SetUpStage {

    @Managed
    private static WebDriver hisBrowser;

    @Before
    public void setUpStage(){
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(hisBrowser)));
        OnStage.theActorCalled("Elvis");
    }

    @After
    public void closeTheStage(){
        OnStage.drawTheCurtain();
    }
}
