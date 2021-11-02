package com.org.ita.utils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.StringTokenizer;

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
    public BigInteger readBigInteger() {
        BigInteger input = BigInteger.valueOf(-1);
        try {
            input = sc.nextBigInteger();
        } catch (InputMismatchException e) {
            sc.next();
            System.err.println("Wrong input!");
        }
        return input;
    }

    public BigDecimal readBigDecimal() {
        BigDecimal input = BigDecimal.ZERO;
        try {
            input = sc.nextBigDecimal();
        } catch (InputMismatchException e) {
            sc.next();
            System.err.println("Wrong input!");
        }
        return input;
    }

    public int[] readArrayInt() {
        String input = sc.nextLine();
        StringTokenizer st = new StringTokenizer(input, ",");
        int[] output = new int[st.countTokens()];
        try {
            for (int i = 0; i < output.length; i++) {
                output[i] = Integer.parseInt(st.nextToken());
            }
        } catch (InputMismatchException e) {
            System.err.println("Wrong input!");
        }
        return output;
    }

    public double[] readArrayDouble() {
        String input = sc.nextLine();
        StringTokenizer st = new StringTokenizer(input, ",");
        double[] output = new double[st.countTokens()];
        try {
            for (int i = 0; i < output.length; i++) {
                output[i] = Double.parseDouble(st.nextToken());
            }
        } catch (InputMismatchException e) {
            System.err.println("Wrong input!");
        }
        return output;
    }

    public String[] readArrayString() {
        String input = sc.nextLine();
        StringTokenizer st = new StringTokenizer(input, ",");
        String[] output = new String[st.countTokens()];
        for (int i = 0; i < output.length; i++) {
            output[i] = st.nextToken();
        }
        return output;
    }
    
}
