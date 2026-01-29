package corePrograms.strings.level2;

import java.util.Scanner;

/*
 Program to return words and their lengths
*/
class WordLengthCompare {

    // method to find length
    public static int findLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    // method to split words
    public static String[] splitWords(String text) {
        int len = findLength(text);
        int wc = 1;

        for (int i = 0; i < len; i++)
            if (text.charAt(i) == ' ')
                wc++;

        String[] words = new String[wc];
        int start = 0, idx = 0;

        for (int i = 0; i <= len; i++) {
            if (i == len || text.charAt(i) == ' ') {
                String w = "";
                for (int j = start; j < i; j++)
                    w += text.charAt(j);
                words[idx++] = w;
                start = i + 1;
            }
        }
        return words;
    }

    // method to create 2D array
    public static String[][] wordLengthArray(String[] words) {
        String[][] data = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            data[i][1] = String.valueOf(findLength(words[i]));
        }
        return data;
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] table = wordLengthArray(words);

        for (int i = 0; i < table.length; i++)
            System.out.println(table[i][0] + "\t" + Integer.parseInt(table[i][1]));
    }
}
