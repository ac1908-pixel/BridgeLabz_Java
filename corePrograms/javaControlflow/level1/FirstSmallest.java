package corePrograms.javaControlflow.level1;

/*
 Program to check whether the first
 number is the smallest
*/
import java.util.Scanner;

class FirstSmallest {

    // main method starts execution
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        boolean isSmallest = (number1 < number2 && number1 < number3);

        System.out.println("Is the first number the smallest? " + isSmallest);
    }
}

