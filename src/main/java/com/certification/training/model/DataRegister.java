package com.certification.training.model;

public class DataRegister {

    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private String dateMonth;
    private String dateDay;
    private String dateYear;
    private String addressName;
    private String addressLastName;
    private String addressCompany;
    private String addressCity;
    private String state;
    private String postalCode;
    private String country;
    private String addressReference;
    private String mobilePhone;

    public DataRegister(String email, String firstName, String lastName, String password, String dateMonth, String dateDay, String dateYear, String addressName, String addressLastName, String addressCompany, String addressCity, String state, String postalCode, String country, String addressReference, String mobilePhone) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.dateMonth = dateMonth;
        this.dateDay = dateDay;
        this.dateYear = dateYear;
        this.addressName = addressName;
        this.addressLastName = addressLastName;
        this.addressCompany = addressCompany;
        this.addressCity = addressCity;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
        this.addressReference = addressReference;
        this.mobilePhone = mobilePhone;
    }

    public String getEmail( ) {
        return email;
    }

    public String getFirstName( ) {
        return firstName;
    }

    public String getLastName( ) {
        return lastName;
    }

    public String getPassword( ) {
        return password;
    }

    public String getDateMonth( ) {
        return dateMonth;
    }

    public String getDateDay( ) {
        return dateDay;
    }

    public String getDateYear( ) {
        return dateYear;
    }

    public String getAddressName( ) {
        return addressName;
    }

    public String getAddressLastName( ) {
        return addressLastName;
    }

    public String getAddressCompany( ) {
        return addressCompany;
    }

    public String getAddressCity( ) {
        return addressCity;
    }

    public String getState( ) {
        return state;
    }

    public String getPostalCode( ) {
        return postalCode;
    }

    public String getCountry( ) {
        return country;
    }

    public String getAddressReference( ) {
        return addressReference;
    }

    public String getMobilePhone( ) {
        return mobilePhone;
    }
}
