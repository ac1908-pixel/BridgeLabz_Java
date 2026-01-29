package objectOrientedProgramming.classandObjects.level2;

/*
 Program to check if a string is a palindrome
*/
class PalindromeChecker {

    // attribute to store text
    String text;

    // constructor
    PalindromeChecker(String text) {
        this.text = text;
    }

    // method to check palindrome
    boolean isPalindrome() {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    // method to display result
    void displayResult() {
        if (isPalindrome())
            System.out.println(text + " is a Palindrome");
        else
            System.out.println(text + " is NOT a Palindrome");
    }

    // main method
    public static void main(String[] args) {
        PalindromeChecker pc = new PalindromeChecker("madam");
        pc.displayResult();
    }
}

