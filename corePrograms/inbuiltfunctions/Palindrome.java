package corePrograms.inbuiltfunctions;

import java.util.Scanner;

/*
 Program to check palindrome
*/
class Palindrome {

    // method to check palindrome
    static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j)
            if (s.charAt(i++) != s.charAt(j--))
                return false;
        return true;
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(isPalindrome(sc.next()) ? "Palindrome" : "Not Palindrome");
    }
}
