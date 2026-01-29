package corePrograms.strings.extras;

import java.util.Scanner;

/*
 Program to compare strings lexicographically
*/
class LexicographicalCompare {

    // method to compare strings
    public static int compare(String s1, String s2) {
        int len = Math.min(s1.length(), s2.length());

        for (int i = 0; i < len; i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return s1.charAt(i) - s2.charAt(i);
        }
        return s1.length() - s2.length();
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        int result = compare(s1, s2);

        if (result < 0)
            System.out.println(s1 + " comes before " + s2);
        else if (result > 0)
            System.out.println(s1 + " comes after " + s2);
        else
            System.out.println("Both strings are equal");
    }
}

