package com.aslihanhsr.musicStore;

public class Singer {
    private final String name;
    private Album album;

    public Singer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
}
