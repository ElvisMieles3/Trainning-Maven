package com.certification.training.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InterfacesSearchProduct {

    public static final Target SEARCH_MAIN = Target.
            the("Search bar").
            located(By.id("search_query_top"));

    public static final Target SUBMIT_SEARCH = Target.
            the("Search button").
            located(By.name("submit_search"));

    public static final Target PRODUCT_TITLE = Target.
            the("result").
            locatedBy("//span[@class='lighter']");

    public static final Target BTN_STOCK = Target.
            the("Button stock").
            locatedBy("//*[@class='available-now']");
}