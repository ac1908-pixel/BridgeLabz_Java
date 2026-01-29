package corePrograms.javaProgrammingelements.level2;

/*
 Program to swap two numbers
*/
import java.util.Scanner;

class SwapNumbers {

    // main method starts execution
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1 = input.nextInt();
        int number2 = input.nextInt();

        int temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println(
                "The swapped numbers are " + number1 + " and " + number2
        );
    }
}
