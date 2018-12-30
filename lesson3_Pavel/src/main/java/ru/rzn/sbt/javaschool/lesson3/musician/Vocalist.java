package ru.rzn.sbt.javaschool.lesson3.musician;

public class Vocalist extends Musician {

    private static final String[] songs = {
            "Take me to the magic of the moment",
            "on a glory night",
            "Where the children of tomorrow dream away",
            "In the Wind of Change",
    };

    private int current_song = 0;
    private Object lock = new Object();

    @Override
    protected String playGuitar() {
        return null;
    }

    @Override
    protected String sing() {
        String result = "";
        synchronized (lock) {
        int new_song = current_song + 1;
        if (new_song == songs.length) new_song = 0;
        result = songs[current_song];
        current_song = new_song;
        }
        return result;
    }
}
