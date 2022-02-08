package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car implements iCar {

    private String carBrand;
    private String carClass;
    private double weight;
    private Driver driver;
    private Engine engine;

    public Car(String carBrand, String carClass, double weight, Driver driver, Engine engine) {
        this.carBrand = carBrand;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public Car() {

    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public void start(){
        System.out.println("Поехали");
    }
    public void stop(){
        System.out.println("Останавливаемся");
    }
    public void turnRight(){
        System.out.println("Поворот направо");
    }
    public void turnLeft(){ System.out.println("Поворот налево"); }

    public  String toString(){

      return  "carBrand : " + carBrand  + "\n" +
              "carClass : " +  carClass + "\n" +
              "weight : " +  weight + "\n" +
              "driver : " + "\n" +
              "Firstname : " + driver.getFirstName() + "\n" +
              "Lastname : " + driver.getLastName() + "\n" +
              "Lastname : " + driver.getMiddleName() + "\n" +
              "Experience : " + driver.getDrivingExperience() + "\n"+
              "person : " + "\n" +
              "Birthday : " + driver.getBirthday() + "\n" +
              "Sex : " + driver.getSex() + "\n" +
              "Country : "+ driver.getIsFromCountry() + "\n" +
              "engine : " + "\n"  +
              "Power : " + engine.getPower() + "\n"  +
              "Producer : " + engine.getProducer() + "\n";

    }

}
