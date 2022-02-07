package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends  Car{

    private double bodyLoadCapacity;

    public Lorry(String carBrand, String carClass, double weight, double bodyLoadCapacity, Driver driver, Engine engine) {
        super(carBrand,carClass,weight,driver,engine);
        this.bodyLoadCapacity = bodyLoadCapacity;
    }

    public double getBodyLoadCapacity() {
        return bodyLoadCapacity;
    }

    public void setBodyLoadCapacity(double bodyLoadCapacity) {
        this.bodyLoadCapacity = bodyLoadCapacity;
    }
}
