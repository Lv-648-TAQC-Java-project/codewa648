package com.org.ita.utils;

import com.org.ita.kata.Eight;
import com.org.ita.kata.Five;
import com.org.ita.kata.Seven;
import com.org.ita.kata.Six;

import java.util.Scanner;

public class Runner {

    private final ConsoleScanner cs = new ConsoleScanner();

    private Users user;

    void setUserImpl(Users user) {
        this.user = user;
    }

    public void runMpgToKpm() {
        float input = cs.readFloat();
        float result = user.getEigth().mpgToKPM(input);
        System.out.println("Result: "+ result);
    }
}
