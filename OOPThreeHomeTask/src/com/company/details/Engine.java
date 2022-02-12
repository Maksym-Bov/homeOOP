package com.company.details;

public class Engine implements iEngine {
    private int power;
    private String producer;

    public Engine(int power, String producer) {
        this.power = power;
        this.producer = producer;
    }

    public int getPower() {
        return power;
    }

    public String getProducer() {
        return producer;
    }
}
