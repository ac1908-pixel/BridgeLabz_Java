package corePrograms.strings.extras;

import java.util.Scanner;

/*
 Program to find most frequent character
*/
class MostFrequentChar {

    // method to find most frequent character
    public static char mostFrequent(String text) {
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++)
            freq[text.charAt(i)]++;

        int max = 0;
        char result = ' ';

        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] > max) {
                max = freq[text.charAt(i)];
                result = text.charAt(i);
            }
        }
        return result;
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        System.out.println("Most Frequent Character: " + mostFrequent(text));
    }
}
