package com.itschool;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashSet;

public class Users
{
    ArrayList<User> users;
    HashSet<String> logins;

    public Users() {
        users = new ArrayList<>();
        logins = new HashSet<>();
    }

    public boolean Add(@NotNull User user)
    {
        boolean result = false;

        int size = logins.size();
        logins.add(user.loginPassword.login);

        logins.add(user.loginPassword.login);
        if (logins.size() > size)
        {
            users.add(user);
            result = true;
        }
        else
            logins.remove(size);

        return result;
    }
}
