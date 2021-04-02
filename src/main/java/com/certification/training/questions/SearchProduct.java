package com.certification.training.questions;

import com.certification.training.userInterfaces.InterfacesSearchProduct;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class SearchProduct implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.
                the((InterfacesSearchProduct.PRODUCT_TITLE),
                        WebElementStateMatchers.isVisible()));

        return Text.of(InterfacesSearchProduct.PRODUCT_TITLE).
                viewedBy(actor).asString();
    }

    public static SearchProduct message(){

        return new SearchProduct();
    }

}
