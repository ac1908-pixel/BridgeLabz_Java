package corePrograms.strings.extras;

import java.util.Scanner;

/*
 Program to check palindrome string
*/
class PalindromeString {

    // method to check palindrome
    public static boolean isPalindrome(String text) {
        int start = 0;
        int end = text.length() - 1;

        // compare characters from both ends
        while (start < end) {
            if (text.charAt(start) != text.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        System.out.println("Palindrome: " + isPalindrome(text));
    }
}

