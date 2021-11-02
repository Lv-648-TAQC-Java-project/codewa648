package com.org.ita.utils;

import java.util.Scanner;

public class ConsoleScanner {
    private final Scanner sc = new Scanner(System.in) ;

    public long readLong(){
        long input = -1;
        try {
            input = sc.nextLong();
        } catch (IllegalArgumentException e){
            sc.next();
            System.err.println("Wrong input!");
        }
        return input;
    }
    public float readFloat(){
        float input = -1;
        try {
            input = sc.nextFloat();
        } catch (IllegalArgumentException e){
            sc.next();
            System.err.println("Wrong input!");
        }
        return input;
    }
}
