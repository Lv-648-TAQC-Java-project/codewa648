package com.org.ita.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleScanner {
    private final Scanner sc = new Scanner(System.in) ;

    public int readInt(){
        int input = -1;
        try {
            input = sc.nextInt();
        } catch (InputMismatchException e){
            sc.next();
            System.err.println("Wrong input!");
        }
        return input;
    }
    public long readLong(){
        long input = -1;
        try {
            input = sc.nextLong();
        } catch (InputMismatchException e){
            sc.next();
            System.err.println("Wrong input!");
        }
        return input;
    }
    public float readFloat(){
        float input = -1.0f;
        try {
            input = sc.nextFloat();
        } catch (InputMismatchException e){
            sc.next();
            System.err.println("Wrong input!");
        }
        return input;
    }
    public double readDouble(){
        double input = -1.0;
        try {
            input = sc.nextDouble();
        } catch (InputMismatchException e){
            sc.next();
            System.err.println("Wrong input!");
        }
        return input;
    }
    public String readString(){
    	String input = "";
        String temp;
        while(true){
            input+=sc.nextLine();
            System.out.println("Do you want to add new line? 0-no any-yes");
            temp = sc.nextLine();
            if(temp.equals("0")){
                break;
            }else{
                input+="\n";
            }
        }
    	return input;

    }
    public String readLine(){
        String input = "";
        input = sc.nextLine();
        return input;
    }
    
}
