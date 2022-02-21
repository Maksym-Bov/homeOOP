package company.com.cheif.tools;

import company.com.cheif.vegetables.Vegetables;
import java.util.Comparator;

public class VegetablesSort {
    public static Comparator<Vegetables> vegetablesComparator = new VegetablesComparator() {
        public int compare(Vegetables o1, Vegetables o2) {
            return o1.getCalories() - o2.getCalories();
        }
    };
}
