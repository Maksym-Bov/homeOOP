package company.com.air.tools;

import company.com.air.plane.Plane;
import company.com.recording.song.Song;

import java.util.ArrayList;
import java.util.List;

public class PickerPlane {

    public Plane[] getFuelConsumption(Plane[] planes, int from, int to) {

        Plane[] result = new Plane[planes.length];
        List<Plane> list = new ArrayList<>();
        for (int i = 0; i < planes.length; i++) {
            if ( from < planes[i].getFuelConsumption()  &&  planes[i].getFuelConsumption() < to ) {
                result[i] = planes[i];
            }
        }
        for (Plane plane : result) {
            if (plane != null) {
                list.add(plane);
            }
        }

        return list.toArray((new Plane[0]));
    }

}
