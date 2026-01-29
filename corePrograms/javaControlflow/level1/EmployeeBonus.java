package corePrograms.javaControlflow.level1;

/*
 Program to calculate employee bonus
*/
import java.util.Scanner;

class EmployeeBonus {

    // main method starts execution
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double salary = input.nextDouble();
        int years = input.nextInt();

        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus amount is " + bonus);
        } else {
            System.out.println("No bonus applicable");
        }
    }
}

