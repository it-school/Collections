package com.itschool;

public class Main {

    public static void main(String[] args) {
        Users users = new Users();
        User user1 = new User("user1", new Authentification("user1", "passw1"));
        users.add(user1);
        users.add(new User("user2", new Authentification("user2", "passw2")));
        users.add(new User("user3", new Authentification("user3", "passw3")));

        for (User user : users.getUsers()) {
            System.out.println(user);
        }

        if (users.getUsers().contains(new User("user1", new Authentification("user1", "passw1")))) {
            System.out.println("Contains!!!");
        }
        users.getUsers().remove(user1);


        for (final User user : users.getUsers()) {
            System.out.println(user);
        }
    }
}
