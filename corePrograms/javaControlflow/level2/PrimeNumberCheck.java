package corePrograms.javaControlflow.level2;

import java.util.Scanner;

/*
 Program to check whether a number
 is Prime or not
*/
class PrimeNumberCheck {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            // loop to check divisibility
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        System.out.println(isPrime ? "Prime Number" : "Not a Prime Number");
    }
}

