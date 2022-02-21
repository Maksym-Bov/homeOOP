package company.com.air.plane.model;

import company.com.air.plane.Plane;
import company.com.air.plane.characteristic.PlaneName;

public class An225 extends Plane {
    public An225(){
        super(PlaneName.AN225,6,250000,15400,300000);
    }
}
