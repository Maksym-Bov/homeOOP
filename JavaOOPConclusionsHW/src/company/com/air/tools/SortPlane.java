package company.com.air.tools;

import company.com.air.plane.Plane;

import java.util.Comparator;

public class SortPlane {

    public static Comparator<Plane> flightRangePlane = new Comparator<Plane>() {
        public int compare(Plane planeRange1, Plane planeRange2) {
            return planeRange1.getFlightRange() - planeRange2.getFlightRange();
        }

    };
}

