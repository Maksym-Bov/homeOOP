package company.com.air.plane.model;

import company.com.air.plane.Plane;
import company.com.air.plane.characteristic.PlaneName;

public class Boeing777 extends Plane {
    public Boeing777(){
        super(PlaneName.BOEING777,705,247210,9625,117000);
    }
}
