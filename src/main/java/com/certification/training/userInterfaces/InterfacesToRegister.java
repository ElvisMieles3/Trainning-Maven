package com.certification.training.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.apache.tools.ant.taskdefs.Tar;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;

public class InterfacesToRegister {

    public static final Target SIGN_IN = Target
            .the("Button sing in")
            .locatedBy("//*[@class='header_user_info']");

    public static final Target EMAIL_CREATE = Target
            .the("Copy email")
            .located(By.id("email_create"));

    public static final Target CREATE_ACCOUNT = Target
            .the("create account")
            .located(By.id("SubmitCreate"));

    public static final  Target CUSTOMER_FIRST_NAME = Target
            .the("First name")
            .located(By.id("customer_firstname"));

    public static final Target CUSTOMER_LAST_NAME = Target
            .the("Last name")
            .located(By.id("customer_lastname"));

    public static final Target  PASSWORD = Target
            .the("Password")
            .located(By.id("passwd"));

    public static final Target DAY = Target
            .the("Days")
            .located(By.id("days"));

    public static final Target MONTH = Target
            .the("Month")
            .located(By.id("months"));

    public static final Target YEAR = Target
            .the("YEAR")
            .located(By.id("years"));

    public  static final  Target NAME = Target
            .the("Name")
            .located(By.id("firstname"));

    public  static final Target LAST_NAME = Target
            .the("Last name")
            .located(By.id("lastname"));

    public static final Target COMPANY = Target
            .the("name company")
            .located(By.id("company"));

    public static final Target ADDRESS = Target
            .the("address")
            .located(By.id("address1"));

    public static final  Target CITY = Target
            .the("city")
            .located(By.id("city"));

    public static final  Target ID_STATE = Target
            .the("id_state")
            .located(By.id("id_state"));

    public static final Target POST_CODE = Target
            .the("postcode")
            .located(By.id("postcode"));

    public static final Target MOBILE = Target
            .the("phone_mobile")
            .located(By.id("phone_mobile"));


    public static final Target ADDRESS_ALIAS= Target
            .the("alias")
            .located(By.id("alias"));

    public static final Target REGISTER = Target
            .the("submitAccount")
            .located(By.id("submitAccount"));
}

