package com.praktikum.Users;

public abstract class User {
    protected String username;
    protected String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public abstract boolean login(String inputUsername, String inputPassword);

    public abstract void displayAppMenu();
}