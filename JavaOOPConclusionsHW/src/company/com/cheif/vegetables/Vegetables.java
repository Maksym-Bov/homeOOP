package company.com.cheif.vegetables;

import company.com.cheif.vegetables.characteristic.VegetablesCalories;
import company.com.cheif.vegetables.characteristic.VegetablesName;

public abstract class Vegetables {

    private VegetablesName name;
    private VegetablesCalories calories;

    public Vegetables(VegetablesName name, VegetablesCalories calories) {
        this.name = name;
        this.calories = calories;
    }

    public VegetablesName getName() {
        return name;
    }

    public void setName(VegetablesName name) {
        this.name = name;
    }

    public VegetablesCalories getCalories() {
        return calories;
    }

    public void setCalories(VegetablesCalories calories) {
        this.calories = calories;
    }
}
