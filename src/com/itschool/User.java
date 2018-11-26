package com.itschool;

import org.jetbrains.annotations.NotNull;

/**
 * Stores information about user
 */
class User {
    final Authentification loginPassword;
    private final String name;

    User(String name, Authentification loginPassword) {
        this.name = name;
        this.loginPassword = loginPassword;
    }

    @NotNull
    @Override
    public String toString() {
        return this.name + "(" + this.loginPassword.login + ", " + this.loginPassword.password + ")";
    }
}
