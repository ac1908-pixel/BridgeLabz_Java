package corePrograms.strings.extras;

import java.util.Scanner;

/*
 Program to find longest word in a sentence
*/
class LongestWord {

    // method to find longest word
    public static String findLongest(String sentence) {
        String word = "", longest = "";

        // loop through sentence
        for (int i = 0; i <= sentence.length(); i++) {
            if (i == sentence.length() || sentence.charAt(i) == ' ') {
                if (word.length() > longest.length())
                    longest = word;
                word = "";
            } else {
                word += sentence.charAt(i);
            }
        }
        return longest;
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        System.out.println("Longest Word: " + findLongest(sentence));
    }
}

