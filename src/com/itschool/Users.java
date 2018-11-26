package com.itschool;

import java.util.ArrayList;
import java.util.HashSet;

class Users {
    private final ArrayList<User> users;
    private final HashSet<String> logins;

    Users() {
        users = new ArrayList<>();
        logins = new HashSet<>();
    }

    ArrayList<User> getUsers() {
        return users;
    }

    @SuppressWarnings({"SuspiciousMethodCalls", "UnusedReturnValue"})
    boolean add(User user) {
        boolean result = false;

        int size = logins.size();
        logins.add(user.loginPassword.login);

        logins.add(user.loginPassword.login);
        if (logins.size() > size) {
            users.add(user);
            result = true;
        } else {
            logins.remove(size);
        }
        return result;
    }
}
