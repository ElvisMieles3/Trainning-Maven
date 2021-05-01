package com.certification.training.userInterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MyAccount {

    public static final Target ACCOUNT = Target
            .the("account")
            .locatedBy("//*[@class='page-heading']");

    public static final Target USER_NAME = Target
            .the("User name")
            .located(By.className("account"));


}
