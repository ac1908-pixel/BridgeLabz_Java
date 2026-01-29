package corePrograms.strings.level2;

import java.util.Scanner;

/*
 Program to find length of string without using length()
*/
class StringLengthFinder {

    // method to find length using exception handling
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        System.out.println("Custom Length = " + findLength(text));
        System.out.println("Built-in Length = " + text.length());
    }
}

