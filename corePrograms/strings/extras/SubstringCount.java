package corePrograms.strings.extras;

import java.util.Scanner;

/*
 Program to count substring occurrences
*/
class SubstringCount {

    // method to count occurrences
    public static int countOccurrences(String text, String sub) {
        int count = 0;

        // loop through text
        for (int i = 0; i <= text.length() - sub.length(); i++) {
            int j;
            for (j = 0; j < sub.length(); j++) {
                if (text.charAt(i + j) != sub.charAt(j))
                    break;
            }
            if (j == sub.length())
                count++;
        }
        return count;
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String sub = sc.nextLine();

        System.out.println("Occurrences: " + countOccurrences(text, sub));
    }
}

