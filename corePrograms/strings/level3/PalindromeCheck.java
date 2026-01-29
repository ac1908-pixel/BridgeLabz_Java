package corePrograms.strings.level3;

import java.util.Scanner;

/*
 Program to check palindrome using 3 methods
*/
class PalindromeCheck {

    // logic 1
    public static boolean isPalindromeIterative(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j)
            if (s.charAt(i++) != s.charAt(j--))
                return false;
        return true;
    }

    // logic 2
    public static boolean isPalindromeRecursive(String s, int i, int j) {
        if (i >= j) return true;
        if (s.charAt(i) != s.charAt(j)) return false;
        return isPalindromeRecursive(s, i + 1, j - 1);
    }

    // logic 3
    public static boolean isPalindromeArray(String s) {
        char[] a = s.toCharArray();
        for (int i = 0; i < a.length / 2; i++)
            if (a[i] != a[a.length - 1 - i])
                return false;
        return true;
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        System.out.println(isPalindromeIterative(text));
        System.out.println(isPalindromeRecursive(text, 0, text.length() - 1));
        System.out.println(isPalindromeArray(text));
    }
}

