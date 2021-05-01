package com.certification.training.questions;

import com.certification.training.userInterfaces.MyAccount;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TheUser implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return MyAccount.USER_NAME.resolveFor(actor).getText();
    }

    public static TheUser nameIs(){
        return new TheUser();
    }
}
