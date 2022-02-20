package company.com.cheif.vegetables;

import company.com.cheif.vegetables.characteristic.VegetablesName;

public abstract class Vegetables {

    private VegetablesName name;
    private int calories;

    public Vegetables(VegetablesName name, int calories) {
        this.name = name;
        this.calories = calories;
    }
    public VegetablesName getName() {
        return name;
    }

    public void setName(VegetablesName name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}
