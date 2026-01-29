package corePrograms.strings.extras;
import java.util.Scanner;

/*
 Program to reverse a string
*/
class ReverseString {

    // method to reverse string
    public static String reverse(String text) {
        String rev = "";

        // loop from end to start
        for (int i = text.length() - 1; i >= 0; i--)
            rev += text.charAt(i);

        return rev;
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        System.out.println("Reversed String: " + reverse(text));
    }
}


