package com.certification.training.tasks;

import com.certification.training.model.DataRegister;
import com.certification.training.userInterfaces.InterfacesToRegister;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class ToRegister implements Task {

    private final DataRegister dataRegister;

    public ToRegister(DataRegister dataRegister) {

        this.dataRegister = dataRegister;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(InterfacesToRegister.SIGN_IN),
                Enter.theValue(dataRegister.getEmail())
                        .into(InterfacesToRegister.EMAIL_CREATE),
                Click.on(InterfacesToRegister.CREATE_ACCOUNT));

        actor.attemptsTo(Enter.theValue(dataRegister.getFirstName())
                .into(InterfacesToRegister.CUSTOMER_FIRST_NAME));

        actor.attemptsTo(Enter.theValue(dataRegister.getLastName())
                .into(InterfacesToRegister.CUSTOMER_LAST_NAME));

        actor.attemptsTo(Enter.theValue(dataRegister.getPassword())
                .into(InterfacesToRegister.PASSWORD));

        actor.attemptsTo(SelectFromOptions.byValue(dataRegister.getDateDay())
                .from(InterfacesToRegister.DAY));

        actor.attemptsTo(SelectFromOptions
                .byVisibleText(dataRegister.getDateMonth() + " ")
                .from(InterfacesToRegister.MONTH));

        actor.attemptsTo(SelectFromOptions
                .byVisibleText(dataRegister.getDateYear() + "  ")
                .from(InterfacesToRegister.YEAR));

        actor.attemptsTo(Enter.theValue(dataRegister.getAddressName())
                .into(InterfacesToRegister.ADDRESS));

        actor.attemptsTo(Enter.theValue(dataRegister.getAddressLastName())
                .into(InterfacesToRegister.LAST_NAME));

        actor.attemptsTo(Enter.theValue(dataRegister.getAddressCompany())
                .into(InterfacesToRegister.COMPANY));

        actor.attemptsTo(Enter.theValue(dataRegister.getAddressCity())
                .into(InterfacesToRegister.CITY));

        actor.attemptsTo(SelectFromOptions
                .byVisibleText(dataRegister.getState())
                .from(InterfacesToRegister.ID_STATE));

        actor.attemptsTo(Enter.theValue(dataRegister.getPostalCode())
                .into(InterfacesToRegister.POST_CODE));

        actor.attemptsTo(Enter.theValue(dataRegister.getMobilePhone())
                .into(InterfacesToRegister.MOBILE));

        actor.attemptsTo(Enter.theValue(dataRegister.getAddressReference())
                .into(InterfacesToRegister.ADDRESS_ALIAS));

        actor.attemptsTo(Click.on(InterfacesToRegister.REGISTER));





    }

    public static ToRegister withData(DataRegister dataRegister) {
        return Tasks.instrumented(ToRegister.class, dataRegister);
    }
}
