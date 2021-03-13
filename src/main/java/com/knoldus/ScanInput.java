package com.knoldus;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScanInput {

    Scanner scanner = new Scanner(System.in);

    public int scanUserInput() {
        //int num = 0;
        try {
            System.out.println("Enter a number");
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid integer " + e);
            throw new InputMismatchException();
        }
    }
}