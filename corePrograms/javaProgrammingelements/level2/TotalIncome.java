package corePrograms.javaProgrammingelements.level2;

/*
 Program to calculate total income
*/
import java.util.Scanner;

class TotalIncome {

    // main method starts execution
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double salary = input.nextDouble();
        double bonus = input.nextDouble();

        double totalIncome = salary + bonus;

        System.out.println(
                "The salary is INR " + salary +
                        " and bonus is INR " + bonus +
                        ". Hence Total Income is INR " + totalIncome
        );
    }
}

