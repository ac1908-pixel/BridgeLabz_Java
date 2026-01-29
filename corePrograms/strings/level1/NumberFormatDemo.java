package corePrograms.strings.level1;

import java.util.Scanner;

/*
 Program to demonstrate NumberFormatException
*/
class NumberFormatDemo {

    // method to generate exception
    public static void generateException(String text) {
        Integer.parseInt(text);
    }

    // method to handle exception
    public static void handleException(String text) {
        try {
            Integer.parseInt(text);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled");
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

