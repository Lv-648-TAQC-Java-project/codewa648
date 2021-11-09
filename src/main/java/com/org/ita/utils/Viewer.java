package com.org.ita.utils;

public class Viewer {

    public void chooseId(String middleMessage, String endMessage) {
        System.out.println("\nChoose id of " + middleMessage + " or type 0 to exit " + endMessage + ":");
    }

    public void inputError() {
        System.err.println("Wrong input!");
    }

    public void allPoints(int startId, String[] messages) {
        for (String message : messages) {
            System.out.print(startId++ + " - " + message + "\n");
        }
    }

    public void input(String type, String message) {
        System.out.println("Enter " + type + " (" + message + "):");
    }

    public void output(String result, String message) {
        System.out.println("Result:" + result + "\n(" + message + ")\n");
    }

    public void printUser(Users user) {
        System.out.println("This is implementation of " + user.getName());
    }
}
