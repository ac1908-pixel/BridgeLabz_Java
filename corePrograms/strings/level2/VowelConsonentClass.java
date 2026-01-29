package corePrograms.strings.level2;

import java.util.Scanner;

/*
 Program to count vowels and consonants
*/
class VowelConsonentClass {

    // method to classify character
    public static int checkChar(char c) {
        if (c >= 'A' && c <= 'Z')
            c = (char)(c + 32);

        if (c >= 'a' && c <= 'z') {
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                return 1;
            else
                return 2;
        }
        return 0;
    }

    // method to count vowels & consonants
    public static int[] countVC(String text) {
        int v = 0, c = 0;
        for (int i = 0; i < text.length(); i++) {
            int r = checkChar(text.charAt(i));
            if (r == 1) v++;
            if (r == 2) c++;
        }
        return new int[]{v, c};
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int[] res = countVC(text);
        System.out.println("Vowels = " + res[0]);
        System.out.println("Consonants = " + res[1]);
    }
}

