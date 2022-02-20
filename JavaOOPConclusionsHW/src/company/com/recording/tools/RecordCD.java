package company.com.recording.tools;

import static java.util.Arrays.sort;
import company.com.recording.song.Song;

import java.util.Arrays;

public class RecordCD implements iRecordCD {

    public void recordSongCD(Song[] songsList) {
        String[] arrSong = new String[songsList.length];
        int i = 0;
        for (Song veg : songsList) {
            arrSong[i] = String.valueOf(veg.getName());
            i++;
        }
        sort(arrSong);
        System.out.println("Record completed on CD " + Arrays.toString(arrSong).replaceAll("[\\[\\]]", ""));
    }
}