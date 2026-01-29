package corePrograms.strings.extras;
import java.util.Scanner;

/*
 Program to toggle case of characters
*/
class ToggleCase {

    // method to toggle case
    public static String toggle(String text) {
        String result = "";

        // loop through characters
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z')
                result += (char)(ch + 32);
            else if (ch >= 'a' && ch <= 'z')
                result += (char)(ch - 32);
            else
                result += ch;
        }
        return result;
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        System.out.println("Toggled String: " + toggle(text));
    }
}
