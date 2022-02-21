package company.com.init;

import company.com.air.plane.Plane;
import company.com.air.plane.model.An225;
import company.com.air.plane.model.Boeing737;
import company.com.air.plane.model.Boeing777;
import company.com.air.tools.*;

import company.com.cheif.tools.SaladCountCalories;
import company.com.cheif.tools.SaladCreate;
import company.com.cheif.tools.VegetablesPicker;
import company.com.cheif.tools.VegetablesSort;
import company.com.cheif.vegetables.Vegetables;
import company.com.cheif.vegetables.model.*;

import company.com.recording.song.Song;
import company.com.recording.song.model.AddictedToYou;
import company.com.recording.song.model.Aerials;
import company.com.recording.song.model.RapeMe;
import company.com.recording.tools.PickerSong;
import company.com.recording.tools.RecordCD;
import company.com.recording.tools.SongSort;
import company.com.recording.tools.SoundCountDuration;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("Cheif");

        SaladCreate saladCreate = new SaladCreate();
        SaladCountCalories saladCountCalories = new SaladCountCalories();
        VegetablesPicker vegetablesPicker = new VegetablesPicker();
        Vegetables [] vegetables =new Vegetables[]{new Onion(),new Potato(),new Beet(),new Tomato(),new Cabbage()};
        saladCreate.createSalad(vegetables);
        saladCountCalories.countCalories(vegetables);
        Arrays.sort(vegetables, VegetablesSort.vegetablesComparator);
        for (Vegetables vegetable : vegetables) {
            System.out.print(vegetable.getName() + " : ");
            System.out.println(vegetable.getCalories() + " kcal");
        }
        System.out.println("____________________________________");
        Vegetables[] CaloriesVegetables = vegetablesPicker.getVegetablesCalories(vegetables,40,60);
        for (Vegetables vegetable : CaloriesVegetables) {
            System.out.print(vegetable.getName() + " : ");
            System.out.println(vegetable.getCalories() + " kcal");
        }
        System.out.println("____________________________________");

        System.out.println("Recording");

        RecordCD recordCD = new RecordCD();
        SoundCountDuration soundCountDuration = new SoundCountDuration();
        SongSort songSort = new SongSort();
        PickerSong pickerSong = new PickerSong();
        Song[] songs = new Song[]{new AddictedToYou(),new Aerials(),new RapeMe()};

        recordCD.recordSongCD(songs);
        soundCountDuration.countDuration(songs);
        Arrays.sort(songs, songSort);
        for (Song song : songs) {
            System.out.print(song.getName() + " : ");
            System.out.println(song.getDuration() + " seconds");
        }
        System.out.println("____________________________________");
        Song[] songsDuration = pickerSong.getSongDuration(songs,100,200);
        for (Song song : songsDuration) {
            System.out.print(song.getName() + " : ");
            System.out.println(song.getDuration() + " seconds");
        }
        System.out.println("____________________________________");

        System.out.println("Plane");

        CreateAirline createAirline = new CreateAirline();
        GetCapacityPlane getCapacityPlane = new GetCapacityPlane();
        GetCarryingCapacityPlane getCarryingCapacityPlane = new GetCarryingCapacityPlane();
        PickerPlane pickerPlane = new PickerPlane();
        Plane [] planes = new Plane[]{new Boeing777(),new Boeing737(),new An225()};

        createAirline.createAirline(planes);
        getCapacityPlane.countCapacityPlane(planes);
        getCarryingCapacityPlane.countCarryingCapacityPlane(planes);
        Arrays.sort(planes, SortPlane.flightRangePlane);
        for (Plane plane : planes) {
            System.out.print(plane.getName() + " : ");
            System.out.println(plane.getFlightRange() + " km");
        }
        Plane[] planesFuelConsumption = pickerPlane.getFuelConsumption(planes,80000,250000);
        for (Plane plane : planesFuelConsumption){
            System.out.print(plane.getName() + " : ");
            System.out.println(plane.getFuelConsumption() + " tons");
        }
    }
}
