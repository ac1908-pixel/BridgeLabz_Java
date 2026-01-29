package corePrograms.strings.level3;

import java.util.Scanner;

/*
 Program to find unique characters
*/
class UniqueCharacters {

    // method to find length
    public static int findLength(String s) {
        int i = 0;
        try { while (true) s.charAt(i++); }
        catch (Exception e) { return i; }
    }

    // method to find unique characters
    public static char[] uniqueChars(String text) {
        int len = findLength(text);
        char[] temp = new char[len];
        int idx = 0;

        for (int i = 0; i < len; i++) {
            char c = text.charAt(i);
            boolean unique = true;

            for (int j = 0; j < i; j++)
                if (text.charAt(j) == c)
                    unique = false;

            if (unique)
                temp[idx++] = c;
        }

        char[] result = new char[idx];
        for (int i = 0; i < idx; i++)
            result[i] = temp[i];

        return result;
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        char[] res = uniqueChars(text);
        for (char c : res)
            System.out.print(c + " ");
    }
}
