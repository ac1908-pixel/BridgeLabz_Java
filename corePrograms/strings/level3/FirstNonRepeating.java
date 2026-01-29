package corePrograms.strings.level3;

import java.util.Scanner;

/*
 Program to find first non-repeating character
*/
class FirstNonRepeating {

    // method to find first non-repeating
    public static char findFirst(String text) {
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++)
            freq[text.charAt(i)]++;

        for (int i = 0; i < text.length(); i++)
            if (freq[text.charAt(i)] == 1)
                return text.charAt(i);

        return '\0';
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        System.out.println(findFirst(text));
    }
}

