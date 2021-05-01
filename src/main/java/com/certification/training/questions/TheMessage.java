package com.certification.training.questions;

import com.certification.training.userInterfaces.MyAccount;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TheMessage implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return MyAccount.ACCOUNT.resolveFor(actor).getText();
    }
    public static TheMessage is(){
        return new TheMessage();
    }
}
