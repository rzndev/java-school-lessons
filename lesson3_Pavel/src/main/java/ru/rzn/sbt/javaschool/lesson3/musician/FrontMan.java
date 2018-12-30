package ru.rzn.sbt.javaschool.lesson3.musician;

public class FrontMan extends Musician {
    private static final String[] chords = {
            "C# G# F#",
            "C# G# F#",
            "Em E A5 C",
            "Em G Em G",
};

    private static final String[] songs = {
            "Take advantage while",
            "You hang me out to dry",
            "But I can't see you every night",
            "Free I do",
    };
    private int current_chord = 0;
    private int current_song = 0;

    private Object lockGuitar = new Object();
    private Object lockSing = new Object();

    @Override
    protected String playGuitar() {
        String result = "";
        synchronized (lockGuitar) {
            int new_chord = current_chord + 1;
            if (new_chord == chords.length) new_chord = 0;
            result = chords[current_chord];
            current_chord = new_chord;
            return result;
        }

    }

    @Override
    protected String sing() {
        String result = "";
        synchronized (lockSing) {
            int new_song = current_song + 1;
            if (new_song == songs.length) new_song = 0;
            result = songs[current_song];
            current_song = new_song;
        }
        return result;
    }
}
