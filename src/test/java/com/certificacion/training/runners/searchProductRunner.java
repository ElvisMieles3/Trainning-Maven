package com.certificacion.training.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/searchProduct.feature"
        , glue = "com.certificacion.training.stepDefinitions"
        , snippets = SnippetType.CAMELCASE)
public class searchProductRunner {
}
