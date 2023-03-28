package com.aslihanhsr.musicStore;

import java.util.ArrayList;

public class Album {
    private final String name;
    private final Singer singer;
    private ArrayList<Song> songs;
    private final String releaseYear;


    public Album(String name, Singer singer, String releaseYear) {
        this.name = name;
        this.singer = singer;
        this.releaseYear = releaseYear;
        this.songs = new ArrayList<>();
        singer.setAlbum(this);
    }

    public String getName() {
        return name;
    }

    public Singer getSinger() {
        return singer;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(Song song) {
        songs.remove(song);
    }

    public double calculateAlbumPrice() {
        double albumPrice = 0;
        for (Song s : songs) {
            albumPrice += s.getPrice();
        }
        return albumPrice;
    }

    @Override
    public String toString() {
        return "\n****** Album Information ******" + '\n' +
                "Album Name = " + name + '\n' +
                "Singer Name = " + singer.getName() + '\n' +
                "Release Year = " + releaseYear + '\n' + '\n' +
                "****** Album Songs ****** " + '\n' + songs.toString() + '\n' + '\n' +
                "Total Album Price = " + calculateAlbumPrice() + '\n' + "₺";
    }
}
