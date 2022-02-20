package company.com.air.tools;

import company.com.air.plane.Plane;

public class GetCarryingCapacityPlane {
    private int carryingCapacity;
    public void  countCarryingCapacityPlane(Plane[] planes){
        int resultCarryingCapacity = carryingCapacity;
        for(Plane plane: planes){
            resultCarryingCapacity += plane.getCapacity();
        }
        System.out.println("Total Carrying Capacity: " + resultCarryingCapacity + " tons");
    }
}
