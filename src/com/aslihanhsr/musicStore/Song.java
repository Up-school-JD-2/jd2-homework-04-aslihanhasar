package com.aslihanhsr.musicStore;

public class Song {
    private final String songName;
    private Album album;
    private final Singer singer;
    private final double duration;
    private double price;

    public Song(String songName, Singer singer, double duration, double price) {
        this.songName = songName;
        this.singer = singer;
        this.duration = duration;
        this.price = price;
    }

    public Song(String songName, Singer singer, double duration, double price, Album album) {
        this(songName, singer, duration, price);
        this.album = album;
    }


    public String getSongName() {
        return songName;
    }


    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Singer getSinger() {
        return singer;
    }

    public double getDuration() {
        return duration;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nSong Name = " + songName + '\n' +
                "Singer Name = " + singer.getName() + '\n' +
                "Song Duration = " + duration + '\n' +
                "Song Price = " + price + "₺" + '\n' +
                "*******************************";
    }
}
