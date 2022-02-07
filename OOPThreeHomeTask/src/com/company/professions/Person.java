package com.company.professions;

public class Person {
    private String isFromCountry;
    private String sex;
    private int age;
    private String birthday;
    public Person(){}
    public Person(String isFromCountry, String sex, int age, String birthday) {
    }

    public String getIsFromCountry() {
        return isFromCountry;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public String getBirthday() {
        return birthday;
    }
    @Override
    public String  toString(){
        return "person : " + "\n" +
                "Country : " + isFromCountry + " " +
                "Sex : " + sex + " " +
                "Age : " + age + " " +
                "Birthday : " + birthday;
    }
}
