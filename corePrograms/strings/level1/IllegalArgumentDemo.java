package corePrograms.strings.level1;

import java.util.Scanner;

/*
 Program to demonstrate IllegalArgumentException
*/
class IllegalArgumentDemo {

    // method to generate exception
    public static void generateException(String text) {
        text.substring(5, 2);
    }

    // method to handle exception
    public static void handleException(String text) {
        try {
            text.substring(5, 2);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        // generateException(text);
        handleException(text);
    }
}

