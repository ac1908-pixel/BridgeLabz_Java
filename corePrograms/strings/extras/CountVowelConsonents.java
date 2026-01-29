package corePrograms.strings.extras;

import java.util.Scanner;

/*
 Program to count vowels and consonants in a string
*/
class CountVowelConsonents {

    // method to count vowels and consonants
    public static int[] countVowelsConsonants(String text) {
        int vowels = 0, consonants = 0;

        // loop through characters
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // convert uppercase to lowercase
            if (ch >= 'A' && ch <= 'Z')
                ch = (char)(ch + 32);

            // check alphabet
            if (ch >= 'a' && ch <= 'z') {
                if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                    vowels++;
                else
                    consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int[] result = countVowelsConsonants(text);
        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);
    }
}
