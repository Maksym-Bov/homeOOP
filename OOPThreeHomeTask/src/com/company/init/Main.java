package com.company.init;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;


public class Main {
    public static void main (String[] args){

        Car car = new Car();

        Driver driverCar = new Driver("Jack","Junior","Jankovich","Ukraine","male",54,"31.02.1968",12);
        Engine engineCar = new Engine(140,"Germany");
        Car car1 = new Car ("Audi","C",1500,driverCar,engineCar);

        Driver driverSport = new Driver("Ben","Ghost","Look","Ukraine","male",23,"31.02.1999",4);
        Engine engineSportCar = new Engine(1001,"England");
        SportCar sportCar = new SportCar("Lotus","E",1000,400,driverSport,engineSportCar);

        Driver driverLorry = new Driver("Jany","Pert","Mykolaivna","Ukraine","female",34,"31.02.1988",9);
        Engine engineLorry = new Engine(2500,"Norway");
        Lorry lorry = new Lorry("Volvo","B",3000,20000,driverLorry,engineLorry);


        car.start();
        car.stop();
        car.turnLeft();
        car.turnRight();

        System.out.println(lorry.toString());
        System.out.println(sportCar.toString());
        System.out.println(car1.toString());
    }

}
