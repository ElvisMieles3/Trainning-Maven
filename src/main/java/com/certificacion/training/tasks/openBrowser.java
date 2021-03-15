package com.certificacion.training.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class openBrowser implements Task {

    @Override
    public <T extends Actor> void performAs(T elvis) {
        elvis.attemptsTo(Open.url("http://automationpractice.com/index.php"));
    }

    public static  openBrowser browser(){

        return Tasks.instrumented(openBrowser.class);
    }
}
