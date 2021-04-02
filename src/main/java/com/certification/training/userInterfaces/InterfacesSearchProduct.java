package com.certification.training.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InterfacesSearchProduct {

    public static final Target SEARCH_MAIN = Target.
            the("Buscador principal").
            located(By.id("search_query_top"));

    public static final Target SUBMIT_SEARCH = Target.
            the("Botón de buscar").
            located(By.name("submit_search"));

    public static final Target PRODUCT_TITLE = Target.
            the("Botón de buscar").
            locatedBy("//span[@class='lighter']");
}