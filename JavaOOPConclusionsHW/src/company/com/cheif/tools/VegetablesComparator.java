package company.com.cheif.tools;

import company.com.cheif.vegetables.Vegetables;

import java.util.Comparator;

public class VegetablesComparator implements Comparator<Vegetables> {
        @Override
        public int compare(Vegetables v1, Vegetables v2) {
            return v1.getCalories() - v2.getCalories();
        }
}
