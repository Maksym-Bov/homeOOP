package company.com.recording.tools;

import company.com.recording.song.Song;
import java.util.Comparator;

public class SongSort implements Comparator <Song> {

    @Override
    public int compare(Song song1, Song song2) {
            return song1.getGenre().compareTo(song2.getGenre());
        }

}
