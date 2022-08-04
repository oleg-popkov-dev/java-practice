package Lombok.objects;

import Lombok.interfaces.IPlaylist;
import Lombok.interfaces.ISong;

import java.util.ArrayList;

public class Playlist implements IPlaylist {

    private ArrayList<ISong> songList = new ArrayList<>();

    @Override
    public ArrayList<ISong> getSongList() {
        return songList;
    }


    public void setSongList(ArrayList<ISong> songList) {
        this.songList = songList;
    }

    @Override
    public void addSong(ISong song) {
        songList.add(song);
    }

    @Override
    public void playAllSong() {
        for (ISong song : songList) {
            song.play();
        }
    }
}