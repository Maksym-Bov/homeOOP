package company.com.air.tools;

import company.com.air.plane.Plane;

import java.util.Arrays;
import static java.util.Arrays.sort;

public class CreateAirline implements iCreateAirline {

    public void createAirline(Plane[] planesList) {
        String[] arrPlane = new String[planesList.length];
        int i = 0;
        for (Plane veg : planesList) {
            arrPlane[i] = String.valueOf(veg.getName());
            i++;
        }
        sort(arrPlane);
        System.out.println("Create New Airline completed:  " + Arrays.toString(arrPlane).replaceAll("[\\[\\]]", ""));
    }
}
