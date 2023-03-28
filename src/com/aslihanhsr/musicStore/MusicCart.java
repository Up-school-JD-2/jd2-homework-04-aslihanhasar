package com.aslihanhsr.musicStore;


import java.util.ArrayList;

public class MusicCart {
    private ArrayList<Album> albums;
    private ArrayList<Song> songs;
    private User user;

    public MusicCart(User user) {
        this.user = user;
        this.albums = new ArrayList<>();
        this.songs = new ArrayList<>();
        user.setCart(this);
    }

    public void addAlbumToCart(Album album) {
        albums.add(album);
    }

    public void removeAlbumFromCart(Album album) {
        albums.remove(album);
    }

    public void addSongToCart(Song song) {
        songs.add(song);
    }

    public void removeSongFromCart(Song song) {
        songs.remove(song);
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Song s : songs) {
            totalPrice += s.getPrice();
        }
        for (Album a : albums) {
            totalPrice += a.calculateAlbumPrice();
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "--------- Your Music Cart ---------" + '\n' +
                '\n' + user + '\n' +
                "Albums Added to Cart : " + albums + '\n' +
                "Songs Added to Cart : " + songs + '\n' +
                "Total Cart Price = " + calculateTotalPrice() + "₺";
    }
}
