package company.com.cheif.vegetables.characteristic;

public enum VegetablesCalories {
    POTATOCALORIES(85),
    BEETCALORIES(45),
    ONIONCALORIES(40),
    CABBAGECALORIES(25),
    TOMATOCALORIES(24);

    int calories;

    VegetablesCalories(int calories) {
        this.calories = calories;
    }
}
