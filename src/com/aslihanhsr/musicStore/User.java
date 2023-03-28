package com.aslihanhsr.musicStore;

public class User {
    private String userName;
    private String password;
    private String email;
    private MusicCart cart;

    public User(String userName, String password, String email) {
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public MusicCart getCart() {
        return cart;
    }

    public void setCart(MusicCart cart) {
        this.cart = cart;
    }

    @Override
    public String toString() {
        return "****** User Information ******" + '\n' +
                "User Name = " + userName + '\n' +
                "Password = " + password + '\n' +
                "email = " + email + '\n';
    }
}
