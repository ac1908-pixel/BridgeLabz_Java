package corePrograms.strings.level1;

import java.util.Scanner;

/*
 Program to create substring using charAt() and substring()
*/
class SubstringCompare {

    // method to create substring using charAt()
    public static String substringUsingCharAt(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++)
            result += text.charAt(i);
        return result;
    }

    // method to compare strings
    public static boolean compareStrings(String a, String b) {
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

        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String custom = substringUsingCharAt(text, start, end);
        String builtin = text.substring(start, end);

        System.out.println("Same = " + compareStrings(custom, builtin));
    }
}

