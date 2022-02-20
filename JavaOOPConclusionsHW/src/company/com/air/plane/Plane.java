package company.com.air.plane;

import company.com.air.plane.characteristic.PlaneName;

public abstract class Plane {
    private PlaneName name;
    private  int capacity;
    private  int carryingCapacity;
    private  int flightRange;
    private  int fuelConsumption;

    public Plane(PlaneName name, int capacity, int carryingCapacity, int flightRange, int fuelConsumption) {
        this.name = name;
        this.capacity = capacity;
        this.carryingCapacity = carryingCapacity;
        this.flightRange = flightRange;
        this.fuelConsumption = fuelConsumption;
    }

    public PlaneName getName() {
        return name;
    }

    public void setName(PlaneName name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public int getFlightRange() {
        return flightRange;
    }

    public void setFlightRange(int flightRange) {
        this.flightRange = flightRange;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
