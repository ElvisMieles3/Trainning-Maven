package com.certification.training.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/search_product.feature"
        , glue = {"com.certification.training.stepDefinitions","com.certification.training.hooks"}
        , snippets = SnippetType.CAMELCASE)
public class SearchProduct {
}
