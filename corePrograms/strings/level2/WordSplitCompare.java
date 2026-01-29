package corePrograms.strings.level2;

import java.util.Scanner;

/*
 Program to split text into words without using split()
*/
class WordSplitCompare {

    // method to find string length
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    // method to split text into words
    public static String[] splitWords(String text) {
        int len = findLength(text);
        int wordCount = 1;

        for (int i = 0; i < len; i++)
            if (text.charAt(i) == ' ')
                wordCount++;

        String[] words = new String[wordCount];
        int start = 0, index = 0;

        for (int i = 0; i <= len; i++) {
            if (i == len || text.charAt(i) == ' ') {
                String word = "";
                for (int j = start; j < i; j++)
                    word += text.charAt(j);
                words[index++] = word;
                start = i + 1;
            }
        }
        return words;
    }

    // method to compare string arrays
    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++)
            if (!a[i].equals(b[i]))
                return false;

        return true;
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] custom = splitWords(text);
        String[] builtin = text.split(" ");

        System.out.println("Same = " + compareArrays(custom, builtin));
    }
}

