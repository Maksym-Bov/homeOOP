package company.com.cheif.tools;

import company.com.cheif.vegetables.Vegetables;

public class SaladCountCalories {
    private int Calories;
    public  void countCalories(Vegetables[] vegetablesList){
        int resultCalories = Calories;
        for (Vegetables veg: vegetablesList){
            resultCalories += veg.getCalories();
        }
        System.out.println("Total calories: " + resultCalories + " kcal");
    }
}
