package pl.globallogic.exercises;

import java.util.ArrayList;
import java.util.LinkedList;

public class ex49PlaylistInnerClass {

    private final ArrayList<ex45Album> albums;

    public ex49PlaylistInnerClass() {
        albums = new ArrayList<>();
    }

    public boolean addAlbum(String albumTitle, String artist) {
        if (findAlbum(albumTitle) == null) {
            albums.add(new ex45Album(albumTitle, artist));
            return true;
        }
        return false;
    }

    public ex45Album findAlbum(String albumTitle) {
        for (ex45Album album : albums) {
            if (album.getName().equals(albumTitle)) {
                return album;
            }
        }
        return null;
    }

    private static class SongList {

        private final ArrayList<ex45Song> songs;

        public SongList() {
            songs = new ArrayList<>();
        }

        public boolean add(ex45Song song) {
            if (!songs.contains(song)) {
                songs.add(song);
                return true;
            }
            return false;
        }

        public ex45Song findSong(String title) {
            for (ex45Song song : songs) {
                if (song.getTitle().equals(title)) {
                    return song;
                }
            }
            return null;
        }

        public ex45Song findSong(int trackNumber) {
            if (trackNumber >= 1 && trackNumber <= songs.size()) {
                return songs.get(trackNumber - 1);
            }
            return null;
        }
    }
}