package com.certification.training.tasks;

import com.certification.training.userInterfaces.InterfacesSearchProduct;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SearchProduct implements Task {

    private String dataProduct;

    public SearchProduct(String dataProduct) {

        this.dataProduct = dataProduct;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(dataProduct)
                .into(InterfacesSearchProduct.SEARCH_MAIN));

        actor.attemptsTo(Click.on(InterfacesSearchProduct.SUBMIT_SEARCH));

    }
    public static SearchProduct withData(String dataProduct){

        return Tasks.instrumented(SearchProduct.class, dataProduct);
    }
}
