package com.certificacion.training.tasks;

import com.certificacion.training.userInterfaces.interfacesSearchProduct;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import com.certificacion.training.model.product;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class searchProduct implements Task {

    private String dataProduct;

    public searchProduct(String dataProduct) {

        this.dataProduct = dataProduct;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(dataProduct)
                .into(interfacesSearchProduct.SEARCH_MAIN));

        actor.attemptsTo(Click.on(interfacesSearchProduct.SUBMIT_SEARCH));

    }
    public static searchProduct withData(String dataProduct){
        return new searchProduct(dataProduct);
    }
}
