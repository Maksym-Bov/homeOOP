package company.com.recording.tools;

import company.com.recording.song.Song;

import java.util.ArrayList;
import java.util.List;

public class PickerSong {

    public Song[] getSongDuration(Song[] songs, int from, int to) {

        Song[] result = new Song[songs.length];
        List<Song> list = new ArrayList<>();

        for (int i = 0; i < songs.length; i++) {
            if ( from < songs[i].getDuration()  &&  songs[i].getDuration() < to ) {
                result[i] = songs[i];
            }
        }

        for (Song song : result) {
            if (song != null) {
                list.add(song);
            }
        }

        return list.toArray((new Song[0]));
    }

}
