package company.com.cheif.tools;

import company.com.cheif.vegetables.Vegetables;

import java.util.ArrayList;
import java.util.List;

public class VegetablesPicker {

    public Vegetables[] getVegetablesCalories(Vegetables[] vegetables, int from,int to) {

        Vegetables[] result = new Vegetables[vegetables.length];
        List<Vegetables> list = new ArrayList<>();

        for (int i = 0; i < vegetables.length; i++) {
            if ( from < vegetables[i].getCalories() && vegetables[i].getCalories() < to ) {
                result[i] = vegetables[i];
            }
        }

        for (Vegetables vegetable : result) {
            if (vegetable != null) {
                list.add(vegetable);
            }
        }

        return list.toArray((new Vegetables[0]));
    }
}
