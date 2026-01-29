package corePrograms.javaControlflow.level1;

/*
 Program to print multiplication table
 from 6 to 9
*/
import java.util.Scanner;

class MultiplicationTable {

    // main method starts execution
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // for loop for table
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}

