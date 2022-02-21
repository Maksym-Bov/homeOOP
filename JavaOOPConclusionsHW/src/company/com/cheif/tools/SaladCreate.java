package company.com.cheif.tools;

import company.com.cheif.vegetables.Vegetables;
import java.util.Arrays;
import static java.util.Arrays.sort;

public class SaladCreate implements iSaladCreate {
    private String[] arrRecipe = {"Onion", "Potato", "Beet", "Tomato", "Cabbage"};


    public SaladCreate() {
    }
    public void createSalad(Vegetables[] vegetablesList) {
        String[] arrVegetables = new String[vegetablesList.length];
        int i = 0;
        for (Vegetables veg : vegetablesList) {
            arrVegetables[i] = String.valueOf(veg.getName());
            i++;
        }
        sort(arrVegetables);
        sort(arrRecipe);
        String formatArr = Arrays.toString(arrRecipe).replaceAll("[\\[\\]]", "");
        String result = (Arrays.equals(arrRecipe, arrVegetables)) ? "Create Salad Greek : " : "To make a  Greek salad you need such vegetables " + formatArr;
        System.out.print(result);
        System.out.println(formatArr);
    }

}

