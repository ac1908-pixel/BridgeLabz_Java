package corePrograms.arrays.level1;

/*
 Program to store numbers and calculate sum
*/
import java.util.Scanner;

class StoreNumbers {

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        // infinite loop
        while (true) {
            System.out.print("Enter a number: ");
            double value = sc.nextDouble();

            if (value <= 0 || index == 10) {
                break;
            }

            numbers[index] = value;
            index++;
        }

        // loop to calculate sum
        for (int i = 0; i < index; i++) {
            total += numbers[i];
            System.out.println(numbers[i]);
        }

        System.out.println("Total = " + total);
    }
}

