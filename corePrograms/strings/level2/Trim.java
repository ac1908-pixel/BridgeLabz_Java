package corePrograms.strings.level2;

import java.util.Scanner;

/*
 Program to trim spaces using charAt()
*/
class Trim {

    // method to find trim indexes
    public static int[] trimIndexes(String text) {
        int start = 0, end = text.length() - 1;

        while (text.charAt(start) == ' ')
            start++;
        while (text.charAt(end) == ' ')
            end--;

        return new int[]{start, end + 1};
    }

    // method to substring using charAt
    public static String substring(String text, int s, int e) {
        String res = "";
        for (int i = s; i < e; i++)
            res += text.charAt(i);
        return res;
    }

    // method to compare strings
    public static boolean compare(String a, String b) {
        if (a.length() != b.length())
            return false;
        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) != b.charAt(i))
                return false;
        return true;
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int[] idx = trimIndexes(text);
        String custom = substring(text, idx[0], idx[1]);
        String builtin = text.trim();

        System.out.println(compare(custom, builtin));
    }
}

