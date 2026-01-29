package corePrograms.strings.level1;

import java.util.Scanner;

/*
 Program to compare two strings using charAt() and equals()
*/
class StringCompare {

    // method to compare strings using charAt()
    public static boolean compareUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        for (int i = 0; i < s1.length(); i++)
            if (s1.charAt(i) != s2.charAt(i))
                return false;

        return true;
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        boolean charAtResult = compareUsingCharAt(s1, s2);
        boolean equalsResult = s1.equals(s2);

        System.out.println("charAt() Result = " + charAtResult);
        System.out.println("equals() Result = " + equalsResult);
        System.out.println("Both Same = " + (charAtResult == equalsResult));
    }
}

