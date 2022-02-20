package company.com.recording.song.characteristic;

public enum SongGenre {
    HARDROCK("Hard rock"),
    ROCK("Rock"),
    ELECTRONIC("Electronic");

    String name;
    SongGenre(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
}
