package corePrograms.strings.extras;

import java.util.Scanner;

/*
 Program to remove duplicate characters
*/
class RemoveDuplicates {

    // method to remove duplicates
    public static String removeDuplicates(String text) {
        String result = "";

        // loop through text
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean found = false;

            // check if character already exists
            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) == ch) {
                    found = true;
                    break;
                }
            }
            if (!found)
                result += ch;
        }
        return result;
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        System.out.println("Without Duplicates: " + removeDuplicates(text));
    }
}

