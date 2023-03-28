
package com.aslihanhsr.musicStore;

public class Main {
    public static void main(String[] args) {
        Singer singer1 = new Singer("Can Bonomo");

        Album album1 = new Album("Bulunam Gerek", singer1, "2014");

        Song song1 = new Song("Dem", singer1, 3.13, 40, album1);
        Song song2 = new Song("Kaçak", singer1, 2.44, 35, album1);
        Song song3 = new Song("Tastamam", singer1, 4.18, 70, album1);
        Song song4 = new Song("Bahr-i Hazer", singer1, 3.28, 60, album1);
        Song song5 = new Song("Hikayem Bitmedi", singer1, 3.04, 45, album1);

        Singer singer2 = new Singer("Hayko Cepkin");
        Song song6 = new Song("Ölüyorum", singer2, 3.41, 100);

        album1.addSong(song1);
        album1.addSong(song2);
        album1.addSong(song3);
        album1.addSong(song4);
        album1.addSong(song5);

        User user1 = new User("aslihan", "asli123", "aslihan_hasar@hotmail.com");
        MusicCart cart = new MusicCart(user1);

        cart.addAlbumToCart(album1);
        cart.addSongToCart(song6);
        cart.calculateTotalPrice();
        System.out.println(cart);

        cart.removeAlbumFromCart(album1);
        cart.calculateTotalPrice();
        System.out.println(cart);

        cart.removeSongFromCart(song6);
        cart.calculateTotalPrice();
        System.out.println(cart);
    }
}

