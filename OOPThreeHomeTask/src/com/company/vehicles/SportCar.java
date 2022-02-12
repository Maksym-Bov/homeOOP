package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends  Car {
    private int topSpeed;

    public SportCar(String carBrand, String carClass, double weight, int topSpeed, Driver driver, Engine engine) {
        super(carBrand,carClass,weight,driver,engine);
        this.topSpeed = topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getTopSpeed() {
        return topSpeed;
    }
}
