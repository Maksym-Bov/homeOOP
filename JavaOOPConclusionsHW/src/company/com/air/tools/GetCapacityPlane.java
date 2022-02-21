package company.com.air.tools;

import company.com.air.plane.Plane;

public class GetCapacityPlane {
    private int capacity;
    public void  countCapacityPlane(Plane[] planes){
        int resultCapacity = capacity;
        for(Plane plane: planes){
            resultCapacity += plane.getCapacity();
        }
        System.out.println("Total Capacity: " + resultCapacity + " people");
    }

}
