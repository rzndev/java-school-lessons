package ru.rzn.sbt.javaschool.lesson3.musician;

public class GuitarPlayer extends Musician {
    private static final String[] chords = {
            "C G Dm G",
            "C G",
            "Dm G Am",
            "Am/F G",
    };

    private int current_chord = 0;

    private Object lock = new Object();
    @Override
    protected String playGuitar() {
        String result = "";
        synchronized (lock) {
            int new_chord = current_chord + 1;
            if (new_chord == chords.length) new_chord = 0;
            result = chords[current_chord];
            current_chord = new_chord;
            return result;
        }
    }

    @Override
    protected String sing() {
        return null;
    }
}
