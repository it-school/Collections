package com.itschool;

import org.jetbrains.annotations.NotNull;

public class User {
    String name;
    Authentification loginPassword;

    public User() {
        this.name = "user";
        this.loginPassword = new Authentification("user", "password");
    }

    public User(String name, Authentification loginPassword) {
        this.name = name;
        this.loginPassword = loginPassword;
    }

    @NotNull
    @Override
    public String toString() {
        return this.name + "("+ this.loginPassword.login+ ", "+this.loginPassword.password +")";
    }
}
