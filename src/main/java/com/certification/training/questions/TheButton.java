package com.certification.training.questions;

import com.certification.training.userInterfaces.InterfacesSearchProduct;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TheButton implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {

       return InterfacesSearchProduct.BTN_STOCK.resolveFor(actor).isCurrentlyVisible();

    }

    public static TheButton isPresent(){
        return new TheButton();
    }
}
