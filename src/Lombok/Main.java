package Lombok;

import Lombok.objects.Author;
import Lombok.objects.Playlist;
import Lombok.objects.Song;

public class Main {

    public static void main(String[] args) {

        Author author1 = new Author("Metallica");
        Author author2 = new Author("Linkin Park");
        Author author3 = new Author("Chris Brown");

        Song song1 = new Song("Unforgiven", author1);
        Song song2 = new Song("Unforgiven2", author1);
        Song song3 = new Song("Numb", author2);
        Song song4 = new Song("Gimme that", author3);

        Playlist playlist = new Playlist();
        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.addSong(song3);
        playlist.addSong(song4);

        playlist.playAllSong();
    }
}