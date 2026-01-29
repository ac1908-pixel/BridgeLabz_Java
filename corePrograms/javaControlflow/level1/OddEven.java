package corePrograms.javaControlflow.level1;

/*
 Program to print odd and even numbers
*/
import java.util.Scanner;

class OddEven {

    // main method starts execution
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // for loop to check odd/even
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is Even");
            } else {
                System.out.println(i + " is Odd");
            }
        }
    }
}

