package company.com.cheif.vegetables.model;

import company.com.cheif.vegetables.Vegetables;
import company.com.cheif.vegetables.characteristic.VegetablesCalories;
import company.com.cheif.vegetables.characteristic.VegetablesName;

public class Tomato extends Vegetables {
    public Tomato(){
        super(VegetablesName.TOMATO, VegetablesCalories.TOMATOCALORIES);
    }
}
