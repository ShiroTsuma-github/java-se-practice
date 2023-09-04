package pl.globallogic.exercises;

import java.util.ArrayList;
import java.util.LinkedList;

public class ex45Album {

    String name;
    String artist;
    ex45Song[] songs;

public ex45Album(String name, String artist) {
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

    public boolean addToPlayList(String title, LinkedList<ex45Song> playList) {
        ex45Song song = findSong(title);
        if (song != null) {
            playList.add(song);
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        ArrayList<ex45Album> albums = new ArrayList<>();

        ex45Album album = new ex45Album("Stormbringer", "Deep Purple");
        album.addSong(new ex45Song("Stormbringer", 4.6));
        album.addSong(new ex45Song("Love don't mean a thing", 4.22));
        album.addSong(new ex45Song("Holy man", 4.3));
        album.addSong(new ex45Song("Hold on", 5.6));
        album.addSong(new ex45Song("Lady double dealer", 3.21));
        album.addSong(new ex45Song("You can't do it right", 6.23));
        album.addSong(new ex45Song("High ball shooter", 4.27));
        album.addSong(new ex45Song("The gypsy", 4.2));
        album.addSong(new ex45Song("Soldier of fortune", 3.13));
        albums.add(album);

        album = new ex45Album("For those about to rock", "AC/DC");
        album.addSong(new ex45Song("For those about to rock", 5.44));
        album.addSong(new ex45Song("I put the finger on you", 3.25));
        album.addSong(new ex45Song("Lets go", 3.45));
        album.addSong(new ex45Song("Inject the venom", 3.33));
        album.addSong(new ex45Song("Snowballed", 4.51));
        album.addSong(new ex45Song("Evil walks", 3.45));
        album.addSong(new ex45Song("C.O.D.", 5.25));
        album.addSong(new ex45Song("Breaking the rules", 5.32));
        album.addSong(new ex45Song("Night of the long knives", 5.12));
        albums.add(album);

        LinkedList<ex45Song> playList = new LinkedList<ex45Song>();

        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(0).addToPlayList("Speed king", playList);  // Does not exist
        System.out.println(playList);
    }

}
