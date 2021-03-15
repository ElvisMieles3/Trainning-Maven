package com.certificacion.training.questions;

import com.certificacion.training.userInterfaces.interfacesSearchProduct;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class searchProduct implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the((interfacesSearchProduct.PRODUCT_TITLE), WebElementStateMatchers.isVisible()));
        return Text.of(interfacesSearchProduct.PRODUCT_TITLE).viewedBy(actor).asString();
    }

    public static searchProduct message(){

        return new searchProduct();
    }

}
