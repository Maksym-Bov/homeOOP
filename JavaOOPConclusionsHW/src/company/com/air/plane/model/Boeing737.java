package company.com.air.plane.model;

import company.com.air.plane.Plane;
import company.com.air.plane.characteristic.PlaneName;

public class Boeing737 extends Plane {
    public Boeing737(){
        super(PlaneName.BOEING737,103,43000,2592,13339);
    }
}
