package company.com.cheif.vegetables.model;

import company.com.cheif.vegetables.Vegetables;
import company.com.cheif.vegetables.characteristic.VegetablesCalories;
import company.com.cheif.vegetables.characteristic.VegetablesName;

public class Beet extends Vegetables {

    public Beet(){
        super(VegetablesName.BEET, VegetablesCalories.BEETCALORIES);
    }
}
