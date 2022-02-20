package company.com.recording.song.characteristic;

public enum SongName {
    RAPEME("Rape me"),
    AERIALS("Aerials"),
    ADDICTEDTOYOU("Addicted to you");

    String name;
    SongName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
}


