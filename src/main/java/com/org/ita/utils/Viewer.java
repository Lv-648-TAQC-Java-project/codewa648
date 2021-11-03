package com.org.ita.utils;

public class Viewer {

	public void chooseId(String middleMessage, String endMessage) {
        System.out.println("Choose id of " + middleMessage + " or type 0 for exit " + endMessage + ":");
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
}
