package com.org.ita.utils;

import com.org.ita.kata.Eight;

public enum Users {
    ANDRIY66(0, "Andrij", new com.org.ita.kata.implementation.andriy66.Eigth()),
    ANDRIJBARSKYI(1, "Andrij Barskyi", new com.org.ita.kata.implementation.AndriyBarskyi.Eigth());

    private final long id;
    private final String name;
    private final Eight eigth;

    Users(long id, String name, Eight eigth) {
        this.id = id;
        this.name = name;
        this.eigth = eigth;
    }

    public String getName() {
        return this.name;
    }

    public Eight getEigth() {
        return this.eigth;
    }

    public static Users getById(long id){
        for (Users user : Users.values()) {
            if(user.id == id){
                return user;
            }
        }
        return null;
    }

    public static void printAllUserName() {
        for (Users user : Users.values()) {
            System.out.println(user.id + " " + user.name);
        }
    }
}
