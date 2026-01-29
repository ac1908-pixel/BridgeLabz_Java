package corePrograms.strings.level1;

import java.util.Scanner;

/*
 Program to demonstrate ArrayIndexOutOfBoundsException
*/
class ArrayIndexDemo {

    // method to generate exception
    public static void generateException(String[] names) {
        System.out.println(names[names.length]);
    }

    // method to handle exception
    public static void handleException(String[] names) {
        try {
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[3];

        for (int i = 0; i < 3; i++)
            names[i] = sc.next();

        // generateException(names);
        handleException(names);
    }
}

