package pl.globallogic.exercises;

public class ex45Playlist {

    String name;
    String artist;
    ex45Song[] songs;

public ex45Playlist(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ex45Song[0];
    }

    public boolean addSong(ex45Song song) {
        ex45Song[] newSongs = new ex45Song[this.songs.length + 1];
        System.arraycopy(this.songs, 0, newSongs, 0, this.songs.length);
        newSongs[this.songs.length] = song;
        this.songs = newSongs;
        return this.songs[this.songs.length - 1] == song;
    }

    public ex45Song findSong(String title) {
        for (ex45Song song : this.songs) {
            if (song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }
}
