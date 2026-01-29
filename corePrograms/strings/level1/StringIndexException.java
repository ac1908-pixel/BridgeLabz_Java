package corePrograms.strings.level1;

import java.util.Scanner;

/*
 Program to demonstrate StringIndexOutOfBoundsException
*/
class StringIndexException {

    // method to generate exception
    public static void generateException(String text) {
        text.charAt(text.length());
    }

    // method to handle exception
    public static void handleException(String text) {
        try {
            text.charAt(text.length());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled");
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

