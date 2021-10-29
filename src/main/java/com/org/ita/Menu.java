package com.org.ita;

import com.org.ita.kata.Eight;
import com.org.ita.kata.Five;
import com.org.ita.kata.Seven;
import com.org.ita.kata.Six;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    static Five impl_five;
    static Six impl_six;
    static Seven impl_seven;
    static Eight impl_eigth;
    static boolean not_null = false;
    Scanner sc;

    public void run() {
        sc = new Scanner(System.in);
        while (true) {
            System.out.println("Choose implementation:");
            System.out.println("1-andrij66 \n2-AndriyBarskyi");
            String pos = sc.nextLine();//try catch
            boolean exit = false;
            switch (pos) {
                case "0":
                    exit = true;
                    break;
                case "1":
                    impl_five = new com.org.ita.kata.implementation.andriy66.Five();
                    impl_six = new com.org.ita.kata.implementation.andriy66.Six();
                    impl_seven = new com.org.ita.kata.implementation.andriy66.Seven();
                    impl_eigth = new com.org.ita.kata.implementation.andriy66.Eigth();
                    not_null = true;
                    break;
                case "2":
                    impl_five = new com.org.ita.kata.implementation.AndriyBarskyi.Five();
                    impl_six = new com.org.ita.kata.implementation.AndriyBarskyi.Six();
                    impl_seven = new com.org.ita.kata.implementation.AndriyBarskyi.Seven();
                    impl_eigth = new com.org.ita.kata.implementation.AndriyBarskyi.Eigth();
                    not_null = true;
                    break;
                default:
                    System.err.println("Wrong input!");
                    break;
            }
            if (exit) {
                break;
            }
            if (not_null) {
                change_kata();
            }
        }
    }

    private void change_kata() {
        System.out.println("Choose kata:");
        System.out.println("5-Five \n6-Six \n7-Seven\n8-Eigth");
        String pos = sc.nextLine();//try catch
        boolean exit = false;
        int pos1 = 0;
        switch (pos) {
            case "0":
                exit = true;
                break;
            case "5":
                choose_five();
                break;
            case "6":
                choose_six();
                break;
            case "7":
                choose_seven();
                break;
            case "8":
                choose_eigth();
                break;
            default:
                System.err.println("Wrong input!");
                break;
        }
        if (!exit) {
            change_kata();
        }
    }

    private void choose_five() {
        System.out.println("Choose task to run:");
        System.out.println("1-artificialRain \n2-gap");
        String pos = sc.nextLine();
        String result = "";
        boolean exit = false;
        switch (pos) {
            case "0":
                exit = true;
                break;
            case "1":
                result = "" + impl_five.artificialRain(new int[]{4, 2, 3, 3, 2});
                break;
            case "2":
                result = Arrays.toString(impl_five.gap(4, 100, 110));
                break;
            default:
                System.err.println("Wrong input!");
                break;
        }
        if (!exit && !result.equals("")) {
            System.out.println("\nResult:\n" + result + "\n");
            choose_five();
        } else {
            choose_five();
        }
    }

    private void choose_six() {
        System.out.println("Choose task to run:");
        System.out.println("1-findNb \n2-f");
        String pos = sc.nextLine();//try catch
        String result = "";
        boolean exit = false;
        switch (pos) {
            case "0":
                exit = true;
                break;
            case "1":
                result = "" + impl_six.findNb(1071225);
                break;
            case "2":
                result = "" + impl_six.f(0.5);
                break;
            default:
                System.err.println("Wrong input!");
                break;
        }
        if (!exit && !result.equals("")) {
            System.out.println("\nResult:\n" + result + "\n");
            choose_six();
        } else {
            choose_five();
        }
    }

    private void choose_seven() {
        System.out.println("Choose task to run:");
        System.out.println("1-newAvg \n2-seriesSum");
        String pos = sc.nextLine();
        String result = "";
        boolean exit = false;
        switch (pos) {
            case "0":
                exit = true;
                break;
            case "1":
                result = "" + impl_seven.newAvg(new double[]{14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 16.0}, 90);
                break;
            case "2":
                result = impl_seven.seriesSum(4);
                break;
            default:
                System.err.println("Wrong input!");
                break;
        }
        if (!exit && !result.equals("")) {
            System.out.println("\nResult:\n" + result + "\n");
            choose_seven();
        } else {
            choose_five();
        }
    }

    private void choose_eigth() {
        System.out.println("Choose task to run:");
        System.out.println("1-sqrt or Wrong input!t sqrt \n2-mpgToKPM");
        String pos = sc.nextLine();
        String result = "";
        boolean exit = false;
        switch (pos) {
            case "0":
                exit = true;
                break;
            case "1":
                result = Arrays.toString(impl_eigth.squareOrSquareRoot(new int[]{4, 3, 9, 7, 2, 1}));
                break;
            case "2":
                result = "" + impl_eigth.mpgToKPM(15);
                break;
            default:
                System.err.println("Wrong input!");
                break;
        }
        if (!exit && !result.equals("")) {
            System.out.println("\nResult:\n" + result + "\n");
            choose_eigth();
        } else {
            choose_five();
        }
    }
}
