package corePrograms.javaControlflow.level2;

import java.util.Scanner;

/*
 Program to find greatest factor
 excluding the number itself
*/
class GreatestFactor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int greatestFactor = 1;

        // loop from number-1 to 1
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }

        System.out.println("Greatest Factor is " + greatestFactor);
    }
}
