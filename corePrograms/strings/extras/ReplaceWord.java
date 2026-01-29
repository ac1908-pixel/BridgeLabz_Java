package corePrograms.strings.extras;

import java.util.Scanner;

/*
 Program to replace a word in a sentence
*/
class ReplaceWord {

    // method to replace word
    public static String replace(String sentence, String oldWord, String newWord) {
        String result = "";
        String word = "";

        for (int i = 0; i <= sentence.length(); i++) {
            if (i == sentence.length() || sentence.charAt(i) == ' ') {
                if (word.equals(oldWord))
                    result += newWord;
                else
                    result += word;

                if (i < sentence.length())
                    result += " ";
                word = "";
            } else {
                word += sentence.charAt(i);
            }
        }
        return result;
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String oldWord = sc.next();
        String newWord = sc.next();

        System.out.println("Modified Sentence: " + replace(sentence, oldWord, newWord));
    }
}
