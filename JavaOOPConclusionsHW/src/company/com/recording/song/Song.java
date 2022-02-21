package company.com.recording.song;

import company.com.recording.song.characteristic.SongGenre;
import company.com.recording.song.characteristic.SongName;

public abstract class Song {
    private SongName name;
    private SongGenre genre;
    private int duration;

    public Song(SongName name, SongGenre genre, int duration) {
        this.name = name;
        this.genre = genre;
        this.duration = duration;
    }

    public SongName getName() {
        return name;
    }

    public void setName(SongName name) {
        this.name = name;
    }

    public SongGenre getGenre() {
        return genre;
    }

    public void setGenre(SongGenre genre) {
        this.genre = genre;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
