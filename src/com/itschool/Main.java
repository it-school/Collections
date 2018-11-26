package com.itschool;

import org.jetbrains.annotations.NotNull;

import java.util.HashSet;

public class Main {

    public static void main(String[] args)
    {
        @NotNull HashSet<Integer> integers = new HashSet<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);

        for (Integer i: integers)
        {
            System.out.println(i);
        }

        @NotNull Users users = new Users();
        @NotNull User user1 = new User("user1", new Authentification("user1", "passw1"));
        users.Add(user1);
        users.Add(new User("user2", new Authentification("user2", "passw2")));
        users.Add(new User("user3", new Authentification("user3", "passw3")));

        for (User user: users.users)
        {
            System.out.println(user);
        }

        if (users.users.contains(new User("user1", new Authentification("user1", "passw1"))))
            System.out.println("Contains!!!");
        users.users.remove(user1);


        for (User user: users.users)
        {
            System.out.println(user);
        }
    }
}
