package com.org.ita.utils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ConsoleScanner {
    private final Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    private final Viewer view;

    public ConsoleScanner(Viewer view) {
        this.view = view;
    }

    public int readInt() {
        int input = -1;
        try {
            input = sc.nextInt();
        } catch (InputMismatchException e) {
            sc.nextLine();
            view.inputError();
            return readInt();
        }
        sc.nextLine();
        return input;
    }

    public long readLong() {
        long input = -1;
        try {
            input = sc.nextLong();
        } catch (InputMismatchException e) {
            sc.nextLine();
            view.inputError();
            return readLong();
        }
        sc.nextLine();
        return input;
    }

    public float readFloat() {
        float input = -1.0f;
        try {
            input = sc.nextFloat();
        } catch (InputMismatchException e) {
            sc.nextLine();
            view.inputError();
            return readFloat();
        }
        sc.nextLine();
        return input;
    }

    public double readDouble() {
        double input = -1.0;
        try {
            input = sc.nextDouble();
        } catch (InputMismatchException e) {
            sc.nextLine();
            view.inputError();
            return readDouble();
        }
        sc.nextLine();
        return input;
    }

    public String readLine() {
        String input = "";
        input = sc.nextLine();
        return input;
    }

    public BigInteger readBigInteger() {
        BigInteger input = BigInteger.valueOf(-1);
        try {
            input = sc.nextBigInteger();
        } catch (InputMismatchException e) {
            sc.nextLine();
            view.inputError();
            return readBigInteger();
        }
        sc.nextLine();
        return input;
    }

    public BigDecimal readBigDecimal() {
        BigDecimal input = BigDecimal.ZERO;
        try {
            input = sc.nextBigDecimal();
        } catch (InputMismatchException e) {
            sc.nextLine();
            view.inputError();
            return readBigDecimal();
        }
        sc.nextLine();
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
        } catch (NumberFormatException e) {
            view.inputError();
            return readArrayInt();
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
        } catch (NumberFormatException e) {
            view.inputError();
            return readArrayDouble();
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
