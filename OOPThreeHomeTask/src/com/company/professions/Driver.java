package com.company.professions;

public class Driver extends  Person {
    private String firstName;
    private String lastName;
    private String middleName;
    private int drivingExperience;

    public Driver( String firstName, String lastName, String middleName,String isFromCountry, String sex, int age, String birthday,int drivingExperience) {
        super(isFromCountry, sex, age, birthday);
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.drivingExperience = drivingExperience;
    }

    public  String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

}
