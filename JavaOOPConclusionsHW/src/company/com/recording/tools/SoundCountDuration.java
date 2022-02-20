package company.com.recording.tools;

import company.com.recording.song.Song;

public class SoundCountDuration {
    private int duration;
    public void countDuration(Song[] songs){
        int resultDuration = duration;
        for (Song song:songs) {
            resultDuration += song.getDuration();
        }
        System.out.println("Total sound duration: " + resultDuration + " seconds");

    }
}
