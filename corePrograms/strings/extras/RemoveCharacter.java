package corePrograms.strings.extras;

import java.util.Scanner;

/*
 Program to remove a specific character
*/
class RemoveCharacter {

    // method to remove character
    public static String removeChar(String text, char ch) {
        String result = "";

        for (int i = 0; i < text.length(); i++)
            if (text.charAt(i) != ch)
                result += text.charAt(i);

        return result;
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char ch = sc.next().charAt(0);

        System.out.println("Modified String: " + removeChar(text, ch));
    }
}

